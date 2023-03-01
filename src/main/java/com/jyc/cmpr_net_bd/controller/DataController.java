package com.jyc.cmpr_net_bd.controller;

import com.jyc.cmpr_net_bd.client.PredictClient;
import com.jyc.cmpr_net_bd.entity.*;
import com.jyc.cmpr_net_bd.service.*;
import com.jyc.cmpr_net_bd.thrift.*;
import com.jyc.cmpr_net_bd.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/12/26 11:37
 */
@RestController
public class DataController {

    @Resource
    private SymService symService;
    @Resource
    private HerbService herbService;
    @Resource
    private IngredientService ingredientService;
    @Resource
    private DiseaseService diseaseService;
    @Resource
    private TcmSymptomService tcmSymptomService;

    @Autowired
    PredictClient predictClient;

    @GetMapping("/symptom/{keyword}")
    public Result getSymSuggestion(@PathVariable("keyword") String keyword) {
        List<Symptom> keywords = symService.getSymSuggestion(keyword);
        return Result.ofSuccess(keywords);
    }

    @PostMapping("/herbs")
    public Result getHerbsById(@RequestParam("idList") List<String> idList) {
        if (idList.size() == 0)
            return Result.ofFail("2", "Something wrong");
        List<Herb> herbs = herbService.getHerbsById(idList);
        return Result.ofSuccess(herbs);
    }

    @PostMapping("/predict")
    public Result predict(@RequestParam("diseaseId") String diseaseId) {
        PredictRequest req = new PredictRequest(diseaseId);
        PredictResponse res = predictClient.predict(req);
        if (res.code.equals("0")) {
            return Result.ofSuccess(res.result);
        } else {
            return Result.ofFail("2", "Something wrong");
        }
    }

    @PostMapping("/graph")
    public Result getEmbeddingSim(@RequestParam("idList") List<String> idList,
                                  @RequestParam("embedType") String embedType) {
        if (idList.size() == 0) {
            return Result.ofFail("2", "Something wrong");
        }
        GraphRequset req = new GraphRequset(idList, embedType);
        GraphResponse res = predictClient.getGraph(req);
        if (res.code.equals("0")) {
            return Result.ofSuccess(res);
        } else {
            return Result.ofFail("2", "Something wrong");
        }
    }

    @GetMapping("/disease/suggestion/{keyword}")
    public Result getDiseaseSuggestion(@PathVariable("keyword") String keyword) {
        List<Disease> diseases = diseaseService.getDiseaseSuggestion(keyword);
        return Result.ofSuccess(diseases);
    }

    @GetMapping("/tcmSym/{diseaseId}")
    public Result getTcmSymptomsOfDisease(@PathVariable("diseaseId") String diseaseId) {
        List<TcmSymptom> tcmSymptoms = tcmSymptomService.getTcmSymptomsOfDisease(diseaseId);
        return Result.ofSuccess(tcmSymptoms);
    }

    @PostMapping("/scatterData")
    public Result getScatterData(@RequestParam("herbIds") List<String> herbIds) {
        List<Herb> herbs = herbService.getHerbsWithIngredientsById(herbIds);
        List<Ingredient> allIngredients = new ArrayList<>();
        herbs.forEach(herb -> allIngredients.addAll(herb.getIngredients()));
        List<Ingredient> ingredients = allIngredients.stream().collect(
                collectingAndThen(
                        toCollection(
                                () -> new TreeSet<>(comparing(Ingredient::getId))), ArrayList::new
                ));
        List<String> ingredientIds = ingredients.stream().map(Ingredient::getId).collect(Collectors.toList());
        List<Ingredient> ingredientsWithTargets = ingredientService.getIngredientsWithTargetsById(ingredientIds);
        return Result.ofSuccess(ingredientsWithTargets);
    }

    @GetMapping("/disease/{diseaseId}")
    public Result getDisease(@PathVariable("diseaseId") String diseaseId) {
        List<Disease> diseases = diseaseService.getDiseaseWithTargetsById(diseaseId);
        return Result.ofSuccess(diseases);
    }


    @PostMapping("/data/graph")
    public Result getGraph(@RequestParam("targetIds") List<String> targetIds) {
        if (targetIds.size() == 0) {
            return Result.ofFail("2", "No related targets");
        }
        ClusterSetting setting = new ClusterSetting(1, 0.01, "CPM");
        GetClusterRequest req = new GetClusterRequest(setting, targetIds);
        GetClusterResponse res = predictClient.getCluster(req);

        if (res.code.equals("0")) {
            Map<String, List> result = new HashMap<>();
            result.put("ppi", res.getRel());
            result.put("targetCluster", res.getClusterResult());
            return Result.ofSuccess(result);
        } else {
            return Result.ofFail("2", res.getMsg());
        }
    }

    @PostMapping("/enrichment")
    public Result getEnrichment(@RequestParam("targets") List<String> targets,
                                @RequestParam("cutoff") Float cutoff,
                                @RequestParam("geneSet") String geneSet) {
        if (targets.size() == 0) {
            return Result.ofFail("2", "Input id list is empty");
        }
        EnrichmentSetting setting = new EnrichmentSetting(geneSet, cutoff);
        EnrichmentRequest req = new EnrichmentRequest(targets, setting);
        EnrichmentResponse res = predictClient.getEnrichment(req);

        if (res.code.equals("0")) {
            return Result.ofSuccess(res.result);
        } else {
            return Result.ofFail("2", res.getMsg());
        }
    }
}

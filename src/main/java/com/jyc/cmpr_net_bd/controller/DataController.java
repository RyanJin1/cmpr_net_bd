package com.jyc.cmpr_net_bd.controller;

import com.jyc.cmpr_net_bd.client.PredictClient;
import com.jyc.cmpr_net_bd.entity.Herb;
import com.jyc.cmpr_net_bd.entity.Symptom;
import com.jyc.cmpr_net_bd.service.HerbService;
import com.jyc.cmpr_net_bd.service.SymService;
import com.jyc.cmpr_net_bd.thrift.GraphRequset;
import com.jyc.cmpr_net_bd.thrift.GraphResponse;
import com.jyc.cmpr_net_bd.thrift.PredictRequest;
import com.jyc.cmpr_net_bd.thrift.PredictResponse;
import com.jyc.cmpr_net_bd.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    public Result predict(@RequestParam("idList") List<Integer> idList) {
        if (idList.size() == 0)
            return Result.ofFail("2", "Something wrong");
        PredictRequest req = new PredictRequest(idList);
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
}

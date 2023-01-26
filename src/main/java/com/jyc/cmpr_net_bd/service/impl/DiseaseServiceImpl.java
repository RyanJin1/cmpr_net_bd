package com.jyc.cmpr_net_bd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyc.cmpr_net_bd.entity.Disease;
import com.jyc.cmpr_net_bd.entity.Symptom;
import com.jyc.cmpr_net_bd.entity.TcmSymptom;
import com.jyc.cmpr_net_bd.mapper.DiseaseMapper;
import com.jyc.cmpr_net_bd.service.DiseaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2023/1/16 11:13
 */
@Service
public class DiseaseServiceImpl extends ServiceImpl<DiseaseMapper, Disease> implements DiseaseService {
    @Resource
    DiseaseMapper diseaseMapper;

    @Override
    public List<Disease> getDiseaseSuggestion(String keyword) {
        return diseaseMapper.selectList(new QueryWrapper<Disease>().like("disease_name", keyword));
    }

    @Override
    public List<Disease> getDiseaseWithTargetsById(String diseaseId) {
        return diseaseMapper.getDiseaseWithTargetsById(diseaseId);
    }


}

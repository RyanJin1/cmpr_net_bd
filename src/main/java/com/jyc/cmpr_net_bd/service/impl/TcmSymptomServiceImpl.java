package com.jyc.cmpr_net_bd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyc.cmpr_net_bd.entity.Disease;
import com.jyc.cmpr_net_bd.entity.TcmSymptom;
import com.jyc.cmpr_net_bd.mapper.TcmSymptomMapper;
import com.jyc.cmpr_net_bd.service.TcmSymptomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2023/1/16 14:19
 */
@Service
public class TcmSymptomServiceImpl extends ServiceImpl<TcmSymptomMapper, TcmSymptom> implements TcmSymptomService {

    @Resource
    TcmSymptomMapper tcmSymptomMapper;

    @Override
    public List<TcmSymptom> getTcmSymptomsOfDisease(String diseaseId) {
        QueryWrapper<TcmSymptom> wrapper = new QueryWrapper<>();
        String conditionSql = String.format("select tcm_symptom_id from tcm_symptom_to_disease where disease_id='%s'"
                , diseaseId);
        wrapper.inSql("tcm_symptom_id", conditionSql);
        return tcmSymptomMapper.selectList(wrapper);
    }
}

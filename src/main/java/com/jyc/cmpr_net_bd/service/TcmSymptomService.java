package com.jyc.cmpr_net_bd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyc.cmpr_net_bd.entity.Disease;
import com.jyc.cmpr_net_bd.entity.TcmSymptom;

import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2023/1/16 14:18
 */
public interface TcmSymptomService extends IService<TcmSymptom> {
    public List<TcmSymptom> getTcmSymptomsOfDisease(String diseaseId);
}

package com.jyc.cmpr_net_bd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyc.cmpr_net_bd.entity.Disease;

import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2023/1/16 11:06
 */
public interface DiseaseService extends IService<Disease>{
    public List<Disease> getDiseaseSuggestion(String keyword);
}

package com.jyc.cmpr_net_bd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyc.cmpr_net_bd.entity.Disease;

import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2023/1/16 11:13
 */
public interface DiseaseMapper extends BaseMapper<Disease> {
    public List<Disease> getDiseaseSuggestion(String keyword);

    public List<Disease> getDiseaseWithTargetsById(String diseaseId);
}

package com.jyc.cmpr_net_bd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyc.cmpr_net_bd.entity.Ingredient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/12/26 11:30
 */
@Mapper
public interface IngredientMapper extends BaseMapper<Ingredient> {
    public List<Ingredient> getIngredientsWithTargetsById(List<String> idList);
}

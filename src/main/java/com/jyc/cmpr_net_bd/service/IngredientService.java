package com.jyc.cmpr_net_bd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyc.cmpr_net_bd.entity.Ingredient;

import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2023/1/19 14:17
 */
public interface IngredientService extends IService<Ingredient> {
    public List<Ingredient> getIngredientsWithTargetsById(List<String> idList);
}

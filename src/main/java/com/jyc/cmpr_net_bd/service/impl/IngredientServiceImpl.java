package com.jyc.cmpr_net_bd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyc.cmpr_net_bd.entity.Ingredient;
import com.jyc.cmpr_net_bd.mapper.IngredientMapper;
import com.jyc.cmpr_net_bd.service.IngredientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2023/1/19 14:23
 */
@Service
public class IngredientServiceImpl extends ServiceImpl<IngredientMapper, Ingredient> implements IngredientService {
    @Resource
    IngredientMapper ingredientMapper;

    @Override
    public List<Ingredient> getIngredientsWithTargetsById(List<String> idList) {
        return ingredientMapper.getIngredientsWithTargetsById(idList);
    }
}

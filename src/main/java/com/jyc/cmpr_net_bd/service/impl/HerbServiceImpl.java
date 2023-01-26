package com.jyc.cmpr_net_bd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyc.cmpr_net_bd.entity.Herb;
import com.jyc.cmpr_net_bd.mapper.HerbMapper;
import com.jyc.cmpr_net_bd.service.HerbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/12/26 11:45
 */
@Service
public class HerbServiceImpl extends ServiceImpl<HerbMapper, Herb> implements HerbService {
    @Resource
    HerbMapper herbMapper;

    public List<Herb> getHerbsById(List<String> idList) {
        return herbMapper.selectList(new QueryWrapper<Herb>().lambda().in(Herb::getId, idList));
    }

    @Override
    public List<Herb> getHerbsWithIngredientsById(List<String> idList) {
        return herbMapper.getHerbsWithIngredientsById(idList);
    }
}

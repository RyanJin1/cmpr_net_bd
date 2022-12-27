package com.jyc.cmpr_net_bd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jyc.cmpr_net_bd.entity.Symptom;
import com.jyc.cmpr_net_bd.mapper.SymMapper;
import com.jyc.cmpr_net_bd.service.SymService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/12/26 11:33
 */
@Service
public class SymServiceImpl extends ServiceImpl<SymMapper, Symptom> implements SymService {
    @Resource
    SymMapper symMapper;


    @Override
    public List<Symptom> getSymSuggestion(String keyword) {
        return symMapper.selectList(new QueryWrapper<Symptom>().like("sym_name", keyword));
    }
}

package com.jyc.cmpr_net_bd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyc.cmpr_net_bd.entity.Herb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/12/26 11:20
 */
@Mapper
public interface HerbMapper extends BaseMapper<Herb> {
    public List<Herb> getHerbsWithIngredientsById(List<String> idList);
}

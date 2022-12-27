package com.jyc.cmpr_net_bd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jyc.cmpr_net_bd.entity.Symptom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/12/26 11:22
 */
@Mapper
public interface SymMapper extends BaseMapper<Symptom> {
}

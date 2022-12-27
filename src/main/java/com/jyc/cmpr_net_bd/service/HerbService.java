package com.jyc.cmpr_net_bd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyc.cmpr_net_bd.entity.Herb;

import java.util.List;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/12/26 11:31
 */
public interface HerbService extends IService<Herb> {
    public List<Herb> getHerbsById(List<String> idList);
}

package com.ning.infrastructure.persistent.dao;

import com.ning.infrastructure.persistent.po.StrategyPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface IStrategyDao {
    List<StrategyPO> queryStrategyList();
}

package com.ning.infrastructure.persistent.dao;

import com.ning.infrastructure.persistent.po.StrategyAwardPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyAwardDao {
    List<StrategyAwardPO> queryStrategyAwardList();
}

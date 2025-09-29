package com.ning.infrastructure.persistent.dao;

import com.ning.infrastructure.persistent.po.StrategyRulePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyRuleDao {
    List<StrategyRulePO> queryStrategyRuleList();
}

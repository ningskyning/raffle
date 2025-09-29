package com.ning.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;
@Data
public class StrategyRulePO {
    private Long id;
    private Integer strategyId;
    private Integer awardId;
    private Integer ruleType;
    private String ruleDesc;
    private String ruleModel;
    private Integer ruleValue;
    private Date createTime;
    private Date updateTime;
}

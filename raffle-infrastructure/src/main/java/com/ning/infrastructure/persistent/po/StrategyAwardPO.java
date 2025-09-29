package com.ning.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;
@Data
public class StrategyAwardPO {
    private Long id;
    private Integer strategyId;
    private Integer awardId;
    private String awardTitle;
    private String awardSubtitle;
    private String ruleModel;
    private Double rate;
    private Integer sort;
    private Integer awardTotalAmount;
    private Integer awardSurplusAmount;
    private Date createTime;
    private Date updateTime;
}

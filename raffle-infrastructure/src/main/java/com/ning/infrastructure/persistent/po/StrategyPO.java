package com.ning.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;
@Data
public class StrategyPO {
    private Long id;
    private Integer strategyId;
    private String strategyDesc;
    private Date createTime;
    private Date updateTime;
}

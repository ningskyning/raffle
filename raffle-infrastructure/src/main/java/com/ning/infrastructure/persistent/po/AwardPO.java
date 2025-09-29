package com.ning.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * 奖品PO与数据库对应
 */
@Data
public class AwardPO {
    private Long id;
    private Integer awardId;
    private String awardKey;
    private String awardConfig;
    private String awardDesc;
    private Date createTime;
    private Date updateTime;
}

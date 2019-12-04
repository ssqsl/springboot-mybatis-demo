package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

/**
 * Created by zhangjunqi on 2019/3/17 12:15 AM
 **/
@Data
public class CarrierBehaviorDTO {
    private String reportId;
    private String cellMth;
    private int callCnt;
    private String callTime;
    private int callOutCnt;
    private String callOutTime;
    private int callInCnt;
    private String callInTime;
    private int callTfCnt;
    private String callTfTime;
    private String netFlow;
    private String totalAmount;
    private String smsCnt;
    private Date createTime;
}

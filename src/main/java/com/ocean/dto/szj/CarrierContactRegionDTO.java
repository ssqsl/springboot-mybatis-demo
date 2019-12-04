package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

/**
 * Created by zhangjunqi on 2019/3/17 12:17 AM
 **/
@Data
public class CarrierContactRegionDTO {
    private String reportId;
    private String regionProvince;
    private String regionCity;
    private int regionUniqNumCnt;
    private int regionCallInCnt;
    private int regionCallOutCnt;
    private int regionCallTfCnt;
    private int regionCallCnt;
    private String regionCallInTime;
    private String regionCallOutTime;
    private String regionCallTfTime;
    private String regionCallTime;
    private String regionAvgCallInTime;
    private String regionAvgCallOutTime;
    private String regionCallInCntPct;
    private String regionCallOutCntPct;
    private String regionCallInTimePct;
    private String regionCallOutTimePct;
    private Date createTime;
}

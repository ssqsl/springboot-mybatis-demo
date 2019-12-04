package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

/**
 * Created by zhangjunqi on 2019/3/17 12:15 AM
 **/
@Data
public class CarrierCallListDTO {
    private String dataSource;
    private Date crawlTime;
    private String reportId;
    private String selfPhone;
    private String selfPhoneLocation;
    private String callPlace;
    private String contactPhone;
    private String contactPhoneType;
    private String contactPhonePro;
    private String contactPhoneCity;
    private String startTime;
    private String callDuration;
    private String locationType;
    private String callType;
    private String fee;
    private String contactPhoneLabel;
    private Date createTime;
}

package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

/**
 * Created by zhangjunqi on 2019/3/17 12:14 AM
 **/
@Data
public class CarrierReportDTO {
    private String dataSource;
    private Date crawlTime;
    private String reportId;
    private String phone;
    private String phoneLocationPro;
    private String phoneLocationCity;
    private String carrier;
    private String idCard;
    private String name;
    private String regTime;
    private Date createTime;
}

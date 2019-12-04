package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

@Data
public class CarrierRechargeDTO {

    private Long id;


    private String reportId;


    private String rechargeTime;


    private String amount;


    private String type;


    private Date createTime;


}
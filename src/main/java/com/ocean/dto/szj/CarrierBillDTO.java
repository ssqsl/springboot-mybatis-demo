package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

@Data
public class CarrierBillDTO {

    private Long id;

    private String reportId;


    private String billMonth;


    private String billStartDate;


    private String billEndDate;


    private String baseFee;


    private String extraServiceFee;


    private String voiceFee;


    private String smsFee;


    private String webFee;


    private String extraFee;


    private String totalFee;


    private String discount;


    private String extraDiscount;


    private String actualFee;


    private String paidFee;


    private String unpaidFee;


    private String point;


    private String relatedMobiles;


    private Date createTime;

}
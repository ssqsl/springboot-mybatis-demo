package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

@Data
public class CarrierStatusDTO {

    private Long id;


    private String reportId;


    private String userPackage;


    private String state;


    private String verify;


    private String level;


    private String balance;


    private String carrier;


    private Date createTime;


    private String regName;


    private String regIdcard;



}
package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

@Data
public class CarrierNetDTO {

    private Long id;


    private String reportId;


    private String duration;


    private String location;


    private String subflow;


    private String netType;


    private String serviceName;


    private String fee;


    private String time;


    private Date createTime;

}
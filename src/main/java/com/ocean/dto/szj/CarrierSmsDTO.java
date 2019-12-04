package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

@Data
public class CarrierSmsDTO {

    private Long id;


    private String reportId;


    private String time;


    private String contactPhone;


    private String location;


    private String sendType;


    private String msgType;


    private String serviceName;


    private String fee;


    private Date createTime;

}
package com.ocean.dto.szj;

import lombok.Data;

import java.util.List;

/**
 * Created by zhangjunqi on 2019/3/17 12:12 AM
 **/
@Data
public class SzjSrMCDTO {
    private String id;
    private String idCard;
    private String name;
    private String mobile;
    private String dataSource;
    private String reportId;
    private String error;
    private CarrierReportDTO carrierReport;
    private List<CarrierCallListDTO> carrierCallLists;
    private List<CarrierBehaviorDTO> carrierBehaviors;
    private List<CarrierContactListDTO> carrierContactLists;
    private List<CarrierContactRegionDTO> carrierContactRegions;
    private List<CarrierBillDTO> carrierBills;
    private List<CarrierNetDTO> carrierNets;
    private List<CarrierRechargeDTO> carrierRecharges;
    private List<CarrierSmsDTO> carrierSmss;
    private CarrierStatusDTO carrierStatus;


}

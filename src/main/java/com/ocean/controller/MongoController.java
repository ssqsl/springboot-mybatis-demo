/*
package com.ocean.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ocean.dto.CreditGetDataInfoDTO;
import com.ocean.dto.szj.*;
import com.ocean.service.MongoServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = {"/mongo"})
public class MongoController {

    @Autowired
    MongoServicelmpl mongoServicelmpl;

    @RequestMapping(value = {"/query"})
    public SzjSrMCDTO getData(String id, String collectionName, Date expirDate) {
        CreditGetDataInfoDTO dataInfo = mongoServicelmpl.query(id, CreditGetDataInfoDTO.class, collectionName, true, expirDate);
        String str = String.valueOf(dataInfo.getHttpBody());
        JSONObject respJson = JSONObject.parseObject(str);
        SzjSrMCDTO szjSrMCDTO = new SzjSrMCDTO();

        JSONObject carrierReport = respJson.getJSONObject("t_carrier_report");
        JSONArray carrierContactRegion = respJson.getJSONArray("t_carrier_contact_region");
        JSONArray carrierContactList = respJson.getJSONArray("t_carrier_contact_list");
        JSONArray carrierCalllist = respJson.getJSONArray("t_carrier_calllist");
        JSONArray carrierBehavior = respJson.getJSONArray("t_carrier_behavior");
        JSONArray carrierBill = respJson.getJSONArray("t_carrier_bill");
        JSONArray carrierNet = respJson.getJSONArray("t_carrier_net");
        JSONArray carrierRecharge = respJson.getJSONArray("t_carrier_recharge");
        JSONObject carrierStatus = respJson.getJSONObject("t_carrier_status");
        JSONArray carrierSms = respJson.getJSONArray("t_carrier_sms");

        if (null != carrierReport) {
            CarrierReportDTO carrierReportDTO = carrierReport.toJavaObject(CarrierReportDTO.class);
            szjSrMCDTO.setReportId(carrierReportDTO.getReportId());
            szjSrMCDTO.setCarrierReport(carrierReportDTO);
        }
        if (!CollectionUtils.isEmpty(carrierContactList)) {
            List<CarrierContactListDTO> carrierContactListDtos = carrierContactList.toJavaList(CarrierContactListDTO.class);
            szjSrMCDTO.setCarrierContactLists(carrierContactListDtos);
        }
        if (!CollectionUtils.isEmpty(carrierCalllist)) {
            List<CarrierCallListDTO> carrierCallListDtos = carrierCalllist.toJavaList(CarrierCallListDTO.class);
            szjSrMCDTO.setCarrierCallLists(carrierCallListDtos);
        }
        if (!CollectionUtils.isEmpty(carrierBehavior)) {
            List<CarrierBehaviorDTO> carrierBehaviorDtos = carrierBehavior.toJavaList(CarrierBehaviorDTO.class);
            szjSrMCDTO.setCarrierBehaviors(carrierBehaviorDtos);
        }
        if (!CollectionUtils.isEmpty(carrierContactRegion)) {
            List<CarrierContactRegionDTO> carrierContactRegionDtos = carrierContactRegion.toJavaList(CarrierContactRegionDTO.class);
            szjSrMCDTO.setCarrierContactRegions(carrierContactRegionDtos);
        }
        if(!CollectionUtils.isEmpty(carrierBill)){
            List<CarrierBillDTO> carrierBillDTOS = carrierBill.toJavaList(CarrierBillDTO.class);
            szjSrMCDTO.setCarrierBills(carrierBillDTOS);
        }
        if(!CollectionUtils.isEmpty(carrierNet)){
            List<CarrierNetDTO> carrierNetDTOS = carrierNet.toJavaList(CarrierNetDTO.class);
            szjSrMCDTO.setCarrierNets(carrierNetDTOS);
        }
        if(!CollectionUtils.isEmpty(carrierRecharge)){
            List<CarrierRechargeDTO> carrierRechargeDTOS = carrierRecharge.toJavaList(CarrierRechargeDTO.class);
            szjSrMCDTO.setCarrierRecharges(carrierRechargeDTOS);
        }
        if(!CollectionUtils.isEmpty(carrierSms)){
            List<CarrierSmsDTO> carrierSmsDTOS = carrierSms.toJavaList(CarrierSmsDTO.class);
            szjSrMCDTO.setCarrierSmss(carrierSmsDTOS);
        }
        if(null != carrierStatus){
            String temp = respJson.getJSONObject("t_carrier_status").getString("package");
            CarrierStatusDTO carrierStatusDTO = carrierStatus.toJavaObject(CarrierStatusDTO.class);
            carrierStatusDTO.setUserPackage(temp);
            szjSrMCDTO.setCarrierStatus(carrierStatusDTO);
        }
        return szjSrMCDTO;
    }

}
*/

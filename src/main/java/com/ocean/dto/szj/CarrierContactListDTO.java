package com.ocean.dto.szj;

import lombok.Data;

import java.util.Date;

/**
 * Created by zhangjunqi on 2019/3/17 12:16 AM
 **/
@Data
public class CarrierContactListDTO {
    private String reportId;
    private String contactPhone;
    private String contactPhonePro;
    private String contactPhoneCity;
    private int callCnt;
    private String callLen;
    private int callOutCnt;
    private String callOutLen;
    private int callInCnt;
    private String callInLen;
    private int callTfCnt;
    private String callTfLen;
    private int contact1w;
    private int contactOut1w;
    private int contactIn1w;
    private int contactTf1w;
    private int contact1m;
    private int contactOut1m;
    private int contactIn1m;
    private int contactTf1m;
    private int contact3m;
    private int contactOut3m;
    private int contactIn3m;
    private int contactTf3m;
    private int contact3mPlus;
    private int contactOut3mPlus;
    private int contactIn3mPlus;
    private int contactTf3mPlus;
    private int contactEarlyMorning;
    private int contactOutEarlyMorning;
    private int contactInEarlyMorning;
    private int contactTfEarlyMorning;
    private int contactMorning;
    private int contactOutMorning;
    private int contactInMorning;
    private int contactTfMorning;
    private int contactNoon;
    private int contactOutNoon;
    private int contactInNoon;
    private int contactTfNoon;
    private int contactAfternoon;
    private int contactOutAfternoon;
    private int contactInAfternoon;
    private int contactTfAfternoon;
    private int contactNight;
    private int contactOutNight;
    private int contactInNight;
    private int contactTfNight;
    private String contactAllDay;
    private int contactWeekday;
    private int contactOutWeekday;
    private int contactInWeekday;
    private int contactTfWeekday;
    private int contactWeekend;
    private int contactOutWeekend;
    private int contactInWeekend;
    private int contactTfWeekend;
    private int contactHoliday;
    private int contactOutHoliday;
    private int contactInHoliday;
    private int contactTfHoliday;
    private Date createTime;
}

package com.ocean.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class CreditGetDataInfoDTO <P, R,T> implements Serializable {

    @Id
    private String id;// 主键ID mongo会自动生成

    private Long getConfigElapsedTime;//获取配置文件耗时
    private Long queryDbElapsedTime;//查询数据库耗时
    private Long queryThirdPartElapsedTime;//查询第三方耗时
    private Long resolverElapsedTime;//解析耗时
    private Long insertMysqlElapsedTime;

    private Long totalElapsedTime;

    private String dataFrom;

    private P param;//参数，请求相关的 比如三要素

    private R data;//结果数据

    private Integer httpCode;

    private String httpMsg;

    private T httpBody;

    private String ip;

    private String createTime;// 入库时间
}

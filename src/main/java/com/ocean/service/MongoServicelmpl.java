/*
package com.ocean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

@Service
public class MongoServicelmpl {

    @Autowired
    private MongoTemplate mongoTemplate;

    public  <T> T query(String id, Class<T> entityClass, String collectinName, boolean isSuccessCode, Date expirDate) {
        Criteria criteria = Criteria.where("_id").is(id);
        if (isSuccessCode) {
            criteria.and("data.code").is(0);
        }
//        if (expirDate != null) {
//            String date = DateUtils.formatDate(expirDate, DateUtils.PATTERN_yyyy_MM_dd_HH_mm_ss_sss);
//            criteria.and("createTime").gte(date);
//        }
        List<T> list = mongoTemplate.find(new Query(criteria), entityClass, collectinName);
        if (!CollectionUtils.isEmpty(list)) {
            return list.get(0);
        }

        return null;
    }
}
*/

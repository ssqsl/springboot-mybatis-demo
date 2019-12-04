package com.ocean.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListen {

    private final Logger logger = LoggerFactory.getLogger(KafkaListen.class);

    @KafkaListener(topics = {"${kafka.test.topic}"})
    public void listen(ConsumerRecord consumerRecord){
        try {
            logger.warn("接收消息为:" + consumerRecord.value());
        } catch (Exception e) {
            logger.error("数据异常:consumerRecord:{},exception:", consumerRecord, e);
        }

    }
}

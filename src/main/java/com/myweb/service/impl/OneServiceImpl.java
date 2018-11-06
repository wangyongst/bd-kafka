package com.myweb.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myweb.domain.*;
import com.myweb.service.OneService;
import com.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.StringWriter;


@Service("OneService")
@SuppressWarnings("All")
@Transactional(readOnly = true)
public class OneServiceImpl implements OneService {

    private static final Logger logger = LogManager.getLogger(OneServiceImpl.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Result sendMessage(XiuZheng xiuZheng) {
        Result result = new Result();
        StringWriter str = new StringWriter();
        try {
            objectMapper.writeValue(str, xiuZheng);
            logger.info("kafka的消息={}", str.toString());
            kafkaTemplate.send("csv", "xiuZheng", str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setMessage(str.toString());
        return result;
    }

    @Override
    public Result sendMessage(CeLue ceLue) {
        Result result = new Result();
        StringWriter str = new StringWriter();
        try {
            objectMapper.writeValue(str, ceLue);
            logger.info("kafka的消息={}", str.toString());
            kafkaTemplate.send("csv", "ceLue", str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setMessage(str.toString());
        return result;
    }

    @Override
    public Result sendMessage(XiaoShou xiaoShou) {
        Result result = new Result();
        StringWriter str = new StringWriter();
        try {
            objectMapper.writeValue(str, xiaoShou);
            logger.info("kafka的消息={}", str.toString());
            kafkaTemplate.send("csv", "xiaoShou", str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setMessage(str.toString());
        return result;
    }

    @Override
    public Result sendMessage(JiHua jiHua) {
        Result result = new Result();
        StringWriter str = new StringWriter();
        try {
            objectMapper.writeValue(str, jiHua);
            logger.info("kafka的消息={}", str.toString());
            kafkaTemplate.send("csv", "jiHua", str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setMessage(str.toString());
        return result;
    }
    @Override
    public Result sendMessage(ZengXian zengXian) {
        Result result = new Result();
        StringWriter str = new StringWriter();
        try {
            objectMapper.writeValue(str, zengXian);
            logger.info("kafka的消息={}", str.toString());
            kafkaTemplate.send("api", "zengXian", str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setMessage(str.toString());
        return result;
    }
}

package com.myweb.service.impl;

import com.csvreader.CsvReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myweb.domain.*;
import com.myweb.service.OneService;
import com.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


@Service("OneService")
@SuppressWarnings("All")
@Transactional(readOnly = true)
public class OneServiceImpl implements OneService {

    private static final Logger logger = LogManager.getLogger(OneServiceImpl.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private ObjectMapper objectMapper = new ObjectMapper();


    @Value("${file.excel.path}")
    private String excelpath;

    @Override
    public Result sendXiuZheng() {
        Result result = new Result();
        List<String> stringList = new ArrayList<>();
        File file = new File(excelpath + File.separator + "xiuzheng");
        getAllFiles(file, stringList);
        stringList.forEach(e -> {
            XiuZheng xiuZheng = new XiuZheng();
            xiuZheng.setId(String.valueOf(System.currentTimeMillis()));
            xiuZheng.setXingming(e.split(",")[0]);
            xiuZheng.setShoujihaoma(e.split(",")[1]);
            if (e.split(",").length >= 3) xiuZheng.setHanghao(e.split(",")[2]);
            StringWriter str = new StringWriter();
            try {
                objectMapper.writeValue(str, xiuZheng);
                logger.info("kafka的消息={}", str.toString());
                kafkaTemplate.send("xiuzheng", "xiuzheng", str.toString());
            } catch (IOException t) {
                t.printStackTrace();
            }
        });
        result.setStatus(1);
        return result;
    }

    @Override
    public Result sendCeLue() {
        Result result = new Result();
        List<String> stringList = new ArrayList<>();
        File file = new File(excelpath + File.separator + "celue");
        getAllFiles(file, stringList);
        stringList.forEach(e -> {
            CeLue ceLue = new CeLue();
            ceLue.setId(String.valueOf(System.currentTimeMillis()));
            ceLue.setHanghao(e.split(",")[0]);
            ceLue.setXiafaceluemingcheng(e.split(",")[1]);
            ceLue.setXiafashi(e.split(",")[2]);
            ceLue.setXiafabumen(e.split(",")[3]);
            ceLue.setXiafajigou(e.split(",")[4]);
            ceLue.setGuishujigou(e.split(",")[5]);
            ceLue.setXiafasheng(e.split(",")[6]);
            ceLue.setHuodongyue(e.split(",")[7]);
            ceLue.setXiafaliang(e.split(",")[8]);
            ceLue.setMingdanleixing(e.split(",")[9]);
            ceLue.setMingdanxiangshu(e.split(",")[10]);
            ceLue.setShujuguishusheng(e.split(",")[11]);
            ceLue.setShujuguishushi(e.split(",")[12]);
            ceLue.setYouxianji(e.split(",")[13]);
            ceLue.setDingshiqi(e.split(",")[14]);
            ceLue.setYouxiaoqijiezhi(e.split(",")[15]);
            ceLue.setYouxiaoqiqishi(e.split(",")[16]);
            ceLue.setXiafajileiliang(e.split(",")[17]);
            StringWriter str = new StringWriter();
            try {
                objectMapper.writeValue(str, ceLue);
                logger.info("kafka的消息={}", str.toString());
                kafkaTemplate.send("celue", "celue", str.toString());
            } catch (IOException t) {
                t.printStackTrace();
            }
        });
        result.setStatus(1);
        return result;
    }

    @Override
    public Result sendXiaoShou() {
        Result result = new Result();
        List<String> stringList = new ArrayList<>();
        File file = new File(excelpath + File.separator + "xiaoshou");
        getAllFiles(file, stringList);
        stringList.forEach(e -> {
            XiaoShou xiaoshou = new XiaoShou();
            xiaoshou.setId(String.valueOf(System.currentTimeMillis()));
            xiaoshou.setHanghao(e.split(",")[0]);
            xiaoshou.setShujuguishujigou(e.split(",")[1]);
            xiaoshou.setShujuguishusheng(e.split(",")[2]);
            xiaoshou.setShujuguishushi(e.split(",")[3]);
            xiaoshou.setMingdanleixing(e.split(",")[4]);
            xiaoshou.setMingdanxiangshu(e.split(",")[5]);
            xiaoshou.setShoujihaoma(e.split(",")[6]);
            xiaoshou.setXingming(e.split(",")[7]);
            xiaoshou.setXingbie(e.split(",")[8]);
            xiaoshou.setShengri(e.split(",")[9]);
            xiaoshou.setNianling(e.split(",")[10]);
            xiaoshou.setShujulaiyuan(e.split(",")[11]);
            xiaoshou.setYewumoshi(e.split(",")[12]);
            xiaoshou.setFugaileixing(e.split(",")[13]);
            xiaoshou.setBeizhu(e.split(",")[14]);
            StringWriter str = new StringWriter();
            try {
                objectMapper.writeValue(str, xiaoshou);
                logger.info("kafka的消息={}", str.toString());
                kafkaTemplate.send("xiaoshou", "xiaoshou", str.toString());
            } catch (IOException t) {
                t.printStackTrace();
            }
        });
        result.setStatus(1);
        return result;
    }

    @Override
    public Result sendJiHua() {
        Result result = new Result();
        List<String> stringList = new ArrayList<>();
        File file = new File(excelpath + File.separator + "jihua");
        getAllFiles(file, stringList);
        stringList.forEach(e -> {
            JiHua jihua = new JiHua();
            jihua.setId(String.valueOf(System.currentTimeMillis()));
            jihua.setHanghao(e.split(",")[0]);
            jihua.setXiafajihuamingcheng(e.split(",")[1]);
            jihua.setXiafafangshi(e.split(",")[2]);
            jihua.setXiafabumen(e.split(",")[3]);
            jihua.setXiafasheng(e.split(",")[4]);
            jihua.setXiafashi(e.split(",")[5]);
            jihua.setHuodongyue(e.split(",")[6]);
            jihua.setShifouchaijie(e.split(",")[7]);
            jihua.setChaijiefenshu(e.split(",")[8]);
            jihua.setXiafariqi(e.split(",")[9]);
            jihua.setXiafaliang(e.split(",")[10]);
            jihua.setMingdanleixing(e.split(",")[11]);
            jihua.setMingdanxiangshu(e.split(",")[12]);
            jihua.setYouxianji(e.split(",")[13]);
            StringWriter str = new StringWriter();
            try {
                objectMapper.writeValue(str, jihua);
                logger.info("kafka的消息={}", str.toString());
                kafkaTemplate.send("jihua", "jihua", str.toString());
            } catch (IOException t) {
                t.printStackTrace();
            }
        });
        result.setStatus(1);
        return result;
    }

    @Override
    public Result sendZengXian(ZengXian zengXian) {
        Result result = new Result();
        StringWriter str = new StringWriter();
        try {
            zengXian.setId(String.valueOf(System.currentTimeMillis()));
            objectMapper.writeValue(str, zengXian);
            logger.info("kafka的消息={}", str.toString());
            kafkaTemplate.send("zengxian", "zengxian", str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setMessage(str.toString());
        return result;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Documents\\GitHub\\excel\\celue");
        List<String> stringList = new ArrayList<>();
        getAllFiles(file, stringList);
        stringList.forEach(e -> {
            System.out.println(e);
        });
    }

    public static void getAllFiles(File file, List<String> stringList) {
        if (file == null)
            return;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files)
                    getAllFiles(f, stringList);
            }
        }
        if (file.getName().endsWith(".csv")) {
            read(file.getAbsolutePath(), stringList);
        }
    }


    public static void read(String filePath, List<String> stringList) {
        try {
            CsvReader csvReader = new CsvReader(filePath, ',', Charset.forName("GB2312"));
            csvReader.readHeaders();
            while (csvReader.readRecord()) {
                stringList.add(csvReader.getRawRecord());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.boot.spring.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by BHWL on 2017-08-09.
 */
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@ComponentScan(basePackages = {"com.myweb"})
@EntityScan(basePackages = {"com.myweb.pojo"})
public class MainApplication extends SpringBootServletInitializer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplication.class, args);
    }
}
package com.overlord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by lidongdong on 2017/3/7.
 */
@SpringBootApplication
@EnableEurekaClient
public class BootstrapSentence {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapSentence.class, args);
    }
}

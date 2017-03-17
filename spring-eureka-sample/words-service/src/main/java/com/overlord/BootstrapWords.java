package com.overlord;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lidongdong on 2017/3/7.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class BootstrapWords {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapWords.class, args);
    }

    @Value("${sentence.words}")
    String words;

    @RequestMapping("/")
    public String getWord() {
        String[] wordArray = words.split(",");
        int i = (int) Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[i];
    }
}

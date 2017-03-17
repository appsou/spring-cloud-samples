package com.overlord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by lidongdong on 2017/3/7.
 */
@SpringBootApplication
@EnableConfigServer
public class BootstrapConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapConfigServer.class, args);
    }
}

package com.tricowin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//启动之后，访问 http://localhost:7001/
@SpringBootApplication
// @EnableEurekaServer 服务端的启动类，可以接受别人注册进来~
@EnableEurekaServer
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
package com.winning.devops.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.eureka.client
 * @date: 2019-06-21 23:46
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudEurekaClientApplication {
    public static void main(String[] args){
       SpringApplication.run(CloudEurekaClientApplication.class,args);
    }

    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String application;

    @GetMapping(value = "/hi/{name}")
    public String hi(@PathVariable("name")String name){
        return  "Hello "+name+", welcome to "+application +" ,i'm in port @ " +port;
    }
}

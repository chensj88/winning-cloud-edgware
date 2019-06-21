package com.winning.devops.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.eureka.server
 * @date: 2019-06-21 23:08
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args){
       SpringApplication.run(EurekaServerApplication.class,args);
    }
}

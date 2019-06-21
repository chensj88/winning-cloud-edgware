package com.winning.devops.cloud.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.zipkin.server
 * @date: 2019-06-21 23:29
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinServerApplication {
    public static void main(String[] args){
       SpringApplication.run(ZipkinServerApplication.class,args);
    }
}

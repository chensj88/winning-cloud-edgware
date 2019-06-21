package com.winning.devops.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.ribbon
 * @date: 2019-06-21 23:55
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrix
@EnableHystrixDashboard
public class CloudRibbonApplication {
    public static void main(String[] args){
       SpringApplication.run(CloudRibbonApplication.class,args);
    }
}

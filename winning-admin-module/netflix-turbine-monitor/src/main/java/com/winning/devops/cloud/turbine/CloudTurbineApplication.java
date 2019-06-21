package com.winning.devops.cloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.turbine
 * @date: 2019-06-22 1:03
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
public class CloudTurbineApplication {
    public static void main(String[] args){
       SpringApplication.run(CloudTurbineApplication.class,args);
    }
}

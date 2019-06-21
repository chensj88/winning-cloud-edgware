package com.winning.devops.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.ribbon
 * @date: 2019-06-21 23:58
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;
    /**
     * 请求http://eureka-client/hi/{name}
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name){
        return restTemplate.getForObject("http://netflix-eureka-client/hi/"+name,String.class);
    }

    public String hiError(String name){
        return  "Hi , "+name+", This is Hystrix Response come from ribbon client!";
    }
}

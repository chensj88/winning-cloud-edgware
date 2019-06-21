package com.winning.devops.cloud.open.feign.service;

import com.netflix.discovery.converters.Auto;
import com.winning.devops.cloud.open.feign.client.NetflixEurekaFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.open.feign.service
 * @date: 2019-06-22 0:17
 */
@Service
public class FeignClientService {

    @Autowired
    private NetflixEurekaFeignClient netflixEurekaFeignClient;

    public String hi(String name){
        return netflixEurekaFeignClient.hi(name);
    }
}

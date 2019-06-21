package com.winning.devops.cloud.open.feign.client.hystrix;

import com.winning.devops.cloud.open.feign.client.NetflixEurekaFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.open.feign.client.hystrix
 * @date: 2019-06-22 0:14
 */
@Component
public class NetflixEurekaFeignClientFallback implements NetflixEurekaFeignClient {
    @Override
    public String hi(String name) {
        return  "Hi , "+name+", This is Hystrix Response come from feign client!";
    }
}

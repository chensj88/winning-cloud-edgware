package com.winning.devops.cloud.open.feign.client;

import com.winning.devops.cloud.open.feign.client.hystrix.NetflixEurekaFeignClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.open.feign.client
 * @date: 2019-06-22 0:13
 */
@FeignClient(value = "netflix-eureka-client",fallback = NetflixEurekaFeignClientFallback.class)
public interface NetflixEurekaFeignClient {

    @GetMapping(value = "/hi/{name}")
    public String hi(@PathVariable("name")String name);
}

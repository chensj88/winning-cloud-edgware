package com.winning.devops.cloud.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.ribbon.config
 * @date: 2019-06-21 23:57
 */
@Configuration
public class RibbonConfig {
    /**
     * 实例化RestTemplate，注册bean
     * 使用@LoadBalanced就会结合Ribbon进行负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate initRestTemplate(){
        return  new RestTemplate();
    }
}

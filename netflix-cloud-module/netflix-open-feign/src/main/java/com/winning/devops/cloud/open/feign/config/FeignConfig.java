package com.winning.devops.cloud.open.feign.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.open.feign.config
 * @date: 2019-06-22 0:12
 */
@Configuration
public class FeignConfig {
    /**
     * Feign 在远程调用失败后会进行重试。
     * @return Retryer
     */
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
}

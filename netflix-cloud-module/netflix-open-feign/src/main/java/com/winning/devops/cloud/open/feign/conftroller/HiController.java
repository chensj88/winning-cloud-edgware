package com.winning.devops.cloud.open.feign.conftroller;

import com.winning.devops.cloud.open.feign.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chensj
 * @title
 * @project winning-cloud
 * @package com.winning.devops.cloud.ribbon
 * @date: 2019-06-22 0:00
 */
@RestController
public class HiController {

    @Autowired
    private FeignClientService feignClientService;

    @GetMapping(value = "/hi/{name}")
    public String hi(@PathVariable String name){
        return feignClientService.hi(name);
    }
}

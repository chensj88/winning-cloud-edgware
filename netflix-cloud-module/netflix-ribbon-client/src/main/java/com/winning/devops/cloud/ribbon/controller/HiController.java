package com.winning.devops.cloud.ribbon.controller;

import com.winning.devops.cloud.ribbon.service.RibbonService;
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
    private RibbonService ribbonService;

    @GetMapping(value = "/hi/{name}")
    public String hi(@PathVariable String name){
        return ribbonService.hi(name);
    }
}

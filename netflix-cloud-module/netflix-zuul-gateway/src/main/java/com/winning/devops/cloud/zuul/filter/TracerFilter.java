package com.winning.devops.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

import java.util.Date;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @author chensj
 * @title 向链路数据中添加自定义数据
 * @project winning-cloud
 * @package com.winning.devops.cloud.zuul.filter
 * @date: 2019-06-22 0:43
 */
@Component
public class TracerFilter extends ZuulFilter {

    /**logger*/
    private static final Logger logger = LoggerFactory.getLogger(TracerFilter.class);

    @Autowired
    private Tracer tracer;

    /**
     * filter Type
     * 过滤器的类型
     * @return PRE_TYPE
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }
    /**
     * 过滤顺序
     * 值越小，越早执行该过滤器
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }
    /**
     * 过滤器是否执行过滤逻辑
     * 如果为true,则执行run()方法;
     * 如果为 false ，则不执行run()方法。
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体的过滤的逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        tracer.addTag("operator","chensj");
        tracer.addTag("operationTime",System.currentTimeMillis()+"");
        logger.info("CurrentSpan.traceId"+tracer.getCurrentSpan().traceIdString());
        return null;
    }
}

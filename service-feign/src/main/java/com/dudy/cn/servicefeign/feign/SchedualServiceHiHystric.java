package com.dudy.cn.servicefeign.feign;

import org.springframework.stereotype.Component;

/**
 * 熔断器
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    //TODO: 有没有统一的处理服务down的情况
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

    @Override
    public String sayHello() {
        return "sorry ";
    }
}

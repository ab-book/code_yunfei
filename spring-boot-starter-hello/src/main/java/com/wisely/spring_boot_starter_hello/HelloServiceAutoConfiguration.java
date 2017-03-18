/*
 * www.sdds.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.wisely.spring_boot_starter_hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * 
 * @author lwk
 * @version $Id: HelloServiceAutoConfiguration.java, v 0.1 2016-12-13 22:01:32 lwk Exp$
 */


@Configuration
@EnableConfigurationProperties
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix="hello",value="enabled",matchIfMissing=true)
public class HelloServiceAutoConfiguration {
    
    @Autowired
    private HelloServiceProperties helloServiceProperties;
    
    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }

}

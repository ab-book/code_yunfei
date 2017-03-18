/*
 * www.sdds.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.wisely.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * 
 * @author lwk
 * @version $Id: HelloServiceProperties.java, v 0.1 2016-12-13 21:52:58 lwk Exp$
 */

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "World";

    private String              msg = MSG;

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg
     *            the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
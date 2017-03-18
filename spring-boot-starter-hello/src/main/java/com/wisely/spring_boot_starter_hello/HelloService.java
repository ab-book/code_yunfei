/*
 * www.sdds.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.wisely.spring_boot_starter_hello;

/**
 * 
 * 
 * @author lwk
 * @version $Id: HelloService.java, v 0.1 2016-12-13 21:58:44 lwk Exp$
 */
public class HelloService {

    private String msg;

    public String sayHello() {
        return "Hello" + msg;
    }

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

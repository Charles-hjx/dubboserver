package com.hjx.dubbo;

import com.hjx.dubbo.interfaces.APIHello;

/**
 * @Author: hjx
 * @Date: 2019/7/30
 * @Version 2.0  版本 1.0.1
 */
public class HelloServiceImpl2 implements APIHello {
    public String sayHello() {
        System.out.println("helloWorld2");
        return "HELLOWORLD_version_1.0.1";
    }
}

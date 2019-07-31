package com.hjx.dubbo;

import com.hjx.dubbo.interfaces.APIHello;

/**
 * @Author: hjx
 * @Date: 2019/7/30
 * @Version 1.0
 */
public class HelloServiceImpl implements APIHello {
    public String sayHello() {
        System.out.println("helloWorld");
        return "HELLOWORLD";
    }
}

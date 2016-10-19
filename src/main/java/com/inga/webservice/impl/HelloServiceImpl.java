package com.inga.webservice.impl;

import com.inga.webservice.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by abing on 2016/10/18.
 */
//@WebService(
//        name = "HelloService",
//        portName = "HelloServicePort",
//        endpointInterface = "com.inga.webservice.HelloService"
//)@WebService(endpointInterface="com.cxf.interfaces.IHelloWorldService",serviceName="helloWorldService",
// targetNamespace="http://interfaces.cxf.com/")

@WebService
@Service
public class HelloServiceImpl implements HelloService {

    public String say(String name) {
        return "name : " + name;
    }

}

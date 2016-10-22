package com.inga.webservice.impl;

import com.inga.bean.Info;
import com.inga.dao.InfoDao;
import com.inga.service.TestService;
import com.inga.utils.common.CommonGetBeanAware;
import com.inga.utils.log.PlatformLogger;
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

    public String say(String id) {

        PlatformLogger.message("the get id : " + id);
        TestService service = (TestService) CommonGetBeanAware.getBean("testService");
        Info info = service.queryInfoById(Integer.valueOf(id));
        return info.toString();
//        return  id;
    }

}

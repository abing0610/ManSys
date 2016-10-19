package org.webservice;

import com.inga.webservice.HelloService;
import com.inga.webservice.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by abing on 2016/10/18.
 */
public class TestWebService {
    public static void main(String[] args) {

        String url = "http://127.0.0.1:8080/ws/soap/hello";
        HelloService service = new HelloServiceImpl();

        Endpoint.publish(url, service);
        System.out.println("webservice is publish");

    }
}

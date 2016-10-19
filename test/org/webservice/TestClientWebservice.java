package org.webservice;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by abing on 2016/10/19.
 */
public class TestClientWebservice {

    public static void main(String[] args) {

//        DynamicClientFactory factory = DynamicClientFactory.newInstance();
//        Client client = factory.createClient("http://localhost:8080/ws/soap/hello?wsdl");
//
//        try {
//            Object[] results = client.invoke("say", "world");
//            System.out.println(results[0]);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
//        factoryBean.setAddress("http://localhost:8080/ws/soap/hello?wsdl");
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient("http://localhost:8080/ws/soap/hello?wsdl");

        try {
            Object[] result = client.invoke("say" , "inga");
            System.out.println(result[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

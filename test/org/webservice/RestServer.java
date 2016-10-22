package org.webservice;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.inga.webservice.impl.ProductServiceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.ResourceProvider;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abing on 2016/10/20.
 */
public class RestServer {
    public static void main(String[] args) {
        List<Class<?>> resourceClassList = new ArrayList<Class<?>>();
        resourceClassList.add(ProductServiceImpl.class);

        List<ResourceProvider> resourceProviderList = new ArrayList<ResourceProvider>();
        resourceProviderList.add(new SingletonResourceProvider(new ProductServiceImpl()));


        List<Object> providerList = new ArrayList<Object>();

        providerList.add(new JacksonJsonProvider());

        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setAddress("http://localhost:8080/ws/rest");
        factoryBean.setResourceClasses(resourceClassList);
        factoryBean.setResourceProviders(resourceProviderList);
        factoryBean.setProviders(providerList);
        factoryBean.create();
        System.out.println("rest ws is published");

    }
}

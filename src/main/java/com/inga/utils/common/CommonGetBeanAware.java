package com.inga.utils.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 公共获取bean对象的方法    也可以在static块中进行访问bean对象
 *
 * 使用方式如下：
 * CommonGetBeanAware.getBean(beanName)     //beanName为你要获取的bean的名称
 *
 * Created by abing on 2015/11/18.
 */
@Service
public class CommonGetBeanAware implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    public static Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }

    public static <T>T getBean(String beanName , Class<T> clazz){
        return applicationContext.getBean(beanName , clazz);
    }

}

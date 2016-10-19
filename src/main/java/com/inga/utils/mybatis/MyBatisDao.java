package com.inga.utils.mybatis;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by abing on 2015/11/18.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisDao {
    /**
     * The value may indicate a suggestion for a logical component name,
     * to be turned into a Spring bean in case of an autodetected component.
     * @return the suggested component name, if any
     */
    String value() default "";
}

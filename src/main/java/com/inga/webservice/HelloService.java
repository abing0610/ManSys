package com.inga.webservice;

import javax.jws.WebService;

/**
 * Created by abing on 2016/10/18.
 */
@WebService
public interface HelloService {

    String say(String name);
}

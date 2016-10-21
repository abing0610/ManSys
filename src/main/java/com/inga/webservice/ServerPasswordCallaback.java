package com.inga.webservice;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abing on 2016/10/20.
 */
@Service
public class ServerPasswordCallaback implements CallbackHandler {

    private static  final Map<String , String> userMap = new HashMap<>();

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
//        Wspassword

    }
}

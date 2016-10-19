package com.test.thread.deamon;

import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by abing on 2016/9/10.
 */
public class Test {
    public static void main(String[] args) {

//        ModelAndView

        Thread thread = new Daemon();
        System.out.println(thread.isDaemon());

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        try{
        stdin.readLine();
        }catch (Exception e) {
e.printStackTrace();
        }

    }
}

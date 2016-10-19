package com.test.thread.deamon;

/**
 * Created by abing on 2016/9/10.
 */
public class DaemoSpwn extends Thread {
    public DaemoSpwn(int i) {
        start();
        System.out.println("DaemoSpwn " + i + "started");
    }

    public void run(){
        while (true) {
            yield();
        }
    }

}

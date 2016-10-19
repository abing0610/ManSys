package com.test.thread.deamon;

/**
 * Created by abing on 2016/9/10.
 */
public class Daemon extends Thread {
    private static  int SIZE = 10;

    private Thread[] t = new Thread[SIZE];

    public Daemon() {
        setDaemon(true);
        start();
    }

    @Override
    public void run(){
        for (int i = 0 ; i < SIZE ; i++) {
            t[i] = new DaemoSpwn(i);
        }

        for (int i = 0 ; i < SIZE ; i++) {
            System.out.println("t[" + i + "].isDamon() = " + t[i].isDaemon());
        }
        while (true) {
            yield();
        }
    }

}

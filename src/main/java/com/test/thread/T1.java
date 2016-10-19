package com.test.thread;

/**
 * Created by abing on 2016/9/10.
 */
public class T1 extends  Thread {

    private  int countDown =5;
    private  int threadNumber;
    private  static  int threadCount = 0;

    public T1(){
        threadNumber = ++threadCount;
        System.out.println("Making  " + threadNumber);
    }

    public void run(){

        while (true) {
            System.out.println("Thread " + threadNumber + "(" + countDown + ")");
            if (--countDown == 0){
                return;
            }
        }

    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 5 ; i++) {
            new T1().start();
        }
        System.out.println("All end!");
    }
}

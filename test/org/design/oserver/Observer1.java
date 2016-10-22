package org.design.oserver;

/**
 * Created by abing on 2016/10/21.
 */
public class Observer1 implements ObserverInterface {

    private SubjectInterface subjectInterface;

    private String temp;
    private String name;

    public Observer1(SubjectInterface subjectInterface){
        this.subjectInterface = subjectInterface;
        subjectInterface.registerObserver(this);
    }


    @Override
    public void update(String temp, String name) {
        this.temp = temp;
        this.name = name;
        say();
    }


    public void say(){
        System.out.println("this Observer is temp : " + temp + " name : " + name);
    }
}

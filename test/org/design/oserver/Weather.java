package org.design.oserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abing on 2016/10/21.
 */
public class Weather implements SubjectInterface {

    List<ObserverInterface> list = new ArrayList<ObserverInterface>();

    private String temp;
    private String name;


    @Override
    public void registerObserver(ObserverInterface observerInterface) {
        list.add(observerInterface);
    }

    @Override
    public void removeObserver(ObserverInterface observerInterface) {
        list.remove(observerInterface);
    }

    @Override
    public void update() {
            for (ObserverInterface observer : list) {
                observer.update(temp , name);
            }
    }

    public void  updateNewData(String temp , String name){
        this.temp = temp;
        this.name = name;
        update();

    }



}

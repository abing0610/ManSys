package org.design.oserver;

/**
 * Created by abing on 2016/10/21.
 */
public interface SubjectInterface {

    void registerObserver(ObserverInterface observerInterface);

    void removeObserver(ObserverInterface observerInterface);

    void update();
}
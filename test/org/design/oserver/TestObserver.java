package org.design.oserver;

/**
 * Created by abing on 2016/10/21.
 */
public class TestObserver {

    public static void main(String[] args) {
        Weather weather  = new Weather();

        Observer1 observer1 = new Observer1(weather);
        Observer1 observer2 = new Observer1(weather);

        weather.updateNewData("inga" , "name");
        weather.removeObserver(observer1);
        weather.updateNewData("inga" , "name");
    }


}

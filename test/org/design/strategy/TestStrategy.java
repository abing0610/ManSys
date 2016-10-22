package org.design.strategy;

/**
 * Created by abing on 2016/10/21.
 */
public class TestStrategy {

    public static void main(String[] args) {
        int price = 444;

        CommHandler handler = new CommHandler(new Diamond());
        System.out.println(handler.getPrice(price));
    }

}

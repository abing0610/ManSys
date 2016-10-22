package org.design.strategy;

/**
 * Created by abing on 2016/10/21.
 */
public class Normal implements MemberInterface {
    @Override
    public double getGrice(double price) {
        return price;
    }

    @Override
    public boolean freshShiping() {
        return false;
    }
}

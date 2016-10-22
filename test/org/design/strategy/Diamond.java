package org.design.strategy;

/**
 * Created by abing on 2016/10/21.
 */
public class Diamond implements MemberInterface {
    @Override
    public double getGrice(double price) {
        return price * 0.9;
    }

    @Override
    public boolean freshShiping() {
        return true;
    }
}

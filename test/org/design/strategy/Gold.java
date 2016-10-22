package org.design.strategy;

import javax.swing.*;
import java.lang.reflect.Member;

/**
 * Created by abing on 2016/10/21.
 */
public class Gold implements MemberInterface {
    @Override
    public double getGrice(double price) {
        return price * 0.9;
    }

    @Override
    public boolean freshShiping() {
        return false;
    }
}

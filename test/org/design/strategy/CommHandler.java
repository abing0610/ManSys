package org.design.strategy;

/**
 * Created by abing on 2016/10/21.
 */
public class CommHandler {
    private MemberInterface member;

    public CommHandler(MemberInterface member){
        this.member = member;
    }

    public double getPrice(double price){
        double shipPrice = 5.0;
        if (member.freshShiping()) {
            shipPrice = 0.0;
        }

        return (member.getGrice(price) + shipPrice);

    }
}

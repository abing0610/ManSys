package com.inga.bean;

import java.util.Date;

/**
 * Created by abing on 2016/8/23.
 */
public class Info extends Form {
    private int id;

    private String sdate;

    private String name;

    private int stock;

    private String ship;

    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", sdate='" + sdate + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", ship='" + ship + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

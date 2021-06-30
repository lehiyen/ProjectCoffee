package com.nlu.model;

import java.util.Date;

public class Bill {
    private String id;
    private String name;
    private Date date;

    public Bill(String id, String name, Date date){
        this.id =id;
        this.name =name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}

package com.nlu.model;

public class BillDetail {
    private String id;
    private int idPro;
    private int count;

    public BillDetail(String id, int idPro, int count){
        this.id =id;
        this.idPro = idPro;
        this.count = count;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

}

package com.xworkz.wireapp.wire;

public class Wire {

    private  int wireId;
    public int getWireId(){
        return wireId;
    }
    public void setWireId(int wireId){
        this.wireId=wireId;
    }

    private String wireName;
    public String getWireName() {
        return wireName;
    }
    public void setWireName(String wireName) {
        this.wireName = wireName;
    }
    private String wireBrand;

    public String getWireBrand(){
        return wireBrand;
    }
    public void setWireBrand(String wireBrand){
        this.wireBrand=wireBrand;
    }


    private double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    private int length;
    public int getLength() {
        return length;
    }
    public void setLength(int length){
        this.length=length;
    }
}
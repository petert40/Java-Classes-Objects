package org.example;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Phone {
    String brand;
    Integer price;
    String color;

    public Phone(){};

    public Phone(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public Phone(String brand, String color, Integer price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public Boolean isBlack(){
        return this.color.toLowerCase() == "black";
    }

    public String getFile(){
        return "this is a Phone.java file";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

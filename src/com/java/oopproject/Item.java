package com.java.oopproject;

public class Item {

    String nameOfItem;
    int price;

    public Item(String nameOfItem, int price){
        this.nameOfItem = nameOfItem;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getItemName(){
        return nameOfItem;
    }

}

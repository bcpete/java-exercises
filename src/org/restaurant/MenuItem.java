package org.restaurant;

import java.time.LocalDateTime;

/**
 * Created by Brady on 3/13/17.
 */
public class MenuItem {

    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew;
    private LocalDateTime created;


    public String getName(){
        return name;
    }

    private void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    private void setDescription(String description){
        this.description = description;
    }

    public String getCategory(){
        return category;
    }

    private void setCategory(String category){
        this.category = category;
    }

    public double getPrice(){
        return price;
    }

    private void setPrice(double price){
        this.price = price;
    }

    public boolean getIsNew(){
        return isNew;
    }

    private void setIsNew(boolean isNew){
        this.isNew = isNew;
    }

}

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
    private LocalDateTime created;

    public MenuItem(String name, String description, String category, double price,
                    LocalDateTime created) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.created = created.now();

    }

    public LocalDateTime getCreated() {
        return created;
    }

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

    @Override
    public String toString(){
        return "Name: " + name + "\nDescription: " + getDescription()
                + "\nCategory: " + getCategory() + "\nPrice: " + getPrice() +
                "\nWhen item was added to menu: " + getCreated();
    }


}

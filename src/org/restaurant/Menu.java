package org.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by Brady on 3/13/17.
 */
public class Menu {

    private ArrayList<MenuItem> Items = new ArrayList<>();
    private LocalDateTime lastUpdated;

    public Menu(ArrayList<MenuItem> items, LocalDateTime lastUpdated) {
        Items = items;
        this.lastUpdated = lastUpdated.now();
    }

    public Menu(ArrayList<MenuItem> items) {
        Items = items;
    }

    public ArrayList<MenuItem> getItems() {
        return Items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        Items = items;
    }

    public void addItem(MenuItem item){
        Items.add(item);
    }

    public void removeItem(MenuItem item){
        Items.remove(item);
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }

    @Override
    public String toString(){
        for(MenuItem item : Items){
            return item.toString();
        }
        return "Menu was last updated:" + getLastUpdated();
    }

}

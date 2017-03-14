package org.restaurant;

import java.util.ArrayList;

/**
 * Created by Brady on 3/13/17.
 */
public class Menu {

    private ArrayList<MenuItem> Items = new ArrayList<>();

    public ArrayList<MenuItem> getItems() {
        return Items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        Items = items;
    }

    public void addItem(MenuItem item){
        Items.add(item);
    }
}

package org.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static java.time.LocalDateTime.MAX;

/**
 * Created by Brady on 3/16/17.
 */
public class Restaurant {
    public static void main(String[] args){
        MenuItem soup = new MenuItem("Potato soup", "it's a soup with potatos",
                "Lunch", 3.50, LocalDateTime.now());

        System.out.println(soup);

        ArrayList<MenuItem> items = new ArrayList<MenuItem>();

        Menu aMenu = new Menu(items, LocalDateTime.now());

        System.out.println(aMenu);
    }
}

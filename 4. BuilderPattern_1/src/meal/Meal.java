/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package meal;

import api.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class Meal {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    public float getCost() {
        float cost = 0f;
        for (Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

}

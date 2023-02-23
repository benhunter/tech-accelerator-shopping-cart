package com.galvanize.cart;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Item> items = new ArrayList<Item>();

    public ArrayList<Item> getItems() {
        return (ArrayList<Item>) this.items.clone();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : this.items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String itemizedList() {
        StringBuilder message = new StringBuilder();
        message.append("These items are in your cart:\n");
        for (Item item: this.items) {
            message.append(item.toString());
            message.append("\n");
        }
        return message.toString();
    }

    public int itemQuantities() {
        int count = 0;
        for (Item item: this.items) {
            count += 1;
        }
        return count;
    }
}

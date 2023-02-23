package com.galvanize.cart;

import java.text.NumberFormat;

public class Item {
    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        return this.name + ", " + numberFormat.format(this.price);
    }
}

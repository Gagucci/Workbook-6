package org.example;

import java.util.List; // For List interface
import java.util.ArrayList; // For ArrayList class
// import java.util.stream.Collectors; // Not strictly needed for this Basket version, but good for general stream use

// A generic Basket that can hold any type T that extends PricedItem.
// It can add items, calculate total price, and print a receipt.
public class Basket<T extends PricedItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    // Calculates total price using a stream.
    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(PricedItem::getPrice) // Extracts price from each item
                .sum(); // Sums up all prices
    }

    // Prints a receipt for all items in the basket.
    public void printReceipt() {
        items.forEach(item ->
                System.out.println(item.getName() + ": €" + String.format("%.2f", item.getPrice()))
        );
    }
}
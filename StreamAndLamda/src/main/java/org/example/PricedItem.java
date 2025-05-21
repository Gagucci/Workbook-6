package org.example;


// Defines a contract for items that have a name and a price.
public interface PricedItem {
    String getName();

    double getPrice();
    // Optional: Add a category or ingredients for more complex examples later
    // String getCategory();
}
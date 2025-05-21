package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    private List<T> items;
    private int maxSize;

    // Constructor: sets max size and initializes the list
    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    // Add method: only adds if list is not full
    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {
            throw new IllegalStateException("List is full. Max size is " + maxSize);
        }
    }

    // Getter for the internal list
    public List<T> getItems() {
        return items;
    }


}

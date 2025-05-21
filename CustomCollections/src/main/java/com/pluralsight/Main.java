package com.pluralsight;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FixedList<Integer>  numbers = new FixedList<>(5);
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);
        numbers.add(93);
        numbers.add(2);

        System.out.println(numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(5);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
    }
}
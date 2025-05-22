package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Cricelia","Jon","Emiliya");

        names.forEach(x -> System.out.println(x));


        // Assuming Smoothie class is defined with: public Smoothie(String name, double price, boolean isVegan, String... ingredients)
        Smoothie greenBoost = new Smoothie("Green Boost", 4.99, true, "Spinach", "Apple");
        MenuItem<Smoothie> special = new MenuItem<>("Special of the Day", greenBoost);

        System.out.println(special.getProduct().getName());  // Green Boost

        // Define a menu of smoothies.
        // Constructor: Smoothie(String name, double price, boolean isVegan, String... ingredients)
        List<Smoothie> menu = Arrays.asList(
                new Smoothie("Strawberry Dream", 3.50, false, "Strawberry", "Milk"),
                new Smoothie("Green Boost", 4.99, true, "Spinach", "Apple", "Mint"),
                new Smoothie("Tropical Twist", 4.25, true, "Pineapple", "Mango", "Coconut Water"),
                new Smoothie("Berry Blast", 5.75, false, "Mixed Berries", "Yogurt"),
                new Smoothie("Power Up", 6.20, true, "Banana", "Protein Powder", "Almond Milk")
        );

        // Filter: Get all vegan smoothies.
        List<Smoothie> veganSmoothies = menu.stream()
                .filter(Smoothie::isVegan) // Lambda for filtering
                .collect(Collectors.toList()); // Collect results into a new list
        System.out.println("Vegan Smoothies:");
        veganSmoothies.forEach(System.out::println); // Print each vegan smoothie

        // Filter: Get smoothies costing less than €5.00
        List<Smoothie> underFiveEuros = menu.stream()
                .filter(s -> s.getPrice() < 5.0) // Lambda for filtering
                .collect(Collectors.toList()); // Collect results into a new list
        System.out.println("\nSmoothies under €5.00:");
        underFiveEuros.forEach(System.out::println);

        // MapToDouble & Sum: Calculate the total price of all smoothies on the menu.
        double totalMenuPrice = menu.stream()
                .mapToDouble(Smoothie::getPrice) // Method reference to get price
                .sum();
        System.out.println("\nTotal price of the full menu: €" + String.format("%.2f", totalMenuPrice));

        // Sorted: Sort smoothies by name alphabetically.
        List<Smoothie> sortedByName = menu.stream()
                .sorted(Comparator.comparing(Smoothie::getName)) // Lambda for sorting criteria
                .collect(Collectors.toList());
        System.out.println("\nMenu sorted by name:");
        sortedByName.forEach(System.out::println);

        // ForEach: Print all smoothie names and their prices.
        System.out.println("\nAll smoothie names and prices:");
        menu.forEach(s -> System.out.println(s.getName() + ": €" + String.format("%.2f", s.getPrice())));

        // Demonstrates using the Basket with Smoothie objects.
        // Assumes Smoothie constructor: public Smoothie(String name, double price, boolean isVegan, String... ingredients)
        Basket<Smoothie> smoothieBasket = new Basket<>();
        smoothieBasket.addItem(new Smoothie("Strawberry Dream", 3.50, false, "Strawberry", "Milk", "Sugar"));
        smoothieBasket.addItem(new Smoothie("Tropical Twist", 4.25, true, "Pineapple", "Mango", "Coconut Water"));

        System.out.println("\nSmoothie Basket Receipt:");
        smoothieBasket.printReceipt();
        System.out.println("Total Smoothie Basket Price: €" + String.format("%.2f", smoothieBasket.getTotalPrice()));

        // Demonstrates using the Basket with Snack objects.
        // Assumes Snack constructor: public Snack(String name, double price)
        Basket<Snack> snackBasket = new Basket<>();
        snackBasket.addItem(new Snack("Chips", 1.50));
        snackBasket.addItem(new Snack("Chocolate Bar", 2.00));
        snackBasket.addItem(new Snack("Cookies", 1.75));

        System.out.println("\nSnack Basket Receipt:");
        snackBasket.printReceipt();
        System.out.println("Total Snack Basket Price: €" + String.format("%.2f", snackBasket.getTotalPrice()));


        // sort menu by price
        List<Smoothie> sortedByPrice = menu.stream()
                .sorted(Comparator.comparing(Smoothie::getPrice)) // Lambda for sorting criteria
                .collect(Collectors.toList());
        System.out.println("\nMenu sorted by price:");
        sortedByPrice.forEach(System.out::println);
    }
}
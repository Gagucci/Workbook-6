package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", 30));
        people.add(new Person("Jane", "Smith", 25));
        people.add(new Person("Alice", "Johnson", 28));
        people.add(new Person("Bob", "Brown", 35));
        people.add(new Person("Charlie", "Davis", 22));
        people.add(new Person("Eve", "Wilson", 29));
        people.add(new Person("Frank", "Garcia", 31));
        people.add(new Person("Grace", "Martinez", 27));
        people.add(new Person("Hank", "Lopez", 33));
        people.add(new Person("Ivy", "Gonzalez", 26));

        System.out.println("Please enter a name to search for (first or last):");
        System.out.print("> ");
        String entry = read.nextLine();

        for ( Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(entry) || person.getLastName().equalsIgnoreCase(entry)) {
                System.out.println("Found: " + person.getFirstName() + " " + person.getLastName() + ", Age: " + person.getAge());
            }
        }

        //calculate the average age of the list and display the oldest age and youngest age on the list
        int totalAge = 0;
        int oldestAge = Integer.MIN_VALUE;
        int youngestAge = Integer.MAX_VALUE;

        for (Person person : people) {
            totalAge += person.getAge();
            if (person.getAge() > oldestAge) {
                oldestAge = person.getAge();
            }
            if (person.getAge() < youngestAge) {
                youngestAge = person.getAge();
            }
        }
        double averageAge = (double) totalAge / people.size();
        System.out.println("Average Age: " + averageAge);
        System.out.println("Oldest Age: " + oldestAge);
        System.out.println("Youngest Age: " + youngestAge);
    }
}
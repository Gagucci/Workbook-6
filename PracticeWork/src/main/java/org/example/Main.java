package org.example;

import com.pluralsight.interfaces.Flyalbe;
import com.pluralsight.interfaces.IAnimal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAnimal dog = new Dog();
        IAnimal cat = new Cat();
        IAnimal bird = new Bird();

        dog.makeNoise();
        cat.makeNoise();
        bird.makeNoise();

        List<Flyalbe> flyers = new ArrayList<>();
        flyers.add(new Bird());


        for (Flyalbe f : flyers) {
            f.fly();  // all fly differently, but we treat them the same!
        }
    }
}
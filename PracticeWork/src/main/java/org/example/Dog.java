package org.example;

import com.pluralsight.interfaces.IAnimal;

public class Dog implements IAnimal {

    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }
}

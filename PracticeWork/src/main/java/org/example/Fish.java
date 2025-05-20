package org.example;

import com.pluralsight.interfaces.IAnimal;
import com.pluralsight.interfaces.Swimmable;

public class Fish implements Swimmable, IAnimal {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void makeNoise() {
        System.out.println("Blub blub");
    }
}

package org.example;

import com.pluralsight.interfaces.Flyalbe;
import com.pluralsight.interfaces.IAnimal;

public class Bird implements Flyalbe, IAnimal {

    @Override
    public void fly() {
        System.out.println("Flap flap");
    }

    @Override
    public void makeNoise() {
        System.out.println("Tweet");
    }
}

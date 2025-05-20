package org.example;

import com.pluralsight.interfaces.IAnimal;

public class Cheetah implements IAnimal, Runnable {

    @Override
    public void makeNoise() {
        System.out.println("Roar");
    }

    @Override
    public void run() {
        System.out.println("Cheetah is running fast!");
    }
}

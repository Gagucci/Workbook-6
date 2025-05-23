package com.pluralsight.finance;

public class Gold extends FixedAsset{
    private double weight;

    public Gold( double weight) {
        super();
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public void getValue() {
        System.out.println("The value of the gold is: " + getMarketValue() * weight);
    }
}

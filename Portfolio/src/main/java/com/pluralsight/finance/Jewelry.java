package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    private double karats;

    public Jewelry(String name, double marketValue, double karats) {
        super(name, marketValue);
        this.karats = karats;
    }

    public double getKarats() {
        return karats;
    }

    public void setKarats(double karats) {
        this.karats = karats;
    }

    @Override
    public void getValue() {
        System.out.println("The value of the jewelry is: " + getMarketValue());
    }
}

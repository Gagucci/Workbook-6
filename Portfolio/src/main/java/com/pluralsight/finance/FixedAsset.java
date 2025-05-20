package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public FixedAsset() {

    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public abstract void getValue();
}

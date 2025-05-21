package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String cardNumber;
    private double balance;
    private double creditLimit;

    public CreditCard(String cardNumber, double creditLimit) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public double getBalance() {
        return balance;
    }
    public double getCreditLimit() {
        return creditLimit;
    }


    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }



    @Override
    public void getValue() {

    }
}

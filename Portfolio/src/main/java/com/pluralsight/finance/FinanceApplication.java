package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", "pam", 12500);
        Valuable account2 = new BankAccount("456", "john", 15000);

        account2.deposit(1000);
        account1.deposit(1000);

    }

}

package org.tw.wallet;

public class Wallet {
    private double amount;

    public void addMoney(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

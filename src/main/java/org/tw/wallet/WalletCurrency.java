package org.tw.wallet;

public enum WalletCurrency {
    RUPEE(1),
    DOLLAR(100);

    private final double conversionFactor;

    WalletCurrency(double factor) {
        this.conversionFactor = factor;
    }

    public double convertFromBase(double amount) {
        return amount / conversionFactor;
    }

    public double convertToBase(double amount) {
        return amount * conversionFactor;
    }
}

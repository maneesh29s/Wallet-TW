package org.tw.wallet;

import static org.tw.wallet.WalletCurrency.DOLLAR;
import static org.tw.wallet.WalletCurrency.RUPEE;

public class Wallet {
    protected double amount = 0;
    protected WalletCurrency currency = RUPEE;

    private void addMoney(double amount, WalletCurrency inputCurrency) {
        this.amount += this.currency.convertFromBase(inputCurrency.convertToBase(amount));
    }

    private void removeMoney(double amount, WalletCurrency inputCurrency) {
        this.amount -= this.currency.convertFromBase(inputCurrency.convertToBase(amount));
    }

    public void addRupees(double amount) {
        addMoney(amount, RUPEE);
    }

    public void addDollars(double amount) {
        addMoney(amount, DOLLAR);
    }

    public void removeRupees(double amount) {
        removeMoney(amount, RUPEE);
    }

    public void removeDollars(double amount) {
        removeMoney(amount, DOLLAR);
    }

    public void setPreferredCurrency(WalletCurrency currency) {
        this.amount = currency.convertFromBase(this.currency.convertToBase(this.amount));
        this.currency = currency;
    }

    public double getAmount() {
        return this.amount;
    }
}

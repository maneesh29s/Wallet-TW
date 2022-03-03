package org.tw.wallet;

import static org.tw.wallet.WalletCurrency.DOLLAR;
import static org.tw.wallet.WalletCurrency.RUPEE;

public class Wallet {
    protected double amount = 0;
    protected WalletCurrency currency = RUPEE;

    public void addMoney(double amount, WalletCurrency inputCurrency) {
        this.amount += this.currency.convertFromBase(inputCurrency.convertToBase(amount));
    }

    public void addRupee(double amount) {
        addMoney(amount, RUPEE);
    }

    public void addDollars(double amount) {
        addMoney(amount, DOLLAR);
    }

    public void setCurrency(WalletCurrency currency) {
        this.amount = currency.convertFromBase(this.currency.convertToBase(this.amount));
        this.currency = currency;
    }


}

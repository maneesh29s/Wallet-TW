package org.tw.wallet;

public class FakeWallet extends Wallet {

    public FakeWallet() {
        super();
    }

    public double getAmount() {
        return super.amount;
    }

    public WalletCurrency getCurrency() {
        return super.currency;
    }
}

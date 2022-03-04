package org.tw.wallet;

public class FakeWallet extends Wallet {

    public FakeWallet() {
        super();
    }

    public WalletCurrency getCurrency() {
        return super.currency;
    }
}

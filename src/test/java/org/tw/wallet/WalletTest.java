package org.tw.wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.tw.wallet.WalletCurrency.RUPEE;

public class WalletTest {

    @Test
    void shouldBeAbleToPutMoneyIntoTheWallet() {
        FakeWallet wallet = new FakeWallet();

        wallet.addMoney(1, RUPEE);

        assertEquals(wallet.getAmount(), 1);
    }

    @Test
    void shouldBeAbleAddHundredRuppesToTheWallet() {
        FakeWallet wallet = new FakeWallet();

        wallet.addRupee(100);

        assertEquals(wallet.getAmount(), 100);
        assertEquals(wallet.getCurrency(), RUPEE);
    }

    @Test
    void shouldBeAbleAddOneDollarToTheWalletWhichAlreadyContainsHundredRupees() {
        FakeWallet wallet = new FakeWallet();
        wallet.addRupee(100);

        wallet.addDollars(1);

        assertEquals(wallet.getAmount(), 200);
    }

}

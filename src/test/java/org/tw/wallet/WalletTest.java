package org.tw.wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.tw.wallet.WalletCurrency.RUPEE;

public class WalletTest {

    @Test
    void shouldBeAbleAddHundredRuppesToTheWallet() {
        FakeWallet wallet = new FakeWallet();

        wallet.addRupees(100);

        assertEquals(wallet.getAmount(), RUPEE.convertFromBase(100));
    }

    @Test
    void shouldBeAbleAddOneDollarToTheWalletWhichAlreadyContainsHundredRupees() {
        FakeWallet wallet = new FakeWallet();
        wallet.addRupees(100);

        wallet.addDollars(1);

        assertEquals(wallet.getAmount(), RUPEE.convertFromBase(200));
    }

    @Test
    void shouldBeAbleToTakeOutTenRupeesFromTheWalletInWhichHundredRupeesAndOneDollarWasAdded() {
        FakeWallet wallet = new FakeWallet();
        wallet.addRupees(100);
        wallet.addDollars(1);

        wallet.removeRupees(10);

        assertEquals(wallet.getAmount(), RUPEE.convertFromBase(190));
    }

    @Test
    void shouldBeAbleToTakeOutOneDollarFromTheWalletInWhichHundredRupeesAndTwoDollarWasAdded() {
        FakeWallet wallet = new FakeWallet();
        wallet.addRupees(100);
        wallet.addDollars(2);

        wallet.removeDollars(1);

        assertEquals(wallet.getAmount(), RUPEE.convertFromBase(200));
    }

}

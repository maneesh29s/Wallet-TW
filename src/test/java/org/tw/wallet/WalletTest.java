package org.tw.wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.tw.wallet.WalletCurrency.DOLLAR;
import static org.tw.wallet.WalletCurrency.RUPEE;

public class WalletTest {

    @Test
    void shouldBeAbleAddHundredRupeesToTheWallet() {
        FakeWallet wallet = new FakeWallet();

        wallet.addRupees(100);

        assertEquals(wallet.getAmount(), 100);
    }

    @Test
    void shouldBeAbleAddOneDollarToTheWalletWhichAlreadyContainsHundredRupees() {
        FakeWallet wallet = new FakeWallet();
        wallet.addRupees(100);

        wallet.addDollars(1);

        assertEquals(wallet.getAmount(), 200);
    }

    @Test
    void shouldBeAbleToTakeOutTenRupeesFromTheWalletInWhichHundredRupeesAndOneDollarWasAdded() {
        FakeWallet wallet = new FakeWallet();
        wallet.addRupees(100);
        wallet.addDollars(1);

        wallet.removeRupees(10);

        assertEquals(wallet.getAmount(), 190);
    }

    @Test
    void shouldBeAbleToTakeOutOneDollarFromTheWalletInWhichHundredRupeesAndTwoDollarWasAdded() {
        FakeWallet wallet = new FakeWallet();
        wallet.addRupees(100);
        wallet.addDollars(2);

        wallet.removeDollars(1);

        assertEquals(wallet.getAmount(), 200);
    }

    @Test
    void shouldBeAbleToKnowTotalMoneyPresentInTheWalletForThePreferredCurrency() {
        Wallet wallet = new Wallet();
        wallet.addRupees(100);
        wallet.addDollars(2);
        wallet.setPreferredCurrency(DOLLAR);

        double totalAmount = wallet.getAmount();

        assertEquals(totalAmount, 3);

    }
}

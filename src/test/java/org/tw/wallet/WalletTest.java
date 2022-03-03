package org.tw.wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {

    @Test
    void shouldBeAbleToPutMoneyIntoTheWallet() {
        Wallet wallet = new Wallet();
        double expected = 1;

        wallet.addMoney(1);

        assertEquals(wallet.getAmount(), expected);
    }
}

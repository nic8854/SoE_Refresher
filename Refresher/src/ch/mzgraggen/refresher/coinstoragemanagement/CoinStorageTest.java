package ch.mzgraggen.refresher.coinstoragemanagement;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoinStorageTest {

    @Test
    public void testInitialCoinStorageAmounts() {
        CoinStorage coinStorage = new CoinStorage();
        int[] amounts = coinStorage.getCoinStorageAmounts();
        assertArrayEquals(new int[] {0, 0, 0, 0}, amounts);
    }

    @Test
    public void testSetAndGetCoinStorageAmounts() {
        CoinStorage coinStorage = new CoinStorage();
        coinStorage.setCoinStorageAmounts(10, 20, 30, 40);

        int[] expected = {10, 20, 30, 40};
        int[] actual = coinStorage.getCoinStorageAmounts();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSetCoinStorageAmountsWithZeroValues() {
        CoinStorage coinStorage = new CoinStorage();
        coinStorage.setCoinStorageAmounts(0, 0, 0, 0);

        int[] expected = {0, 0, 0, 0};
        int[] actual = coinStorage.getCoinStorageAmounts();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSetCoinStorageAmountsWithDifferentValues() {
        CoinStorage coinStorage = new CoinStorage();
        coinStorage.setCoinStorageAmounts(3, 5, 7, 9);

        int[] expected = {3, 5, 7, 9};
        int[] actual = coinStorage.getCoinStorageAmounts();

        assertArrayEquals(expected, actual);
    }
}

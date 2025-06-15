package ch.mzgraggen.refresher.coinstoragemanagement;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoinStorageIntegrationTest {

    @Test
    public void testCoinStorageSystemEndToEnd() {
        // Arrange
        CoinStorage coinStorage = new CoinStorage();
        CoinStorageSensor sensor = new CoinStorageSensor(); // Returns [5, 2, 1, 50]
        CoinStorageManagement management = new CoinStorageManagement(coinStorage, sensor);

        // Act
        management.updateCoinAmountsPeriodic(); // Updates coinStorage using the sensor

        // Assert
        int[] expected = {5, 2, 1, 50};
        int[] actual = management.getStorageAmounts();

        assertArrayEquals(expected, actual);
    }
}

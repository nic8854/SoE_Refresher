package ch.mzgraggen.refresher.coinstoragemanagement;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoinStorageManagementTest {

    @Test
    public void testUpdateCoinAmountsPeriodicWithFixedSensorValues() {
        // Arrange
        CoinStorage coinStorage = new CoinStorage();

        // Subclass CoinStorageSensor to provide fixed values for the test
        CoinStorageSensor testSensor = new CoinStorageSensor() {
            @Override
            public int[] measureCoinAmounts() {
                return new int[] {3, 6, 9, 12}; // predictable values
            }
        };

        CoinStorageManagement management = new CoinStorageManagement(coinStorage, testSensor);

        // Act
        management.updateCoinAmountsPeriodic();

        // Assert
        int[] expected = {3, 6, 9, 12};
        int[] actual = management.getStorageAmounts();
        assertArrayEquals(expected, actual);
    }
}

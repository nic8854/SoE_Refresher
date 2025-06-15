package ch.mzgraggen.refresher.coinstoragemanagement;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoinStorageSensorTest {

    @Test
    public void testMeasureCoinAmountsReturnsFixedValues() {
        // Arrange
        CoinStorageSensor sensor = new CoinStorageSensor();

        // Act
        int[] measuredAmounts = sensor.measureCoinAmounts();

        // Assert
        int[] expected = {5, 2, 1, 50};
        assertArrayEquals(expected, measuredAmounts);
    }
}

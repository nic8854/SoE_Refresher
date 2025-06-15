package ch.mzgraggen.refresher.coinstoragemanagement;

import java.util.Random;

/**
 * CoinStorageSensor provides methods to access and simulate
 * the built-in sensor of the coin storage unit.
 * It can measure coin levels and detect sensor errors.
 * 
 * Methods:
 * - isSensorError(): checks for sensor failure and returns true if an error occurred
 * - measureCoinAmounts(): returns the measured fill levels of all coin compartments
 * 
 * @author Team 2
 * @version 1.0
 * @since 2025-06-15
 */
public class CoinStorageSensor {

    public CoinStorageSensor() {

    }

    /**
     * Simulates measurement of all coin compartments.
     * @return Array [5Fr, 2Fr, 1Fr, 50Rp]
     */
    public int[] measureCoinAmounts() {
        Random random = new Random();
        return new int[] {
            random.nextInt(11),  // 5Fr
            random.nextInt(11),  // 2Fr
            random.nextInt(11),  // 1Fr
            random.nextInt(11)   // 50Rp
        };
    }
}
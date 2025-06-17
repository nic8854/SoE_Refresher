package ch.mzgraggen.refresher.coinstoragemanagement;

/**
 * CoinStorageSensor provides methods to access and simulate
 * the built-in sensor of the coin storage unit.
 * It can measure coin levels and detect sensor errors.
 * 
 * Methods:
 * - isSensorError(): checks for sensor failure and returns true if an error occurred
 * - measureCoinAmounts(): returns the measured fill levels of all coin compartments
 * 
 * @version 1.1
 * @since 2025-06-15
 */
public class CoinStorageSensor {

    public CoinStorageSensor() {

    }

    /**
     * Simulates measurement of all coin compartments.
     * @return Array [5Fr, 2Fr, 1Fr, 50Rp] = [5, 2, 1, 50]
     */
    public int[] measureCoinAmounts() {
        return new int[] {5, 2, 1, 50};
    }
}


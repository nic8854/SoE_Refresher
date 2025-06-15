package ch.mzgraggen.refresher.coinstoragemanagement;

/**
 * CoinStorageManagement handles the coin storage subsystem.
 * It periodically updates the fill levels using the sensor and provides access to current data.
 * It also checks for low stock and sensor errors, triggering notifications if necessary.
 * 
 * @author Team 2
 * @version 1.0
 * @since 2025-06-15
 */
public class CoinStorageManagement {

    private CoinStorage coinStorage;
    private CoinStorageSensor sensor;

    public CoinStorageManagement(CoinStorage coinStorage, CoinStorageSensor sensor) {
        this.coinStorage = coinStorage;
        this.sensor = sensor;
    }

    /**
     * Returns the current fill levels from CoinStorage.
     * @return array of coin amounts
     */
    public int[] getStorageAmounts() {
        return coinStorage.getCoinStorageAmounts();
    }

    /**
     * Updates coin fill levels and performs all relevant checks.
     */
    public void updateCoinAmountsPeriodic() {
        updateCoinStorageFromSensor();
    }
    /**
     * Updates the CoinStorage with values measured by the sensor.
     */
    private void updateCoinStorageFromSensor() {
        int[] measured = sensor.measureCoinAmounts();
        coinStorage.setCoinStorageAmounts(measured[0], measured[1], measured[2], measured[3]);
    }
}

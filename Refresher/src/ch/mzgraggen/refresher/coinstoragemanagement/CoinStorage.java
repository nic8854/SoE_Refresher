package ch.mzgraggen.refresher.coinstoragemanagement;

/**
 * CoinStorage stores the fill levels of coin compartments in the vending machine.
 * The data is kept in memory (Mock-DB) as required by the 1st iteration of task 5.
 * 
 * @author Team 2
 * @version 1.0
 * @since 2025-06-15
 */
public class CoinStorage {

    private int amount5fr;
    private int amount2fr;
    private int amount1fr;
    private int amount50rp;

    /**
     * Constructor initializes all coin amounts to 0.
     */
    public CoinStorage() {
        this.amount5fr = 0;
        this.amount2fr = 0;
        this.amount1fr = 0;
        this.amount50rp = 0;
    }

    /**
     * Returns the current coin fill levels as an array.
     * @return Array of coin amounts [5Fr, 2Fr, 1Fr, 50Rp]
     */
    public int[] getCoinStorageAmounts() {
        return new int[] {amount5fr, amount2fr, amount1fr, amount50rp};
    }

    /**
     * Sets the coin fill levels for all coin types.
     * @param f5 Number of 5 Franc coins
     * @param f2 Number of 2 Franc coins
     * @param f1 Number of 1 Franc coins
     * @param rp50 Number of 50 Rappen coins
     */
    public void setCoinStorageAmounts(int f5, int f2, int f1, int rp50) {
        this.amount5fr = f5;
        this.amount2fr = f2;
        this.amount1fr = f1;
        this.amount50rp = rp50;
    }
}

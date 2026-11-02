/*
 * Program: AddCoinsTest.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Test AddCoins with expected results and boundary cases.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddCoinsTest
{
    @Test
    public void matchesTextbookExample()
    {
        assertEquals("$1.08", AddCoins.getDollarAmount(8, 1, 2, 3));
    }
    @Test
    public void formatsZeroAndSingleCent()
    {
        assertEquals("$0.00", AddCoins.getDollarAmount(0, 0, 0, 0));
        assertEquals("$0.01", AddCoins.getDollarAmount(1, 0, 0, 0));
    }
    @Test
    public void valuesEachCoinAndCarriesDollars()
    {
        assertEquals("$0.41", AddCoins.getDollarAmount(1, 1, 1, 1));
        assertEquals("$1.00", AddCoins.getDollarAmount(100, 0, 0, 0));
        assertEquals("$1.00", AddCoins.getDollarAmount(0, 0, 0, 4));
    }
}

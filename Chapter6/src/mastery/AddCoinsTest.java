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

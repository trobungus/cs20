package mastery;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DigitsSumTest
{

    @Test
    public void addsDigitsInTextbookExample()
    {
        assertEquals(19, DigitsSum.calculateDigitSum(892));
    }

    @Test
    public void handlesZero()
    {
        assertEquals(0, DigitsSum.calculateDigitSum(0));
    }

    @Test
    public void includesZeroDigits()
    {
        assertEquals(7, DigitsSum.calculateDigitSum(304));
    }

}

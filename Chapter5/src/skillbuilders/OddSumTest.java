package skillbuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OddSumTest
{

    @Test
    public void addsOddNumbersThroughNine()
    {
        assertEquals(25, OddSum.calculateOddSum(9));
    }

    @Test
    public void stopsAtOddNumberBelowEvenLimit()
    {
        assertEquals(25, OddSum.calculateOddSum(10));
    }

}

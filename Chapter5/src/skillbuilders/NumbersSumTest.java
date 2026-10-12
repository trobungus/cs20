package skillbuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumbersSumTest
{

    @Test
    public void addsNumbersFromOneToFive()
    {
        assertEquals(15, NumbersSum.calculateSum(5));
    }

    @Test
    public void handlesOne()
    {
        assertEquals(1, NumbersSum.calculateSum(1));
    }

}

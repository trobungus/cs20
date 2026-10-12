package skillbuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvensTest
{

    @Test
    public void displaysEvenNumbersFromOneToTwenty()
    {
        assertEquals("2 4 6 8 10 12 14 16 18 20", Evens.getEvenNumbers());
    }

}

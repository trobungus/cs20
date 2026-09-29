package SkillBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RandomNumTest
{

    @Test
    public void staysInsideRange()
    {
        for (int count = 0; count < 100; count++)
        {
            int number = RandomNum.generateNumber(5, 10);
            assertTrue(number >= 5 && number <= 10);
        }
    }

    @Test
    public void handlesOneNumberRange()
    {
        assertEquals(7, RandomNum.generateNumber(7, 7));
    }

    @Test
    public void handlesReversedValues()
    {
        int number = RandomNum.generateNumber(10, 5);
        assertTrue(number >= 5 && number <= 10);
    }

}

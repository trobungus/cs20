/*
 * Program: PerfectIntegersTest.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Test PerfectIntegers with expected results and boundary cases.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PerfectIntegersTest
{
    @Test
    public void findsExactlySixAndTwentyEightThroughOneHundred()
    {
        for (int number = 1; number <= 100; number++)
        {
            assertEquals(number == 6 || number == 28, PerfectIntegers.isPerfect(number),
                    "number " + number);
        }
    }
    @Test
    public void rejectsZeroOneAndNegativeNumbers()
    {
        assertEquals(false, PerfectIntegers.isPerfect(0));
        assertEquals(false, PerfectIntegers.isPerfect(1));
        assertEquals(false, PerfectIntegers.isPerfect(-6));
    }
    @Test
    public void alsoRecognizesTheNextPerfectNumber()
    {
        assertEquals(true, PerfectIntegers.isPerfect(496));
    }
}

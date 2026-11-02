/*
 * Program: ExponentiationTest.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Test Exponentiation with expected results and boundary cases.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExponentiationTest
{
    @Test
    public void calculatesPositiveAndZeroPowers()
    {
        assertEquals(8.0, Exponentiation.powerOf(2, 3), 0.0001);
        assertEquals(1.0, Exponentiation.powerOf(5, 0), 0.0001);
    }
    @Test
    public void calculatesNegativeAndFractionalPowers()
    {
        assertEquals(0.25, Exponentiation.powerOf(2, -2), 0.0001);
        assertEquals(3.0, Exponentiation.powerOf(9, 0.5), 0.0001);
        assertEquals(-8.0, Exponentiation.powerOf(-2, 3), 0.0001);
    }
    @Test
    public void handlesZeroBaseAndPowerOfOne()
    {
        assertEquals(0.0, Exponentiation.powerOf(0, 4), 0.0001);
        assertEquals(7.5, Exponentiation.powerOf(7.5, 1), 0.0001);
    }
}

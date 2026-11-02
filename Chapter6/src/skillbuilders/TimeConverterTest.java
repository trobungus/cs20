/*
 * Program: TimeConverterTest.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Test TimeConverter with expected results and boundary cases.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TimeConverterTest
{
    @Test
    public void convertsAllFourDirections()
    {
        assertEquals(120.0, TimeConverter.hoursToMinutes(2), 0.0001);
        assertEquals(48.0, TimeConverter.daysToHours(2), 0.0001);
        assertEquals(1.5, TimeConverter.minutesToHours(90), 0.0001);
        assertEquals(1.5, TimeConverter.hoursToDays(36), 0.0001);
    }
    @Test
    public void convertsZeroAndFractionalTime()
    {
        assertEquals(0.0, TimeConverter.daysToHours(0), 0.0001);
        assertEquals(30.0, TimeConverter.hoursToMinutes(0.5), 0.0001);
    }
    @Test
    public void convertsAFullDayInBothDirections()
    {
        assertEquals(24.0, TimeConverter.daysToHours(1), 0.0001);
        assertEquals(1.0, TimeConverter.hoursToDays(24), 0.0001);
    }
}

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
}

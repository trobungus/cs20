package Exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TimeConversionTest
{

    @Test
    public void convertsTextbookExample()
    {
        assertEquals("2:15", TimeConversion.formatTime(135));
    }

    @Test
    public void addsLeadingZeroToRemainingMinutes()
    {
        assertEquals("3:04", TimeConversion.formatTime(184));
    }

}

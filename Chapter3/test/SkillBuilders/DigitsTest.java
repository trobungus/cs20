package SkillBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DigitsTest
{

    @Test
    public void separatesTwoDigitNumber()
    {
        assertEquals(4, Digits.getTensDigit(47));
        assertEquals(7, Digits.getOnesDigit(47));
    }

    @Test
    public void separatesNumberEndingInZero()
    {
        assertEquals(9, Digits.getTensDigit(90));
        assertEquals(0, Digits.getOnesDigit(90));
    }

}

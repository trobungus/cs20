package SkillBuilders;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PerfectSquareTest
{

    @Test
    public void identifiesPerfectSquare()
    {
        assertTrue(PerfectSquare.isPerfectSquare(49));
    }

    @Test
    public void rejectsNonPerfectSquare()
    {
        assertFalse(PerfectSquare.isPerfectSquare(50));
    }

    @Test
    public void rejectsNegativeNumber()
    {
        assertFalse(PerfectSquare.isPerfectSquare(-9));
    }

}

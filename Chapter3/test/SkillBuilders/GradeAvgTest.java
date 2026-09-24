package SkillBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeAvgTest
{

    @Test
    public void calculatesAverageUsingRealDivision()
    {
        assertEquals(88.0, GradeAvg.calculateAverage(440, 5), 0.001);
    }

    @Test
    public void preservesDecimalPartOfAverage()
    {
        assertEquals(82.2, GradeAvg.calculateAverage(411, 5), 0.001);
    }

}

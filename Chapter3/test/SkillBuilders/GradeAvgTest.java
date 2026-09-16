package SkillBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeAvgTest
{

    @Test
    public void calculatesAverageUsingRealDivision()
    {
        int[] grades = {89, 97, 78, 91, 85};

        assertEquals(88.0, GradeAvg.calculateAverage(grades), 0.001);
    }

    @Test
    public void preservesDecimalPartOfAverage()
    {
        int[] grades = {80, 81, 82, 83, 85};

        assertEquals(82.2, GradeAvg.calculateAverage(grades), 0.001);
    }

}

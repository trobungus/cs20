package Exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeTest
{

    @Test
    public void givesAGrade()
    {
        assertEquals("A", Grade.getLetterGrade(95));
    }

    @Test
    public void givesBGrade()
    {
        assertEquals("B", Grade.getLetterGrade(85));
    }

    @Test
    public void givesCGrade()
    {
        assertEquals("C", Grade.getLetterGrade(75));
    }

    @Test
    public void givesDGrade()
    {
        assertEquals("D", Grade.getLetterGrade(65));
    }

    @Test
    public void givesFGrade()
    {
        assertEquals("F", Grade.getLetterGrade(45));
    }

    @Test
    public void rejectsInvalidPercentage()
    {
        assertEquals("Invalid percentage", Grade.getLetterGrade(110));
    }

}

package SkillBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectanglePerimeterTest
{

    @Test
    public void calculatesTextbookRectangle()
    {
        assertEquals(34, RectanglePerimeter.calculatePerimeter(4, 13));
    }

    @Test
    public void calculatesAnotherRectangle()
    {
        assertEquals(20, RectanglePerimeter.calculatePerimeter(4, 6));
    }

}

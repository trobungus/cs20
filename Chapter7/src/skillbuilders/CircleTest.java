/*
 * Program: CircleTest.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: JUnit checks for all four Circle skill-builder parts.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CircleTest
{
    @Test
    public void constructorsAndChanges()
    {
        Circle first = new Circle();
        Circle second = new Circle(4);
        assertEquals(1, first.getRadius());
        assertEquals(4, second.getRadius());
        first.setRadius(3);
        assertEquals(3, first.getRadius());
        assertEquals(4, second.getRadius());
    }

    @Test
    public void areaAndCircumference()
    {
        assertEquals(28.26, new Circle(3).area(), 0.000001);
        assertEquals(18.84, new Circle(3).circumference(), 0.000001);
        assertEquals(0, new Circle(0).area());
        assertEquals(3.14, new Circle(0.5).circumference(), 0.000001);
    }

    @Test
    public void equalityAndDescription()
    {
        Circle circle = new Circle(3);
        assertEquals(circle, new Circle(3));
        assertNotEquals(circle, new Circle(4));
        assertNotEquals(circle, null);
        assertNotEquals(circle, "Circle");
        assertEquals(circle.hashCode(), new Circle(3).hashCode());
        assertEquals(new Circle(0).hashCode(), new Circle(-0.0).hashCode());
        assertEquals("Circle has radius 3.0", circle.toString());
    }

    @Test
    public void clientAndFormulaOutput()
    {
        PrintStream original = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try
        {
            System.setOut(new PrintStream(buffer));
            TestCircle.main(new String[0]);
        }
        finally { System.setOut(original); }
        String output = buffer.toString();
        assertTrue(output.contains("Circle circumference: 18.84"));
        assertTrue(output.contains("a=Pi*r*r"));
        assertTrue(output.contains("Same radius: false"));
        assertTrue(output.contains("Same radius after change: true"));
    }
}

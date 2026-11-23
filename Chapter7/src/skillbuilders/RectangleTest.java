/*
 * Program: RectangleTest.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: JUnit checks for all three assigned Rectangle parts.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RectangleTest
{
    @Test
    public void constructorsAndChanges()
    {
        Rectangle box = new Rectangle();
        assertEquals(1, box.getLength());
        assertEquals(1, box.getWidth());
        Rectangle other = new Rectangle(5, 3);
        box.setLength(2.5);
        box.setWidth(4);
        assertEquals(2.5, box.getLength());
        assertEquals(4, box.getWidth());
        assertEquals(5, other.getLength());
        assertEquals(3, other.getWidth());
    }

    @Test
    public void areaAndPerimeter()
    {
        assertEquals(15, new Rectangle(5, 3).area());
        assertEquals(16, new Rectangle(5, 3).perimeter());
        assertEquals(10, new Rectangle(2.5, 4).area());
        assertEquals(0, new Rectangle(0, 3).area());
    }

    @Test
    public void equalityAndDescription()
    {
        Rectangle box = new Rectangle(5, 3);
        assertEquals(box, new Rectangle(5, 3));
        assertNotEquals(box, new Rectangle(3, 5));
        assertNotEquals(box, new Rectangle(5, 4));
        assertNotEquals(box, null);
        assertNotEquals(box, "Rectangle");
        assertEquals(box.hashCode(), new Rectangle(5, 3).hashCode());
        assertEquals("Rectangle has length 5.0 and width 3.0", box.toString());
    }

    @Test
    public void clientAndFormulaOutput()
    {
        PrintStream original = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try
        {
            System.setOut(new PrintStream(buffer));
            TestRectangle.main(new String[0]);
        }
        finally { System.setOut(original); }
        String output = buffer.toString();
        assertTrue(output.contains("Area: 15.0"));
        assertTrue(output.contains("Perimeter: 16.0"));
        assertTrue(output.contains("a=length*width"));
        assertTrue(output.contains("Same dimensions: true"));
        assertTrue(output.contains("Same dimensions after change: false"));
    }
}

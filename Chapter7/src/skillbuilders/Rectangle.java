/*
 * Program: Rectangle.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: Rectangle skill builder, assigned parts 1-3 (pages 154-157).
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

public class Rectangle
{
    private double length;
    private double width;

    /** pre: none; post: a 1 by 1 rectangle is created. */
    public Rectangle()
    {
        length = 1;
        width = 1;
    }

    /** pre: both dimensions are non-negative; post: dimensions are initialized. */
    public Rectangle(double newLength, double newWidth)
    {
        length = newLength;
        width = newWidth;
    }

    /** pre: newLength is non-negative; post: length is updated. */
    public void setLength(double newLength)
    {
        length = newLength;
    }

    /** pre: newWidth is non-negative; post: width is updated. */
    public void setWidth(double newWidth)
    {
        width = newWidth;
    }

    /** pre: none; post: length is returned. */
    public double getLength()
    {
        return length;
    }

    /** pre: none; post: width is returned. */
    public double getWidth()
    {
        return width;
    }

    /** pre: none; post: area is returned. */
    public double area()
    {
        return length * width;
    }

    /** pre: none; post: perimeter is returned. */
    public double perimeter()
    {
        return 2 * (length + width);
    }

    /** pre: none; post: the area formula is displayed. */
    public static void displayAreaFormula()
    {
        System.out.println("The formula for the area of a rectangle is a=length*width");
    }

    /** pre: none; post: true is returned when both dimensions match in order. */
    @Override
    public boolean equals(Object other)
    {
        if (!(other instanceof Rectangle))
        {
            return false;
        }
        Rectangle rectangle = (Rectangle)other;
        return length == rectangle.length && width == rectangle.width;
    }

    /** pre: none; post: equal rectangles return equal hash codes. */
    @Override
    public int hashCode()
    {
        double normalLength = length;
        double normalWidth = width;
        if (normalLength == 0) { normalLength = 0; }
        if (normalWidth == 0) { normalWidth = 0; }
        return Double.hashCode(normalLength) + Double.hashCode(normalWidth);
    }

    /** pre: none; post: a description of both dimensions is returned. */
    @Override
    public String toString()
    {
        return "Rectangle has length " + length + " and width " + width;
    }
}

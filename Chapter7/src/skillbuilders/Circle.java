/*
 * Program: Circle.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: Circle skill builder, parts 1-4 (pages 152-157).
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

public class Circle
{
    private static final double PI = 3.14;
    private double radius;

    /** pre: none; post: the radius is 1. */
    public Circle()
    {
        radius = 1;
    }

    /** pre: r is non-negative; post: the radius is r. */
    public Circle(double r)
    {
        radius = r;
    }

    /** pre: newRadius is non-negative; post: the radius is updated. */
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }

    /** pre: none; post: the current radius is returned. */
    public double getRadius()
    {
        return radius;
    }

    /** pre: none; post: the area is returned using the textbook's PI. */
    public double area()
    {
        return PI * radius * radius;
    }

    /** pre: none; post: the circumference is returned. */
    public double circumference()
    {
        return 2 * PI * radius;
    }

    /** pre: none; post: the area formula is displayed. */
    public static void displayAreaFormula()
    {
        System.out.println("The formula for the area of a circle is a=Pi*r*r");
    }

    /** pre: none; post: true is returned for a Circle with the same radius. */
    @Override
    public boolean equals(Object other)
    {
        if (!(other instanceof Circle))
        {
            return false;
        }
        Circle circle = (Circle)other;
        return radius == circle.radius;
    }

    /** pre: none; post: equal circles return equal hash codes. */
    @Override
    public int hashCode()
    {
        // Normalize zero so that 0.0 and -0.0 agree with equals.
        if (radius == 0)
        {
            return 0;
        }
        return Double.hashCode(radius);
    }

    /** pre: none; post: a description of the radius is returned. */
    @Override
    public String toString()
    {
        return "Circle has radius " + radius;
    }
}

package SkillBuilders;

/*
 * Programmer: Taj Sood
 * Date: September 24, 2026
 * Program: RectanglePerimeter
 * Purpose: Calculate and display the perimeter of a rectangle with width 4
 *          and length 13.
 */
public class RectanglePerimeter
{

    /**
     * Calculates the perimeter of a rectangle.
     *
     * @param width the rectangle width
     * @param length the rectangle length
     * @return the rectangle perimeter
     */
    public static int calculatePerimeter(int width, int length)
    {
        return 2 * width + 2 * length;
    }

    public static void main(String[] args)
    {
        int width = 4;
        int length = 13;
        int perimeter = calculatePerimeter(width, length);

        System.out.println("The perimeter of the rectangle is " + perimeter + ".");
    }

}

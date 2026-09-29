package SkillBuilders;

import java.util.Scanner;

/*
 * Date: September 29, 2026
 * Program: Hurricane
 * Purpose: Display the wind speeds for a hurricane category.
 */
public class Hurricane
{

    /**
     * Returns the wind-speed range for a hurricane category.
     *
     * @param category the hurricane category from 1 to 5
     * @return the matching wind-speed range
     */
    public static String getWindSpeed(int category)
    {
        if (category == 1)
        {
            return "74-95 mph, 64-82 kts, or 119-153 km/hr";
        }
        else if (category == 2)
        {
            return "96-110 mph, 83-95 kts, or 154-177 km/hr";
        }
        else if (category == 3)
        {
            return "111-130 mph, 96-113 kts, or 178-209 km/hr";
        }
        else if (category == 4)
        {
            return "131-155 mph, 114-135 kts, or 210-249 km/hr";
        }
        else if (category == 5)
        {
            return "greater than 155 mph, 135 kts, or 249 km/hr";
        }
        else
        {
            return "Invalid category.";
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the hurricane category: ");
        int category = input.nextInt();

        System.out.println(getWindSpeed(category));

        input.close();
    }

}

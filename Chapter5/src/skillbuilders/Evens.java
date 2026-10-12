package skillbuilders;

/*
 * Date: October 11, 2026
 * Program: Evens
 * Purpose: Display the even numbers from 1 to 20.
 */
public class Evens
{

    /**
     * Creates a list of the even numbers from 1 to 20.
     *
     * @return the even numbers, separated by spaces
     */
    public static String getEvenNumbers()
    {
        String numbers = "";

        for (int number = 2; number <= 20; number += 2)
        {
            numbers += number;

            if (number < 20)
            {
                numbers += " ";
            }
        }

        return numbers;
    }

    public static void main(String[] args)
    {
        System.out.println(getEvenNumbers());
    }

}

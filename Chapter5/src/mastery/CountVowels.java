package mastery;

import java.util.Scanner;

/*
 * Date: October 11, 2026
 * Program: CountVowels
 * Purpose: Count the vowels in a line of text.
 */
public class CountVowels
{

    /**
     * Counts the vowels in the given text.
     *
     * @param text the text to check
     * @return the number of vowels in the text
     */
    public static int countVowels(String text)
    {
        int vowelCount = 0;
        String lowerText = text.toLowerCase();

        for (int index = 0; index < lowerText.length(); index++)
        {
            char letter = lowerText.charAt(index);

            if (letter == 'a' || letter == 'e' || letter == 'i'
                    || letter == 'o' || letter == 'u')
            {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println("The number of vowels in " + text + " is "
                + countVowels(text) + ".");

        input.close();
    }

}

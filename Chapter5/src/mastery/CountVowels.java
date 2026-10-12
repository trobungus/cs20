/*
 * Program: CountVowels.java    Last Date of this Revision: October 11, 2026
 *
 * Purpose: Count the vowels in a line of text.
 *
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

import java.util.Scanner;

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
        int vowelCount = countVowels(text);

        System.out.println("The number of vowels in " + text + " is "
                + vowelCount + ".");

        input.close();
    }

}

/* Screen Dump

Enter text: Java Programming Assignment
The number of vowels in Java Programming Assignment is 8.

 */

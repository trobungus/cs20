/*
 * Program: SpanishNumbers.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Display the Spanish words for numbers 1 through 10.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

public class SpanishNumbers
{
    private static final int LAST_NUMBER = 10;

    /** pre: number is 1 through 10; post: its Spanish word is returned. */
    public static String getSpanishWord(int number)
    {
        if (number == 1)
        {
            return "uno";
        }
        else if (number == 2)
        {
            return "dos";
        }
        else if (number == 3)
        {
            return "tres";
        }
        else if (number == 4)
        {
            return "cuatro";
        }
        else if (number == 5)
        {
            return "cinco";
        }
        else if (number == 6)
        {
            return "seis";
        }
        else if (number == 7)
        {
            return "siete";
        }
        else if (number == 8)
        {
            return "ocho";
        }
        else if (number == 9)
        {
            return "nueve";
        }
        else
        {
            return "diez";
        }
    }

    /** pre: number is 1 through 10; post: its Spanish word is displayed. */
    public static void displayNumber(int number)
    {
        System.out.println(getSpanishWord(number));
    }

    /** pre: none; post: the ten Spanish words are displayed in order. */
    public static void main(String[] args)
    {
        for (int number = 1; number <= LAST_NUMBER; number++)
        {
            displayNumber(number);
        }
    }
}

/* Screen Dump

uno
dos
tres
cuatro
cinco
seis
siete
ocho
nueve
diez

 */

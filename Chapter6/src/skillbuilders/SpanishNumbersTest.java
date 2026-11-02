/*
 * Program: SpanishNumbersTest.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Test SpanishNumbers with expected results and boundary cases.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SpanishNumbersTest
{
    @Test
    public void translatesEveryNumber()
    {
        String[] words = {"uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez"};
        for (int number = 1; number <= 10; number++)
        {
            assertEquals(words[number - 1], SpanishNumbers.getSpanishWord(number));
        }
    }
    @Test
    public void mainDisplaysTenWordsInOrder()
    {
        java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
        java.io.PrintStream original = System.out;
        try
        {
            System.setOut(new java.io.PrintStream(output));
            SpanishNumbers.main(new String[0]);
        }
        finally
        {
            System.setOut(original);
        }
        assertEquals("uno\ndos\ntres\ncuatro\ncinco\nseis\nsiete\nocho\nnueve\ndiez\n",
                output.toString().replace("\r\n", "\n"));
    }
    @Test
    public void displaysTheWordForOnePassedNumber()
    {
        java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
        java.io.PrintStream original = System.out;
        try
        {
            System.setOut(new java.io.PrintStream(output));
            SpanishNumbers.displayNumber(4);
        }
        finally
        {
            System.setOut(original);
        }
        assertEquals("cuatro", output.toString().trim());
    }
}

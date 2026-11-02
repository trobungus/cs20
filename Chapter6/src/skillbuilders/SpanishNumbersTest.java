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
}

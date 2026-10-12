package mastery;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountVowelsTest
{

    @Test
    public void countsUppercaseAndLowercaseVowels()
    {
        assertEquals(5, CountVowels.countVowels("Education"));
    }

    @Test
    public void ignoresSpacesAndConsonants()
    {
        assertEquals(0, CountVowels.countVowels("rhythm myths"));
    }

    @Test
    public void countsVowelsInTextbookPhrase()
    {
        assertEquals(8, CountVowels.countVowels("Java Programming Assignment"));
    }

}

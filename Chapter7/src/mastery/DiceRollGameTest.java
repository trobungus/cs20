/*
 * Program: DiceRollGameTest.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: JUnit boundary and scoring checks for exercise 4.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;

public class DiceRollGameTest
{
    @Test
    public void diceStayInRange()
    {
        Die die = new Die();
        DRPlayer player = new DRPlayer();
        assertEquals(1, die.getFace());
        assertEquals(1000, player.getPoints());
        for (int i = 0; i < 500; i++)
        {
            int face = die.roll();
            assertTrue(face >= 1 && face <= 6);
            assertEquals(face, die.getFace());
            int total = player.rollDice();
            assertTrue(total >= 2 && total <= 12);
        }
    }

    @Test
    public void allLowAndHighOutcomes()
    {
        for (int total = 2; total <= 12; total++)
        {
            DRPlayer low = new DRPlayer();
            DRPlayer high = new DRPlayer();
            assertEquals(total <= 6, low.scoreRound(100, DRPlayer.LOW, total));
            assertEquals(total >= 8, high.scoreRound(100, DRPlayer.HIGH, total));
            assertEquals(total <= 6 ? 1200 : 900, low.getPoints());
            assertEquals(total >= 8 ? 1200 : 900, high.getPoints());
        }
    }

    @Test
    public void textbookScoreSequenceAndAllIn()
    {
        DRPlayer player = new DRPlayer();
        player.scoreRound(100, DRPlayer.HIGH, 3);
        assertEquals(900, player.getPoints());
        player.scoreRound(100, DRPlayer.LOW, 5);
        assertEquals(1100, player.getPoints());
        player.scoreRound(100, DRPlayer.HIGH, 8);
        assertEquals(1300, player.getPoints());
        player.scoreRound(1300, DRPlayer.LOW, 7);
        assertEquals(0, player.getPoints());
    }

    @Test
    public void consoleRejectsInvalidRiskAndCanQuit()
    {
        java.io.InputStream originalInput = System.in;
        PrintStream originalOutput = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try
        {
            System.setIn(new ByteArrayInputStream("abc 1001 0 -1".getBytes()));
            System.setOut(new PrintStream(output));
            DiceRollGame.main(new String[0]);
        }
        finally
        {
            System.setIn(originalInput);
            System.setOut(originalOutput);
        }
        assertTrue(output.toString().contains("Enter a whole number"));
        assertTrue(output.toString().contains("Enter a number from -1 to 1000"));
        assertTrue(output.toString().contains("Risk at least 1 point"));
    }
}

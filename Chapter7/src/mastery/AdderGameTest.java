/*
 * Program: AdderGameTest.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: JUnit checks for attempts, points, quit behaviour and question limits.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class AdderGameTest
{
    @Test
    public void questionBoundariesAndRandomNumbers()
    {
        assertEquals(0, new Adder(0, 0).getAnswer());
        assertEquals(40, new Adder(20, 20).getAnswer());
        assertTrue(new Adder(3, 9).isCorrect(12));
        assertFalse(new Adder(3, 9).isCorrect(11));
        for (int i = 0; i < 500; i++)
        {
            Adder problem = new Adder();
            assertTrue(problem.getFirstNumber() >= 0 && problem.getFirstNumber() <= 20);
            assertTrue(problem.getSecondNumber() >= 0 && problem.getSecondNumber() <= 20);
        }
    }

    @Test
    public void awardsFiveThreeAndOnePoints()
    {
        AdderPlayer player = new AdderPlayer();
        assertEquals(0, player.getScore());
        assertTrue(AdderGame.playProblem(new Adder(3, 9), player, new Scanner("12")));
        assertEquals(5, player.getScore());
        AdderGame.playProblem(new Adder(3, 9), player, new Scanner("11 12"));
        assertEquals(8, player.getScore());
        AdderGame.playProblem(new Adder(3, 9), player, new Scanner("10 11 12"));
        assertEquals(9, player.getScore());
    }

    @Test
    public void threeWrongAnswersRevealAnswerAndDoNotScore()
    {
        PrintStream original = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        AdderPlayer player = new AdderPlayer();
        Scanner input = new Scanner("1 2 3 999");
        try
        {
            System.setOut(new PrintStream(output));
            assertTrue(AdderGame.playProblem(new Adder(3, 9), player, input));
        }
        finally { System.setOut(original); }
        assertEquals(0, player.getScore());
        assertTrue(output.toString().contains("The correct answer is: 12"));
        assertEquals(999, input.nextInt());
    }

    @Test
    public void quitWorksOnEveryAttempt()
    {
        AdderPlayer player = new AdderPlayer();
        assertFalse(AdderGame.playProblem(new Adder(3, 9), player, new Scanner("999")));
        assertFalse(AdderGame.playProblem(new Adder(3, 9), player, new Scanner("1 999")));
        assertFalse(AdderGame.playProblem(new Adder(3, 9), player, new Scanner("1 2 999")));
        assertEquals(0, player.getScore());
    }

    @Test
    public void lettersDoNotUseUpAnAttempt()
    {
        AdderPlayer player = new AdderPlayer();
        assertTrue(AdderGame.playProblem(new Adder(3, 9), player, new Scanner("hello 12")));
        assertEquals(5, player.getScore());
    }
}

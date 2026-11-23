/*
 * Program: AdderGame.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: Exercise 8: answer addition questions with up to three attempts.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

import java.util.Scanner;

public class AdderGame
{
    private static final int QUIT = 999;
    private static final int MAX_TRIES = 3;

    /** pre: input is available; post: an integer answer is returned. */
    private static int readAnswer(Scanner input)
    {
        while (!input.hasNextInt())
        {
            input.next();
            System.out.print("Enter a whole number: ");
        }
        return input.nextInt();
    }

    /**
     * pre: problem, player, and input are non-null and input is available.
     * post: up to three guesses are read; returns false if 999 was entered.
     */
    public static boolean playProblem(Adder problem, AdderPlayer player, Scanner input)
    {
        System.out.print(problem);
        for (int attempt = 1; attempt <= MAX_TRIES; attempt++)
        {
            int answer = readAnswer(input);
            if (answer == QUIT)
            {
                return false;
            }
            if (problem.isCorrect(answer))
            {
                player.addPoints(attempt);
                return true;
            }
            if (attempt < MAX_TRIES)
            {
                System.out.print("Wrong answer. Enter another answer: ");
            }
        }
        System.out.println("The correct answer is: " + problem.getAnswer());
        return true;
    }

    /** pre: input is available; post: the final score is displayed after 999. */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        AdderPlayer player = new AdderPlayer();
        System.out.println("Enter 999 at any answer to quit.");
        boolean playing = true;
        while (playing)
        {
            playing = playProblem(new Adder(), player, input);
        }
        System.out.println("Your score is: " + player.getScore());
        input.close();
    }
}

/* Screen Dump
Console run: AdderGame
Supplied input: -1, -1, -1, 999
Enter 999 at any answer to quit.
8 + 20 = Wrong answer. Enter another answer: Wrong answer. Enter another answer: The correct answer is: 28
4 + 7 = Your score is: 0
*/

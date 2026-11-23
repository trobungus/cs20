/*
 * Program: DiceRollGame.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: Exercise 4: risk points on a high or low roll of two dice.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

import java.util.Scanner;

public class DiceRollGame
{
    /** pre: integer input is available; post: a number in the range is returned. */
    private static int readNumber(Scanner input, String prompt, int minimum, int maximum)
    {
        System.out.print(prompt);
        while (!input.hasNextInt())
        {
            input.next();
            System.out.print("Enter a whole number: ");
        }
        int number = input.nextInt();
        while (number < minimum || number > maximum)
        {
            System.out.print("Enter a number from " + minimum + " to " + maximum + ": ");
            while (!input.hasNextInt())
            {
                input.next();
                System.out.print("Enter a whole number: ");
            }
            number = input.nextInt();
        }
        return number;
    }

    /** pre: console input is available; post: play ends on -1 or no points. */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DRPlayer player = new DRPlayer();
        boolean playing = true;
        while (playing && player.getPoints() > 0)
        {
            System.out.println("You have " + player.getPoints() + " points.");
            int risk = readNumber(input,
                    "How many points do you want to risk? (-1 to quit) ",
                    -1, player.getPoints());
            if (risk == -1)
            {
                playing = false;
            }
            else if (risk == 0)
            {
                System.out.println("Risk at least 1 point.");
            }
            else
            {
                int call = readNumber(input, "Make a call (0 for low, 1 for high): ",
                        DRPlayer.LOW, DRPlayer.HIGH);
                int total = player.rollDice();
                player.scoreRound(risk, call, total);
                System.out.println("You rolled: " + total);
                System.out.println("You now have " + player.getPoints() + " points.");
            }
        }
        if (player.getPoints() == 0)
        {
            System.out.println("No points left. Game over.");
        }
        input.close();
    }
}

/* Screen Dump
Console run: DiceRollGame
Supplied input: 100, 0, -1
You have 1000 points.
How many points do you want to risk? (-1 to quit) Make a call (0 for low, 1 for high): You rolled: 12
You now have 900 points.
You have 900 points.
How many points do you want to risk? (-1 to quit) */

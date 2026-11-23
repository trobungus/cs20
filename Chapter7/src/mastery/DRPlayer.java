/*
 * Program: DRPlayer.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: Store dice and update a player score for exercise 4.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

public class DRPlayer
{
    public static final int LOW = 0;
    public static final int HIGH = 1;
    private static final int STARTING_POINTS = 1000;
    private static final int LOW_MAX = 6;
    private static final int HIGH_MIN = 8;
    private final Die firstDie;
    private final Die secondDie;
    private int points;

    /** pre: none; post: the player has two dice and 1000 points. */
    public DRPlayer()
    {
        firstDie = new Die();
        secondDie = new Die();
        points = STARTING_POINTS;
    }

    /** pre: none; post: both dice are rolled and their total is returned. */
    public int rollDice()
    {
        return firstDie.roll() + secondDie.roll();
    }

    /** pre: none; post: the current points are returned. */
    public int getPoints()
    {
        return points;
    }

    /**
     * pre: 1 <= risk <= points, call is LOW or HIGH, and total is 2..12.
     * post: a correct call adds twice the risk; a wrong call loses the risk.
     */
    public boolean scoreRound(int risk, int call, int total)
    {
        boolean correct = (call == LOW && total <= LOW_MAX)
                || (call == HIGH && total >= HIGH_MIN);
        if (correct)
        {
            points += 2 * risk;
        }
        else
        {
            points -= risk;
        }
        return correct;
    }
}

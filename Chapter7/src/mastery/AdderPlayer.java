/*
 * Program: AdderPlayer.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: Track points earned in the Adder game.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

public class AdderPlayer
{
    private static final int FIRST_TRY_POINTS = 5;
    private static final int SECOND_TRY_POINTS = 3;
    private static final int THIRD_TRY_POINTS = 1;
    private int score;

    /** pre: none; post: the score starts at zero. */
    public AdderPlayer() { score = 0; }

    /** pre: attempt is 1..3; post: points for that successful attempt are added. */
    public void addPoints(int attempt)
    {
        if (attempt == 1) { score += FIRST_TRY_POINTS; }
        else if (attempt == 2) { score += SECOND_TRY_POINTS; }
        else if (attempt == 3) { score += THIRD_TRY_POINTS; }
    }

    /** pre: none; post: the current score is returned. */
    public int getScore() { return score; }
}

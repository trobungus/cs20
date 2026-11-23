/*
 * Program: Die.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: A six-sided die used by DiceRollGame (exercise 4).
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

public class Die
{
    private static final int SIDES = 6;
    private int face;

    /** pre: none; post: the initial face is 1. */
    public Die()
    {
        face = 1;
    }

    /** pre: none; post: a random face from 1 through 6 is stored and returned. */
    public int roll()
    {
        face = (int)(Math.random() * SIDES) + 1;
        return face;
    }

    /** pre: none; post: the last face is returned. */
    public int getFace()
    {
        return face;
    }
}

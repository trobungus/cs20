/*
 * Program: Adder.java
 * Last Date of this Revision: November 21, 2026
 * Purpose: Store an addition problem for the Adder game (exercise 8).
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

public class Adder
{
    private static final int MAX_NUMBER = 20;
    private final int firstNumber;
    private final int secondNumber;

    /** pre: none; post: two random integers in 0..20 are chosen. */
    public Adder()
    {
        firstNumber = (int)(Math.random() * (MAX_NUMBER + 1));
        secondNumber = (int)(Math.random() * (MAX_NUMBER + 1));
    }

    /** pre: both numbers are 0..20; post: the supplied problem is stored. */
    public Adder(int first, int second)
    {
        firstNumber = first;
        secondNumber = second;
    }

    /** pre: none; post: the first number is returned. */
    public int getFirstNumber() { return firstNumber; }

    /** pre: none; post: the second number is returned. */
    public int getSecondNumber() { return secondNumber; }

    /** pre: none; post: the correct sum is returned. */
    public int getAnswer() { return firstNumber + secondNumber; }

    /** pre: none; post: true is returned if answer is correct. */
    public boolean isCorrect(int answer) { return answer == getAnswer(); }

    /** pre: none; post: a printable problem is returned. */
    @Override
    public String toString() { return firstNumber + " + " + secondNumber + " = "; }
}

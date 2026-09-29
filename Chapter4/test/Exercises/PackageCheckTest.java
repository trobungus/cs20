package Exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PackageCheckTest
{

    @Test
    public void acceptsPackageWithinLimits()
    {
        assertEquals("Package accepted.",
                PackageCheck.getMessage(20, 40, 40, 40));
    }

    @Test
    public void detectsHeavyPackage()
    {
        assertEquals("Too heavy.",
                PackageCheck.getMessage(32, 10, 25, 33));
    }

    @Test
    public void detectsLargePackage()
    {
        assertEquals("Too large.",
                PackageCheck.getMessage(20, 50, 50, 50));
    }

    @Test
    public void detectsHeavyAndLargePackage()
    {
        assertEquals("Too heavy and too large.",
                PackageCheck.getMessage(30, 50, 50, 50));
    }

}

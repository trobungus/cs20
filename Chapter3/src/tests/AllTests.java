package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import mastery.PizzaCostTest;
import mastery.TimeConversionTest;
import skillbuilders.DigitsTest;
import skillbuilders.GradeAvgTest;
import skillbuilders.RectanglePerimeterTest;

@Suite
@SelectClasses({
        DigitsTest.class,
        GradeAvgTest.class,
        RectanglePerimeterTest.class,
        PizzaCostTest.class,
        TimeConversionTest.class
})
public class AllTests
{
    // This suite runs every Chapter 3 JUnit test in one Eclipse test run.
}

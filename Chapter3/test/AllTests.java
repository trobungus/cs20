import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import Exercises.PizzaCostTest;
import Exercises.TimeConversionTest;
import SkillBuilders.DigitsTest;
import SkillBuilders.GradeAvgTest;
import SkillBuilders.RectanglePerimeterTest;

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

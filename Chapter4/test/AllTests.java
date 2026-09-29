import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import Exercises.GradeTest;
import Exercises.PackageCheckTest;
import SkillBuilders.DeliveryTest;
import SkillBuilders.HurricaneTest;
import SkillBuilders.PerfectSquareTest;
import SkillBuilders.RandomNumTest;

@Suite
@SelectClasses({
        HurricaneTest.class,
        RandomNumTest.class,
        DeliveryTest.class,
        PerfectSquareTest.class,
        PackageCheckTest.class,
        GradeTest.class
})
public class AllTests
{
    // This suite runs every Chapter 4 JUnit test in one Eclipse test run.
}

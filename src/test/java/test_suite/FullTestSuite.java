package test_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import buisness.SampleTest;

@RunWith(Suite.class)
@SuiteClasses({
	SampleTest.class
})
public class FullTestSuite {

}

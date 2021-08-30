package TestNGTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CollegeCampus {
	
	/*
	 * BeforeTest and Test are implemented
	 */
	@Test
	public void engineer1Test()
	{
		System.out.println("Test1 of CollegeCampus");
	}
	
	@Test
	public void engineer2Test()
	{
		System.out.println("Test2 of CollegeCampus");
	}
	
	@Test
	public void ExcludedTestcase()
	{
		System.out.println("This is the excluded testcase");
	}
	@BeforeTest
	public void beforeEngineerTest()
	{
		System.out.println("I get executed before all tests of CollegeCampus");
	}

}

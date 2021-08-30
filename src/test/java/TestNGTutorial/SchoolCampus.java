package TestNGTutorial;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SchoolCampus {
	
	@Test(groups= {"Smoke"})
	public void groupExampleWithoutTag()
	{
		System.out.println("This is an example for groups WITH groups tag");
	}
	
	@Test
	public void student1Test()
	{
		System.out.println("test1 of SchoolCampus");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I executes after whole Suite");
	}
	@Test
	public void student2Test()
	{
		System.out.println("test2 of SchoolCampus");
	}
	
	@BeforeTest
	public void beforeStudentTest()
	{
		System.out.println("I get executd before all tests of school campus");
	}
	
	@AfterTest
	public void afterStudentTest() 
	{
		System.out.println("I get executd after all tests of school campus");
	}

	@BeforeSuite
	public void befoeSuite()
	{
		System.out.println("I own the first line");
	}
}

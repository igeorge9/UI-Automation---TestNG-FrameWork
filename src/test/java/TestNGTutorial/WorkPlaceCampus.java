package TestNGTutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WorkPlaceCampus {

	/*
	 * BeforeMethod and AfterMethod are implemented
	 */
	@BeforeMethod
	public void beforeMethodWork()
	{
		System.out.println("I will be executing before every method");
	}
	
	@Test
	public void workTestFood()
	{
		System.out.println("Workplace food area");
	}
	
	@AfterMethod
	public void afterMethodWork()
	{
		System.out.println("I will be executing after every method");
	}
	
	@Test
	public void workTestGames()
	{
		System.out.println("Workplace games area");
	}
	
	@Test
	public void IncludedTestcase()
	{
		System.out.println("This is the included testcase");
	}
	
}

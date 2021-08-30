package TestNGTutorial;

import org.testng.annotations.Test;

public class GroupsTestCase {
	
	@Test
	public void groups1ExamplewithTag()
	{
		System.out.println("This is the first example for groups WITHOUT groups tag");
	}
	
	@Test(groups= {"Smoke"})
	public void groups1ExampleWithoutTag()
	{
		System.out.println("This is the first example for groups WITH groups tag");
	}

}

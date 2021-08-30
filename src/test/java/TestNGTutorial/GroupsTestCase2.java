package TestNGTutorial;

import org.testng.annotations.Test;

public class GroupsTestCase2 {
	
	@Test(groups= {"Smoke"})
	public void groups2ExampleWithoutTag()
	{
		System.out.println("This is the second example for groups WITH groups tag");
	}

}

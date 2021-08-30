package TestNGTutorial;

import org.testng.annotations.Test;

public class HelperAttributes {

	@Test(dependsOnMethods= {"authenticationMethod","authorizationMethod"})
	public void login()
	{
		System.out.println("This is the login method");
	}
	
	@Test
	public void authenticationMethod()
	{
		System.out.println("This is the authentication method");
	}
	
	@Test(dependsOnMethods={"authenticationMethod"})
	public void authorizationMethod()
	{
		System.out.println("This is the authorization method");
	}
	
	
}

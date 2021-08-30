package TestNGTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization1 {
	
	@Parameters({"URL"})
	@Test
	public void parameterMethod(String url)
	{
		System.out.println(url);
	}
	
	@Parameters({"URL","Key"})
	@Test
	public void parameterMethod2(String url, String key)
	{
		System.out.println(url);
		System.out.println(key);
	}

}

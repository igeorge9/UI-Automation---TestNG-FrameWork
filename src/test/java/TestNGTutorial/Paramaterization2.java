package TestNGTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramaterization2 {
	
	@Parameters({"Headers"})
	@Test
	public void parameterMethod3(String headers)
	{
		System.out.println(headers);
	}

}

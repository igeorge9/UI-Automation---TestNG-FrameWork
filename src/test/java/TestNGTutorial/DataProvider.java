package TestNGTutorial;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="getTestData")
	public void dataProviderMethod(String username,String pwd)
	{
		System.out.println("Username is "+username + " and Password is "+pwd);
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] getTestData()
	{
		Object[][] testData= new Object[3][2];
//		set1 
		testData[0][0]="usename01";
		testData[0][1]="password1";
		
//		set2 
		testData[1][0]="usename02";
		testData[1][1]="password2";
		
//		set3
		testData[2][0]="usename03";
		testData[2][1]="password3";
		
		return testData;
		
	}
}

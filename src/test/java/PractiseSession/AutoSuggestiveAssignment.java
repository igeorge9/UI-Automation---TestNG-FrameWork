package PractiseSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestiveAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		
		Thread.sleep(3000);
		List<WebElement> countries= driver.findElements(By.className("ui-menu-item"));
		for(int i=0;i<countries.size();i++)
		{
			if(countries.get(i).getText().equalsIgnoreCase("United States Minor Outlying Islands"))
			{
				
				String countryName=countries.get(i).getText();
				System.out.println(countryName);
				countries.get(i).click();
				
					if(!countryName.equalsIgnoreCase("United States Minor Outlying Islands"))
					{
						Assert.assertTrue(false);
					}
			  
				break;
			}
			else
				i++;
		}
//		
	}

}

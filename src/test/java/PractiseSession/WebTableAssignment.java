package PractiseSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		/*
		 * To find the number of rows and columns in the webtable 1
		 */
		
		int rows=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
		int columsn=driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th")).size(); 
		
		System.out.println("There are " + rows+" rows and "+columsn+" columns in the webtable");
		
		/*
		 * To print the values in third row
		 */
		List<WebElement> thirdRow=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		
		for(int i=0;i<thirdRow.size();i++)
		{
			System.out.println(thirdRow.get(i).getText());
		}
	}

}

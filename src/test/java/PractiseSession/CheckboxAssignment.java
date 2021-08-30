package PractiseSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement option1=driver.findElement(By.cssSelector("input[name='checkBoxOption1']"));
		/*
		 * Check the checkbox and verify it is unchecked successfully
		 */
		Assert.assertFalse(option1.isSelected());
		option1.click();
		Assert.assertTrue(option1.isSelected());
		/*
		 * Uncheck the checkbox and verify it is unchecked successfully
		 */
		option1.click();
		Assert.assertFalse(option1.isSelected());
		
		List<WebElement> count= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(count.size());
		
	}
}

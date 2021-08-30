package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		
		WebElement checkBox= driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount"));
		Assert.assertFalse(checkBox.isSelected());
//		System.out.println("Checkbox is selected "+checkBox.isSelected());
		checkBox.click();
//		System.out.println("Checkbox is selected "+checkBox.isSelected());
		Assert.assertTrue(checkBox.isSelected());
		
		System.out.println("Total number of checkboxes "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		Thread.sleep(4000);
		driver.close();
		
		/*
		 * Assertions suing TestNG
		 */
		
		
	}

}

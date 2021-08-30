package PractiseSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ar");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.className("ui-menu-item"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("Syrian Arab Republic"))
			{
				option.click();
				break;
			}
			
		}
	Thread.sleep(4000);
	driver.quit();

	}

}

package PractiseSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCartExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		String name="Grapes";
		
		List<WebElement> itemsName= driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<itemsName.size();i++) 
		{
			String[] itemName=itemsName.get(i).getText().split("-");
			String formattedName=itemName[0].trim();
			
			if(name.contains(formattedName))
				{
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					break;
				}
		}
		
	}

}

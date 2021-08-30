package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenCartFilterStreams {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("search-field")).sendKeys("an");
		
		List<WebElement> veggiesList=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement>filteredList=veggiesList.stream().filter(s->s.getText().contains("an")).collect(Collectors.toList());
		
		Assert.assertEquals(filteredList.size(), veggiesList.size());
		
		Thread.sleep(4000);
		driver.close();
		}
}

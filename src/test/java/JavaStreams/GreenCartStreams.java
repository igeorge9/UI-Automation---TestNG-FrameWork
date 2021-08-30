package JavaStreams;


import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenCartStreams {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
//		Click the button
		driver.findElement(By.cssSelector("[aria-label*='Veg/fruit name']")).click();
		
//		Get the elements into a list -original list
		List<WebElement> veggienames= driver.findElements(By.xpath("//tr/td[1]"));
		
//		Another list with the veggie names copied
		List<String> originalList=veggienames.stream().map(s->s.getText()).collect(Collectors.toList());
		
//		Sort the elements in the list - sorted list
		List<String> sortedList=veggienames.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		
//		Compare the elements n the sorted list and original list
		
		Assert.assertEquals(originalList, sortedList);
	}

}

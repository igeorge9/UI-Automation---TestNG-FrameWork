package SDETTraining.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatElementsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement element= driver.findElement(By.xpath("//input[@title='Search']"));
		element.sendKeys("w3schools");
		element.submit();
		
		
	}

}

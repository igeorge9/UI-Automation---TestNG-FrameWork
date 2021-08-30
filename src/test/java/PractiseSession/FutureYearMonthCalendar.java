package PractiseSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FutureYearMonthCalendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[name='travel_date']")).click();

		List<WebElement> datepicker=driver.findElements(By.cssSelector("[class='datepicker-months']"));
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("January"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
					
		}
		List<WebElement> days = driver.findElements(By.cssSelector("[class*='day']"));

		for (int i = 0; i < days.size(); i++) {
			if (days.get(i).getText().contains("31"))
				days.get(i).click();
		}
	}

}

package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.id("Adults")).click();
		Select adults= new Select(driver.findElement(By.id("Adults")));
		adults.selectByValue("4");
		
		driver.findElement(By.id("Childrens")).click();
		Select children= new Select(driver.findElement(By.id("Childrens")));
		children.selectByValue("2");
		
		driver.findElement(By.cssSelector("#MoreOptionsLink")).click();
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("SpiceJet");
		driver.findElement(By.xpath("//input[@value='Search flights']")).click();
		
		Thread.sleep(1500);
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}

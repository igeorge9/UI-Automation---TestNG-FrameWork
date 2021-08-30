package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(1500L);
		driver.findElement(By.xpath("(//a[@text='Coimbatore (CJB)'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("flightSearchContainer")).click();
		driver.findElement(By.className("ui-state-default.ui-state-active")).click(); // not working
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}

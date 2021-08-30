package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassengerDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement passenger= driver.findElement(By.id("divpaxinfo"));
		passenger.click();
		System.out.println(passenger.getText());
		Thread.sleep(2000L);
		int numberofAdult= 1;
		while(numberofAdult<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			numberofAdult++;
		}
		int numberofChild=0;
		while(numberofChild<4)
		{
			driver.findElement(By.id("hrefIncChd")).click();
			numberofChild++;
		}
		driver.findElement(By.id("hrefIncInf")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(passenger.getText());
	}

}

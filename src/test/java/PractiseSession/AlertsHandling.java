package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.name("enter-name")).sendKeys("Janet");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String okMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

		System.out.println(okMsg);

//		Confirm or dismiss functions of alerts

		driver.findElement(By.name("enter-name")).sendKeys("Janet");
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		String confirmMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();

		System.out.println(confirmMsg);
	}

}

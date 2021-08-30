package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Actions action= new Actions(driver);
		WebElement textBox= driver.findElement(By.id("twotabsearchtextbox"));
//		action.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("backpack").doubleClick().build().perform();

		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().click().build().perform();

	}

}

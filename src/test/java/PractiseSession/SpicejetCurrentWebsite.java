package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class SpicejetCurrentWebsite {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(1500L);
		driver.findElement(By.xpath("(//a[@text='Coimbatore (CJB)'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(1500);
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		/*
		 * Ensure the return date is disabled for round trip
		 */
		WebElement returnDate=driver.findElement(By.id("Div1"));
		String check=returnDate.getAttribute("style");

		if(check.contains("0.5"))
			System.out.println("The return date has been disabled successfully "+check);
		else
		{
			Assert.assertTrue(false);
			System.out.println("The return date is not disabled "+check);
		}
		
		Thread.sleep(1500);
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement Adult=driver.findElement(By.name("ctl00$mainContent$ddl_Adult"));
		WebElement Child=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		WebElement Infant=driver.findElement(By.name("ctl00$mainContent$ddl_Infant"));
		Thread.sleep(1000);
		
//		To select the number of adults from dropdown
		Adult.click();
		Select selectAdult = new Select(Adult);
		selectAdult.selectByValue("3");
		Thread.sleep(1000);
		
//		To select the number of children from dropdown
		Child.click();
		Select selectChild= new Select(Child);
		selectChild.selectByVisibleText("2");
		Thread.sleep(1000);
		
//		To select the number of infants from dropdown
		Infant.click();
		Select selectInfant= new Select(Infant);
		selectInfant.selectByVisibleText("1");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(4000);
		driver.close();
		
	}

}

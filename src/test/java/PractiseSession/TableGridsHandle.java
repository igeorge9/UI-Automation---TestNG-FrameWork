package PractiseSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TableGridsHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		int sum=0;
		int sum1=0;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");

		Thread.sleep(2000);
//		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		/*
		 * The Sum of elements in first table
		 */

		List<WebElement> priceOfCourses=driver.findElements(By.xpath("(//table[@id='product'])[1]//td[3]"));
		
		for(int j=0;j<priceOfCourses.size();j++)
		{
			String price=priceOfCourses.get(j).getText();
			sum1=sum1+Integer.parseInt(price);
		}
		
		System.out.println(sum1);
		
		
		/*
		 * The Sum of elements in second table is below
		*/ 
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));

		for (int i = 0; i < values.size(); i++) {
			String value=values.get(i).getText();
			sum=sum+Integer.parseInt(value);
		}
		System.out.println(sum);
		
		String totalAmt=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		Assert.assertEquals(Integer.parseInt(totalAmt), sum);
	
	
}
}

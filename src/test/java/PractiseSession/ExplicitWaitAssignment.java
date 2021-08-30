package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitAssignment {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
			driver.manage().window().maximize();
		
//			a[@href='javascript: void(0);loadAjax();')
			//a[contains(text(),'data via Ajax!')]
			driver.findElement(By.xpath("//a[contains(text(),'data via Ajax!')]")).click();
			WebDriverWait wait= new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
			System.out.println(driver.findElement(By.id("results")).getText());
			

	}

}

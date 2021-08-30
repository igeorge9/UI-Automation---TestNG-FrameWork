package PractiseSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		int countOfLinks=driver.findElements(By.tagName("a")).size();
		System.out.println("countOfLinks "+countOfLinks);
		
		WebElement footerDriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int footerLinksCount=footerDriver.findElements(By.tagName("a")).size();
		System.out.println("footerLinksCount "+footerLinksCount);
		
		WebElement columnDriver=footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		int columnLinksCount=columnDriver.findElements(By.tagName("a")).size();
		System.out.println("columnLinksCount "+columnLinksCount);
		
		for(int i=1;i<columnLinksCount;i++)
		{
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			Thread.sleep(3000);
		}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		
		int count=0;
		while(count<columnLinksCount)
		{
			String childWindow=it.next();
			String title=driver.switchTo().window(childWindow).getTitle();
			System.out.println(title);
			count++;
			
		}
	}

}

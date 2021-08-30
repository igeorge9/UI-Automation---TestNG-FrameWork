package PractiseSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		String childWindowTxt=driver.findElement(By.cssSelector("div[class='example']")).getText();
		System.out.println(childWindowTxt);
		
		driver.switchTo().window(parentWindow);
		String parentWindowTXt=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(parentWindowTXt);
	}
	

}

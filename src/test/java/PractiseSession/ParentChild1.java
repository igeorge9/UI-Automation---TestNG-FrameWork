package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.get("https://www.rahulshettyacademy.com");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//div[@class='LX3sZb']/div/div/div/div/div[2]/a")).click();
//		driver.findElement(By.xpath("//div[@class='nav-outer clearfix']/nav/div[2]/ul/li[1]")).click();
//		driver.findElement(By.xpath("//li[@routerlinkactive='current']/following-sibling::li[1]")).click();
//		driver.findElement(By.xpath("//li[@routerlinkactive='current']/following-sibling::li[2]")).click();
//		driver.findElement(By.xpath("//li[@routerlinkactive='current']/following-sibling::li[3]")).click();
//		driver.findElement(By.xpath("//li[@routerlinkactive='current']/following-sibling::li[4]")).click();
		driver.findElement(By.xpath("//li[@routerlinkactive='current']/parent::ul")).click();
//		driver.navigate().back();
	}

}

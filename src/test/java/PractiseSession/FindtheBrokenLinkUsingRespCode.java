package PractiseSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class FindtheBrokenLinkUsingRespCode {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		SoftAssert sa= new SoftAssert();
		
		List<WebElement> links = driver.findElements(By.cssSelector("[class='gf-li'] a"));
		for(WebElement link : links)
		{
			String url= link.getAttribute("href");
			HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responseCode=connection.getResponseCode();
			sa.assertTrue(responseCode<400,"The link having linkText "+link.getText()+" is broken and has responseCode "+responseCode);
			
		}
		
		sa.assertAll();

	}

}

package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown= new Select(staticDropdown);
		dropDown.selectByIndex(1);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByValue("USD");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByValue("AED");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
	}

}

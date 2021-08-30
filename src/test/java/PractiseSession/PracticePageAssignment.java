package PractiseSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticePageAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement selectedOption=driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
		String selectedText=driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		selectedOption.click();
		
//		Select the grabbed element to the dropdown
		
		WebElement selectedDropdown=driver.findElement(By.id("dropdown-class-example"));
		Select dropDown=new Select(selectedDropdown);
//		dropDown.selectByValue(selectedText);
		dropDown.selectByVisibleText(selectedText);
		
//		Enter the name in the Alert textbox
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(selectedText);
		driver.findElement(By.id("alertbtn")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
//		Verify if alert mesg contains the text grabbed
		
		if(alertText.contains(selectedText))
			System.out.println("Sucess");
		else
			System.out.println("Failed.Please check again..");
	}

}

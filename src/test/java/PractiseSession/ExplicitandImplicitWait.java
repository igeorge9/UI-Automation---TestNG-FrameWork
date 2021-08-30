package PractiseSession;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitandImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		driver.manage().window().maximize();
		String[] itemsArray = { "Pears", "Pomegranate", "Cucumber", "Musk Melon" };

		addItemsToCart(driver, itemsArray);

	}

	public static void addItemsToCart(WebDriver driver, String[] itemsArray) throws InterruptedException {
		int count = 0;
		/*
		 * Example for Explicit Wait
		 */
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Thread.sleep(5000);
		/*
		 * Example for Implicit wait
		 */
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		List<String> itemsList = Arrays.asList(itemsArray);
		List<WebElement> itemsName = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < itemsName.size(); i++) {

			String[] itemsFormattedName = itemsName.get(i).getText().split("-");
			String formattedName = itemsFormattedName[0].trim();

			if (itemsList.contains(formattedName)) {
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (count == itemsArray.length)
					break;
			}

		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		String prmoTxt = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		System.out.println(prmoTxt);
	}
}

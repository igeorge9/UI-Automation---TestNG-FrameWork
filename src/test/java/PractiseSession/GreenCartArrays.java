package PractiseSession;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCartArrays {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		driver.manage().window().maximize();
		int count = 0;

		Thread.sleep(5000);
		String[] itemsArray = { "Pears", "Pomegranate", "Cucumber", "Musk Melon" };

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

	}
}

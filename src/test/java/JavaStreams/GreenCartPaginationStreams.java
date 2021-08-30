package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCartPaginationStreams {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
//		Copy the veggieprice into a list
//		Check whether the price of Banana in the list

	  	List<String> price;
	 
		do {
//		Get the elements into a list -original list
		List<WebElement> veggienames= driver.findElements(By.xpath("//tr/td[1]"));
		
		price=veggienames.stream().filter(s->s.getText().contains("Banana")).map(s->getPriceOfVeggies(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
		if(price.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}
		while(price.size()<1);

	}
	private static String getPriceOfVeggies(WebElement s) {
		
		String priceValue=s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();
		return priceValue;	
	}

	
}

package SDETTraining.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class WebDriverDemo {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
	
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\geckodriver-v0.29.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();		
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\user\\Documents\\Eclipse Softwares\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.ignoreZoomSettings();
		options.introduceFlakinessByIgnoringSecurityDomains();
		
		WebDriver driver =new InternetExplorerDriver(options);

		driver.get("https://www.microsoft.com/");

	}

}

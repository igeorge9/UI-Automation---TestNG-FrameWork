package PractiseSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificatesExample {

	public static void main(String[] args) {

		/*
		 * This is for the general profile of the browser
		 */
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.acceptInsecureCerts();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		/*
		 * This is to setup our local browser
		 */
		
		ChromeOptions options= new ChromeOptions();
		options.merge(dc);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\Eclipse Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		
	}

}

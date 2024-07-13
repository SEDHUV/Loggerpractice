package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class configproperties {
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("config.properties");
		Properties properties = new Properties(); 
		properties.load(file);
		String browser = properties.getProperty("Browser");
		String browserloc = properties.getProperty("BrowserLocation");
		String driverloc = properties.getProperty("ChromeDriver");
		
		if(browser.equalsIgnoreCase("cHrome")) {
			System.setProperty("webdriver.chrome.driver",driverloc);
		      ChromeOptions options = new ChromeOptions();
		      options.setBinary(browserloc);
				driver = new ChromeDriver(options);
			
			}
		// this below method is only a example . for firefox, we have to write another method like older one . the new browser is only for chrome
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",driverloc);
		      ChromeOptions options = new ChromeOptions();
		      options.setBinary(browserloc);
				driver = new ChromeDriver(options);
			
			}
		
		
		
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	}

}

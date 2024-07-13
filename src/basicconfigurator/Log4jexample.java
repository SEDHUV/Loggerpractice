package basicconfigurator;





import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;


public class Log4jexample {
	 static WebDriver driver;
	 
	 static Logger logger = Logger.getLogger(Log4jexample.class);
	

	public static void main(String[] args) {
		
		
//		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");//used for properties
		logger.info("info message");
		logger.debug("debug message");
		logger.error("error message");
		logger.warn("warning message");
		logger.fatal("fatal message");
		System.out.println("completed");
		
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
//	      ChromeOptions options = new ChromeOptions();
//	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
//	      driver = new ChromeDriver(options);
//	     driver.navigate().to("https://www.saucedemo.com/");
//	     driver.manage().window().maximize();
//				
//				

	}

}

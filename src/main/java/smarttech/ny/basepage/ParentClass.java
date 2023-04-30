package smarttech.ny.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {

	public static Logger logger;
	public static WebDriver driver;
	public static Properties prop;
	public Properties configProp;

	public ParentClass() {
		logger = Logger.getLogger("QA Automation"); // Added logger
		PropertyConfigurator.configure("Log4j.properties");// Added logger
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\moham\\eclipse-workspace\\Automation_Excercise_E2E\\src\\main\\java\\smarttech\\ny\\config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		String browser = prop.getProperty("browserName");
		if (browser.equalsIgnoreCase("Chrome")) {
			logger.info(">>>>> Test Execuation will start with Chrome Browser <<<<< ");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			logger.info(">>>>> Test Execuation will start with Edge Browser <<<<< ");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			logger.info(">>>>> Test Execuation will start with FireFox Browser <<<<< ");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			logger.info(">>>>> Thre is no browser for Test Execuation <<<<< ");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("QA_ENV"));

	}
}
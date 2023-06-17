package smarttech.ny.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;

	
	
	public ParentClass() {
		try {
			log = Logger.getLogger("Luma E-Commerce"); // Added logger
			PropertyConfigurator.configure("log4j.properties");// Added logger	
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/java/smarttech/ny/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void initialization() {
		String browser = prop.getProperty("browserName");
		if (browser.equalsIgnoreCase("Chrome")) {
			log.info(">>>>>>>>> Test Execute On Chrome Browser >>>>>>>>>>");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			log.info(">>>>>>>>> Test Execute On Edge Browser >>>>>>>>>>");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			log.info(">>>>>>>>> Test Execute On Firefox Browser >>>>>>>>>>");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// implicitlyWait wait for only page loading
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get(prop.getProperty("QA_ENV"));

	}
	
	
	
	
}
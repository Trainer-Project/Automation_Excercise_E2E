package smarttech.ny.hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import smarttech.ny.basepage.ParentClass;

public class CrossBrowserTesting extends ParentClass{

	
	@BeforeMethod
	@Parameters("browsers")
	public void setUp(String browser) {
	if (browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	else if (browser.equalsIgnoreCase("FireFox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}	
	}
	
	@Test
	public void testCase() {
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tester01");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

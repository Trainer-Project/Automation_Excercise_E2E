package smarttech.ny.hooks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testerp1");
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		// driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebElement product = driver.findElement(By.xpath("//*[text()=' Products']"));
		for (int i = 0; i <= 100; i++) {
			product.click();
			break;

		}
		
		System.out.println("Loop break");
		// driver.switchTo().frame(2);

		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iframes are " + iframeElements.size());
	
		WebElement ele = driver.findElement(By.tagName("iframe"));
		System.out.println(ele.getText());
		driver.switchTo().frame(ele);
		
		  WebElement element1 = driver.findElement(By.xpath("//*[@id='dismiss-button']"));
		    element1.click();

		
		

		// *[@id="dismiss-button"]/div/span

	}
}

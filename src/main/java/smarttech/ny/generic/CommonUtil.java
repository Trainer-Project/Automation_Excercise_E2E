package smarttech.ny.generic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Assert;

import smarttech.ny.basepage.ParentClass;

public class CommonUtil extends ParentClass {

	public static void getAssertions(String expected, String actual) {
		Assert.assertEquals(expected, actual);
		System.out.println("My desired value is : " + actual);
	}

	public static void hoverOver(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}

	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}

	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);

	}

	public static String captureScreen() {
		String path;
		try {
			driver = new Augmenter().augment(driver);
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			path = "./Screenshots/" + source.getName();
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			path = "Failed to capture screenshot: " + e.getMessage();
		}
		return path;
	}

}

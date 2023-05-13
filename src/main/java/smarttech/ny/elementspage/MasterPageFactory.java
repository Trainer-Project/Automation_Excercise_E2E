package smarttech.ny.elementspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import smarttech.ny.basepage.ParentClass;
import smarttech.ny.generic.CommonUtil;

public class MasterPageFactory extends ParentClass {

	// Initialize PageFactory
	public MasterPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@name='email'])[1]")
	@CacheLookup
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	private WebElement clickOnLoginBTN;

	public WebElement getClickOnLoginBTN() {
		return clickOnLoginBTN;
	}
	
	
	@FindBy(xpath = "//*[text()=' Home']")
	@CacheLookup
	private WebElement verifyHomePage;

	public WebElement getVerifyHomePage() {
		return verifyHomePage;
	}
	
	@FindBy(xpath = "//*[text()=' Products']")
	@CacheLookup
	private WebElement clickOnProduct;

	public WebElement getClickOnProduct() {
		return clickOnProduct;
	}

	
	public void getLogin(String userName, String pwd) {
		getEnterEmail().sendKeys(userName);
		getEnterPassword().sendKeys(pwd);
		CommonUtil.actionClick(getClickOnLoginBTN());
		

	}

}

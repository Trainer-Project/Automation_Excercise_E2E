package smarttech.ny.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import smarttech.ny.basepage.ParentClass;
import smarttech.ny.generic.CommonUtil;
import smarttech.ny.generic.WaitHelper;

public class MasterPageFactory extends ParentClass {
 
	// Initialize PageFactory
	public MasterPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	@CacheLookup
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	@FindBy(id = "pass")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(id = "send2")
	@CacheLookup
	private WebElement clickOnLoginBTN;

	public WebElement getClickOnLoginBTN() {
		return clickOnLoginBTN;
	}
	
	@FindBy(partialLinkText = "Sign In")
	@CacheLookup
	private WebElement clickOnSignInBTN;

	public WebElement getClickOnSignInBTN() {
		return clickOnSignInBTN;
	}
	

 
	
	@FindBy(xpath = "(//*[text()='Welcome, Tanvir Patwary!'])[1]")
	@CacheLookup
	private WebElement verifyUserInfo;

	public WebElement getVerifyUserInfo() {
		return verifyUserInfo;
	}
	
	@FindBy(linkText = "Men")
	@CacheLookup
	private WebElement selectMen;

	public WebElement getSelectMen() {
		return selectMen;
	}

	@FindBy(linkText = "Tops")
	@CacheLookup
	private WebElement selectTops;

	public WebElement getSelectTops() {
		return selectTops;
	}
	
	@FindBy(linkText = "Jackets")
	@CacheLookup
	private WebElement clickJacket;

	public WebElement getClickJacket() {
		return clickJacket;
	}
	
	public void getLogin() {
		WaitHelper.waitForElement(getClickOnSignInBTN());
		CommonUtil.actionClick(getClickOnSignInBTN());
		
		WaitHelper.waitForElement(getEnterEmail());
		getEnterEmail().sendKeys(prop.getProperty("UserName"));
		
		WaitHelper.waitForElement(getEnterPassword());
		getEnterPassword().sendKeys(prop.getProperty("Password"));
		
		WaitHelper.waitForElement(getClickOnLoginBTN());
		CommonUtil.actionClick(getClickOnLoginBTN());
		

	}

}

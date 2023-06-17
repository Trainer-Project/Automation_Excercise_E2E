package smarttech.ny.stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import smarttech.ny.basepage.ParentClass;
import smarttech.ny.elementspage.MasterPageFactory;
import smarttech.ny.generic.CommonUtil;
import smarttech.ny.generic.WaitHelper;

public class FuntionalStepDef extends ParentClass {
	MasterPageFactory pf;
// Highlight not mandatory
	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
		pf = new MasterPageFactory();
		log.info(">>>>>>>>> User able to verify user info on the screen >>>>>>>>>>");
		WaitHelper.waitForElement(pf.getVerifyUserInfo());
		CommonUtil.getAssertions(pf.getVerifyUserInfo().getText(), prop.getProperty("expectedText"));
	}

	@When("User should be able to select jacket from men module")
	public void User_should_be_able_to_select_jacket_from_men_module() {
		log.info(">>>>>>>>> User able to hover over top men module >>>>>>>>>>");
		CommonUtil.highLighterMethod(pf.getSelectMen());
		WaitHelper.waitForElement(pf.getSelectMen());
		CommonUtil.hoverOver(pf.getSelectMen());

		log.info(">>>>>>>>> User able to hover over tops inside the man module >>>>>>>>>>");
		CommonUtil.highLighterMethod(pf.getSelectTops());
		WaitHelper.waitForElement(pf.getSelectTops());
		CommonUtil.hoverOver(pf.getSelectTops());

		log.info(">>>>>>>>> User able to click on jacket >>>>>>>>>>");
		WaitHelper.waitForElement(pf.getClickJacket());
		CommonUtil.highLighterMethod(pf.getClickJacket());
		CommonUtil.actionClick(pf.getClickJacket());
		
		// 1 way
		//driver.findElement(By.linkText("Jackets")).click();
		
		// 2nd way
		//WebElement click = driver.findElement(By.linkText("Jackets"));
		//clcik.click();
		
		// 3rd way 
		//Actions ac = new Actions(driver);
		//ac.click(driver.findElement(By.linkText("Jackets"))).build().perform();
		
		// 4th way
		//JavascriptExecutor js = (JavascriptExecutor)driver; 
		//js.executeScript("arguments[0].click();", driver.findElement(By.linkText("Jackets")));	
		
		// 5th way
        // WebElement click = driver.findElement(By.linkText("Jackets"));
        // for (int i =0; i<100; i++) {
        // clcik.click();
        // break;
        // }
		
	}

	@When("Verify the jacket name on the {string} list")
	public void verify_the_jacket_name_on_the_list(String jacket) {

	}

	@When("User should be able to select the {string} and {string} and {string} then click on the add to cart")
	public void user_should_be_able_to_select_the_and_and_then_click_on_the_add_to_cart(String string, String string2,
			String string3) {
	}

	@When("User should be able to click on the cart")
	public void user_should_be_able_to_click_on_the_cart() {

	}

	@When("User should be able to click on the checkout")
	public void user_should_be_able_to_click_on_the_checkout() {

	}

	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {

	}

	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {

	}

	@Then("User should be able to verify the order number and get text on the screen {string}")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen(String text) {

	}

}
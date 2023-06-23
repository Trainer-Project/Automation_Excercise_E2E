package smarttech.ny.hooks;

import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import smarttech.ny.basepage.ParentClass;
import smarttech.ny.elementspage.MasterPageFactory;
import smarttech.ny.generic.CommonUtil;

public class Hooks extends ParentClass {
	public Scenario scenario;
	MasterPageFactory obj;

	@Before
	public void SetUp(Scenario scenario) {
		this.scenario = scenario;
		initialization();
		obj = PageFactory.initElements(driver, MasterPageFactory.class);
		obj.getLogin();
	}
	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			CommonUtil.captureScreen();
		}
		driver.quit();

	}

}

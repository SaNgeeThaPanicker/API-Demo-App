package stepDefination;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import pages.app_page;
import runner.TestRunners;
 

public class app_Step extends TestRunners{

	@Given("^Already on API demo app$")
	public void already_on_API_demo_app() throws Throwable {
//setup();
	}

	@When("^click on app$")
	public void click_on_app() throws Throwable {
		app_page page = new app_page(wd);
		Thread.sleep(10000);
		MobileElement app=wd.findElement(page.app);
		Assert.assertEquals(true, app.isDisplayed());
		Thread.sleep(10000);
		page.clickApp();
		Thread.sleep(1000);
	}

	@When("^click on action bar$")
	public void click_on_action_bar() throws Throwable {
		app_page page = new app_page(wd);
		Thread.sleep(1000);
		MobileElement actionBar=wd.findElement(page.actionBar);
		Assert.assertEquals(true, actionBar.isDisplayed());
		Thread.sleep(1000);
		page.clickActioBar();
		Thread.sleep(1000);
	}

	@When("^click on Display Options$")
	public void click_on_Display_Options() throws Throwable {
		app_page page = new app_page(wd);
		Thread.sleep(10000);
		MobileElement displayOption=wd.findElement(page.displayOption);
		Assert.assertEquals(true, displayOption.isDisplayed());
		Thread.sleep(10000);
		page.clickDisplayOption();
		Thread.sleep(1000);
	}

	@Then("^Validate on all the buttons within$")
	public void validate_on_all_the_buttons_within() throws Throwable {
		app_page page = new app_page(wd);
		page.clickDisplayHome();
		Thread.sleep(1000);
		page.clickDisplayShow();
		Thread.sleep(1000);
		page.clickDisplayLogo();
		Thread.sleep(1000);
		page.clickDisplayTitle();
		Thread.sleep(1000);
		page.clickDisplayCustom();
		Thread.sleep(1000);
		page.clickNavigation();
		Thread.sleep(1000);
		page.clickCycleCustomView();
//        page.clickBack();
//        page.clickBack();
//        page.clickBack();
		  wd.close();        
		
	}
	
	




}

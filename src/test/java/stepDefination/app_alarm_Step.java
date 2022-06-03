package stepDefination;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import pages.app_page;


public class app_alarm_Step extends BaseTest{

	@Given("^In API demo app$")
	public void in_API_demo_app() throws Throwable {
 
	}

	@When("^click on App button$")
	public void click_on_App_button() throws Throwable {
		app_page page = new app_page(wd);
		Thread.sleep(10000);
		MobileElement app = wd.findElement(page.app);
		Assert.assertEquals(true, app.isDisplayed());
		Thread.sleep(10000);
		page.clickApp();
		Thread.sleep(1000);
	}

	@When("^click on Alarm$")
	public void click_on_Alarm() throws Throwable {
		app_page page = new app_page(wd);
		Thread.sleep(10000);
		MobileElement Alarm = wd.findElement(page.Alarm);
		Assert.assertEquals(true, Alarm.isDisplayed());
		page.clickAlarm();
		Thread.sleep(10000);

	}

	@When("^click on Alarm Controller$")
	public void click_on_Alarm_Controller() throws Throwable {
		app_page page = new app_page(wd);
		Thread.sleep(10000);
		MobileElement Alarm_Controller = wd.findElement(page.Alarm_Controller);
		Assert.assertEquals(true, Alarm_Controller.isDisplayed());
		Thread.sleep(10000);
		page.clickAlarmController();

		Thread.sleep(10000);
	}

	@When("^click on One shot alarm$")
	public void click_on_One_shot_alarm() throws Throwable {
		app_page page = new app_page(wd);
		Thread.sleep(10000);
		MobileElement One_shot_alarm = wd.findElement(page.One_shot_alarm);
		Assert.assertEquals(true, One_shot_alarm.isDisplayed());
		Thread.sleep(10000);
		page.clickOneShotAlarm();
		Thread.sleep(10000);

	}

	@When("^click on Repeating alarm$")
	public void click_on_Repeating_alarm() throws Throwable {
		app_page page = new app_page(wd);
		Thread.sleep(10000);
		MobileElement Repeating_alarm = wd.findElement(page.Repeating_alarm);
		Assert.assertEquals(true, Repeating_alarm.isDisplayed());
		Thread.sleep(10000);
		page.clickRepeatingAlarm();
		Thread.sleep(10000);
	}

	@When("^click on Stop alarm$")
	public void click_on_Stop_alarm() throws Throwable {
		app_page page = new app_page(wd);
		Thread.sleep(10000);
		MobileElement Stop_alarm = wd.findElement(page.Stop_alarm);
		Assert.assertEquals(true, Stop_alarm.isDisplayed());
		Thread.sleep(10000);
		page.clickStopAlarm();

	}

	@Then("^Alarm will set$")
	public void alarm_will_set() throws Throwable {
		app_page page = new app_page(wd);
		  wd.close();	}
}

package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class app_page {
	public static AppiumDriver<MobileElement> wd = null;

	public app_page(AppiumDriver<MobileElement> wd) {
		this.wd = wd;
	}
	
//	Display options
	public By app = By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
	public By actionBar=By.xpath("//android.widget.TextView[@content-desc=\"Action Bar\"]");
	public By displayOption=By.xpath("//android.widget.TextView[@content-desc=\"Display Options\"]");
	By display_Home=By.xpath("//android.widget.Button[@content-desc=\"DISPLAY_HOME_AS_UP\"]");
	By display_Show=By.xpath("//android.widget.Button[@content-desc=\"DISPLAY_SHOW_HOME\"]");
	By display_Logo=By.xpath("//android.widget.Button[@content-desc=\"DISPLAY_USE_LOGO\"]");
	By display_Title=By.xpath("//android.widget.Button[@content-desc=\"DISPLAY_SHOW_TITLE\"]");
	By display_Custom=By.xpath("//android.widget.Button[@content-desc=\"DISPLAY_SHOW_CUSTOM\"]");
	By navigation=By.xpath("//android.widget.Button[@content-desc=\"Navigation\"]");
	By cycle_Custom_View=By.xpath("//android.widget.Button[@content-desc=\"Cycle Custom View Gravity\"]");
	
	
//	Alarm elements	
	public By Alarm=By.xpath("//android.widget.TextView[@content-desc=\"Alarm\"]");
	public By Alarm_Controller=By.xpath("//android.widget.TextView[@content-desc=\"Alarm Controller\"]");
	public By One_shot_alarm=By.id("io.appium.android.apis:id/one_shot");
	public By Repeating_alarm=By.id("io.appium.android.apis:id/start_repeating");
	public By Stop_alarm=By.id("io.appium.android.apis:id/stop_repeating");
	
	
//	TO CHECK DISPLAY OPTION FUNCTIONS
	public void clickBack() {
		wd.navigate().back();
	}
	public void clickApp() {
		wd.findElement(app).click();
	}
	public void clickActioBar() {
		wd.findElement(actionBar).click();
	}
	public void clickDisplayOption() {
		wd.findElement(displayOption).click();
	}
	public void clickDisplayHome() {
		wd.findElement(display_Home).click();
	}
	public void clickDisplayShow() {
		wd.findElement(display_Show).click();
	}
	public void clickDisplayLogo() {
		wd.findElement(display_Logo).click();
	}
	public void clickDisplayTitle() {
		wd.findElement(display_Title).click();
	}
	public void clickDisplayCustom() {
		wd.findElement(display_Custom).click();
	}

	public void clickNavigation() {
		wd.findElement(navigation).click();
	}
	public void clickCycleCustomView() {
		wd.findElement(cycle_Custom_View).click();
	}
	
	//TO SET ALARM FUNCTIONS
	public void clickAlarm() {
		wd.findElement(Alarm).click();
	}
	public void clickAlarmController() {
		wd.findElement(Alarm_Controller).click();
	}
	public void clickOneShotAlarm() {
		wd.findElement(One_shot_alarm).click();
	}
	public void clickRepeatingAlarm() {
		wd.findElement(Repeating_alarm).click();
	}
	public void clickStopAlarm() {
		wd.findElement(Stop_alarm).click();
	}
}

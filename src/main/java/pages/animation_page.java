package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class animation_page{
	public static AppiumDriver<MobileElement> wd = null;
	
	public animation_page(AppiumDriver<MobileElement> wd) {
		this.wd = wd;
	}

//Findng the postion of all element
	By animation = By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]");
	By hideShowAnnimation=By.xpath("//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]");
	By showButton=By.xpath("//android.widget.Button[@content-desc=\"Show Buttons\"]");
	By customAnimation=By.xpath("//android.widget.CheckBox[@content-desc=\"Custom Animations\"]");
	By hide=By.xpath("//android.widget.CheckBox[@content-desc=\"Hide (GONE)\"]");
	By rangeButton=By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]\r\n");

	public void clickAnimation() {
		wd.findElement(animation).click();
	}

	public void clickHideShowAnnimation() {
		wd.findElement(hideShowAnnimation).click();
	}
	
	public void clickShowButton() {
		wd.findElement(showButton).click();
	}
	
	public void clickCustomAnimation()
	{
		wd.findElement(customAnimation).click();
	}
	
	public void clickHide()
	{
		wd.findElement(hide).click();
	}
	public void clickRange_Button() {
		wd.findElement(rangeButton).click();
	}
	
	public boolean validationOnRange() {
		
		try {
			wd.findElement(rangeButton);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
}

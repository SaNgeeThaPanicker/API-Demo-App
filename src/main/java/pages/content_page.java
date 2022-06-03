package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidKeyCode;

public class content_page {
	public static AppiumDriver<MobileElement> wd = null;

	public content_page(AppiumDriver<MobileElement> wd) {
		this.wd = wd;
	}
	
//	 content Assest option
	By Content=By.xpath("//android.widget.TextView[@content-desc=\"Content\"]");
	By Assest=By.xpath("//android.widget.TextView[@content-desc=\"Assets\"]");
	By Read_Assest=By.xpath("//android.widget.TextView[@content-desc=\"Read Asset\"]");
	By Back=By.xpath("");
	
//	Clipboard option
	By Clipboard=By.xpath("//android.widget.TextView[@content-desc=\"Clipboard\"]");
	By Data_Type=By.xpath("//android.widget.TextView[@content-desc=\"Data Types\"]");
	By Copy_Text_Option1=By.id("io.appium.android.apis:id/copy_styled_text");
	By Copy_Text_Option2=By.id("io.appium.android.apis:id/copy_plain_text");
	By Copy_Text_Option3=By.id("io.appium.android.apis:id/copy_html_text");
	By Copy_Text_Option4=By.id("io.appium.android.apis:id/copy_intent");
	By Copy_Text_Option5=By.id("io.appium.android.apis:id/copy_uri");
	
	
//	content Assest Function
	public void ClickContent() {
		wd.findElement(Content).click();
	}
	public void clickAssest() {
		wd.findElement(Assest).click();
	}
	public void clickReadAssest() {
		wd.findElement(Read_Assest).click();
	}
	public void clickBack() {
		wd.navigate().back();
	}
	
//	Clipboard functions
	public void clickClipboard() {
		wd.findElement(Clipboard).click();
	}
	public void clickDataType() {
		wd.findElement(Data_Type).click();
	}
	public void clickCopyTextOption1() {
		wd.findElement(Copy_Text_Option1).click();
	}
	public void clickCopyTextOption2() {
		wd.findElement(Copy_Text_Option2).click();
	}
	public void clickCopyTextOption3() {
		wd.findElement(Copy_Text_Option3).click();
	}
	public void clickCopyTextOption4() {
		wd.findElement(Copy_Text_Option4).click();
	}
	public void clickCopyTextOption5() {
		wd.findElement(Copy_Text_Option5).click();
	}
	
}

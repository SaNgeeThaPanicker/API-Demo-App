package pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class graphics_page {
	
	public static AppiumDriver<MobileElement> wd = null;

	public graphics_page(AppiumDriver<MobileElement> wd) {
		this.wd = wd;
	}
	
	By graphics=By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]");
	By AlphaBitmap=By.xpath("//android.widget.TextView[@content-desc=\"AlphaBitmap\"]");
	By AnimateDrawaables=By.xpath("//android.widget.TextView[@content-desc=\"AnimateDrawables\"]");
	By Arcs=By.xpath("//android.widget.TextView[@content-desc=\"Arcs\"]");
	
	public void clickBack() {
		wd.navigate().back();
	}
	public void clickGraphics() {
		wd.findElement(graphics).click();
	}
	public void clickAlphaBitmap() {
		wd.findElement(AlphaBitmap).click();
	}
	public void clickAnimateDrawaables() {
		wd.findElement(AnimateDrawaables).click();
	}
	public void clickArcs() {
		wd.findElement(Arcs).click();
	}
}

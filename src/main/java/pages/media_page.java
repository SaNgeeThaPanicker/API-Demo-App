package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class media_page {
	public static AppiumDriver<MobileElement> wd = null;

	public media_page(AppiumDriver<MobileElement> wd) {
		this.wd = wd;
	}
	
	By Media=By.xpath("//android.widget.TextView[@content-desc=\"Media\"]");
	By MediaPlayer=By.xpath("//android.widget.TextView[@content-desc=\"MediaPlayer\"]");
	By PlayVideo=By.xpath("//android.widget.Button[@content-desc=\"Play Video from Local File\"]");
	By PlayStreamingVideo=By.xpath("//android.widget.Button[@content-desc=\"Play Streaming Video\"]");
	By PlayAudioFromLocalFile=By.xpath("//android.widget.Button[@content-desc=\"Play Audio from Local File\"]");
	By PlayAudioFromResources=By.xpath("//android.widget.Button[@content-desc=\"Play Audio from Resources\"]");
	
	public void clickBack() {
		wd.navigate().back();
	}
	public void clickMedia() {
		wd.findElement(Media).click();
	}
	public void clickMediaPlayer() {
		wd.findElement(MediaPlayer).click();
	}
	public void clickPlayVideo() {
		wd.findElement(PlayVideo).click();
	}
	public void clickPlayStreamingVideo() {
		wd.findElement(PlayStreamingVideo).click();
	}
	public void clickPlayAudioFromLocalFile() {
		wd.findElement(PlayAudioFromLocalFile).click();
	}
	public void clickPlayAudioFromResources() {
		wd.findElement(PlayAudioFromResources).click();
	}
	 
}

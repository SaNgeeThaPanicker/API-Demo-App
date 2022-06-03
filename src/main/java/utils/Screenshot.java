package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Screenshot {
public static String captureScreenshot(AppiumDriver<MobileElement> driver, String testName) {
		
		String screenshotPath = System.getProperty("user.dir")+"/FailedScreenshots/"+testName+".jpg";
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File(screenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return screenshotPath ;
		}
}
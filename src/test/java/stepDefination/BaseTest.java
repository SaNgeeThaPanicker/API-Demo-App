package stepDefination;

 
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.testng.TestNGCucumberRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
 

public class BaseTest {
	public static AppiumDriver<MobileElement> wd = null;
	public static AppiumDriverLocalService se;
 
 
	//Start the server
//	@BeforeClass
//	public static void setup() { 
//		se = AppiumDriverLocalService.buildDefaultService();
//		se.start();
//		DesiredCapabilities capabilities = new DesiredCapabilities();
// 
//		
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("platformVersion", "8.1");
//		capabilities.setCapability("appPackage", "io.appium.android.apis");
//		capabilities.setCapability("app", "C:/Users/sangeethapanicker/Downloads/ApiDemos-debug.apk");
//		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
//		capabilities.setCapability("deviceName", "Android");
//		try {
//			wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//	 }
// 
//
//		ExtentHtmlReporter htmlReporter;
//
//		ExtentReports extent;
//		// helps to generate the logs in the test report.
//		ExtentTest test;
 

//			@Test(description = "Runs Cucumber feature", dataProvider = "feature")
//			public void feature(CucumberFeatureWrapper cucmberFeature) {
//				testNGCucumberRunner.runCucumber(cucmberFeature.getCucumberFeature());
	//
//			}
	//
//			@DataProvider
//			public Object[][] feature() {
//				return testNGCucumberRunner.provideFeatures();
//			}
	//
//			@AfterClass(alwaysRun = true)
//			public void tearDownClass() throws Exception {
////				Thread.sleep(1000);
//				wd.close();
//				testNGCucumberRunner.finish();
//			}

		
		
//		@BeforeSuite
//		public void startReport() {
//			// initialize the HtmlReporter
//			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/testReport.html");
	//
//			// initialize ExtentReports and attach the HtmlReporter
//			extent = new ExtentReports();
//			extent.attachReporter(htmlReporter);
	//
//			// configuration items to change the look and feel
//			// add content, manage tests etc
//			htmlReporter.config().setChartVisibilityOnOpen(true);
//			htmlReporter.config().setDocumentTitle("Simple Automation Report");
//			htmlReporter.config().setReportName("Test Report");
//			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//			htmlReporter.config().setTheme(Theme.STANDARD);
//			htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//		}
	//
	//	
//		@AfterClass
//		public void getResult(ITestResult result) {
//			if (result.getStatus() == ITestResult.FAILURE) {
//				test.log(Status.FAIL, result.getThrowable());
//			} else if (result.getStatus() == ITestResult.SUCCESS) {
//				test.log(Status.PASS, result.getTestName());
//			} else {
//				test.log(Status.SKIP, result.getTestName());
//			}
//		}
	//
//		@AfterClass
//		public void tearDown() {
//			// to write or update test information to reporter
//			extent.flush();
//		}
//	}

}
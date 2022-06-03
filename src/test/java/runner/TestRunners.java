package runner;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utils.Screenshot;

@CucumberOptions(features = "src/test/java/feature", glue = "stepDefination", format = { "pretty",
		"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" } 
//		,tags= {"@animation"}
)

public class TestRunners extends AbstractTestNGCucumberTests {
	public static AppiumDriver<MobileElement> wd = null;
	public static AppiumDriverLocalService se;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public static Logger log = Logger.getLogger(TestRunners.class);

	@BeforeSuite
	public void logTest() {
		PropertyConfigurator.configure("./Resources/log4j.properties");
	}

	// Start the server
	@BeforeClass
	public static void setup() {
		se = AppiumDriverLocalService.buildDefaultService();
		se.start();
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.1");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("app", "C:/Users/sangeethapanicker/Downloads/ApiDemos-debug.apk");
		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		capabilities.setCapability("deviceName", "Android");
		try {
			wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass()
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")
	public void my_test(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass
	public void tearDown() {
		testNGCucumberRunner.finish();
//		wd.quit();
//        se.stop();

	}

//	@BeforeMethod
//	public void startTest(Method method) {
//		String testName = method.getName();
//		extentTest = extent.startTest(method.getName());
//		log.info("\n *********************** \n Operation " + testName
//				+ " has started \n *******************************\n");
//
//	}

//	@AfterMethod
//	public void endtest() {
//		extent.endTest(extentTest);
//	}

//	@AfterMethod()
//	public void attachScreenshot(ITestResult result) {
//
//		if (result.getStatus() == ITestResult.FAILURE) {
//			String scrPath = Screenshot.captureScreenshot(wd, result.getName());
//			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(scrPath));
//		}
//	}

	// Report Ended
	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}

 
	@AfterMethod
	public void endLog(Method method) {
		String testName = method.getName();
		log.info("\n *********************** \n Operation " + testName
				+ " has ended \n *******************************\n ");
	}
}

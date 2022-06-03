package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.content_page;
 

public class content_Step extends BaseTest{
	@Given("^Already on API Demo appp$")
	public void already_on_API_Demo_appp() throws Throwable {
//	    setup();
	}

	@When("^Click on content$")
	public void click_on_content() throws Throwable {
	     content_page page= new content_page(wd);
	     page.ClickContent();
	     Thread.sleep(1000);
	}

	@When("^Click on Assest$")
	public void click_on_Assest() throws Throwable {
		 content_page page= new content_page(wd);
		 page.clickAssest();
		 Thread.sleep(1000);
	}

	@When("^Click on Read Assest$")
	public void click_on_Read_Assest() throws Throwable {
		 content_page page= new content_page(wd);
		 page.clickReadAssest();
		 Thread.sleep(1000);
		 page.clickBack();
		 page.clickBack();
		 page.clickBack();
	}

	@Then("^Click on Back$")
	public void click_on_Back() throws Throwable {
		content_page page= new content_page(wd);
		  wd.close();	}

	@When("^Click on Clipboard$")
	public void click_on_Clipboard() throws Throwable {
		 content_page page= new content_page(wd);
		 page.clickClipboard();
		 Thread.sleep(1000);
	}

	@When("^Click on Data type$")
	public void click_on_Data_type() throws Throwable {
		 content_page page= new content_page(wd);
		 page.clickDataType();
		 Thread.sleep(1000);
	}

	@When("^Click on Copy Text options$")
	public void click_on_Copy_Text_options() throws Throwable {
		 content_page page= new content_page(wd);
		 page.clickCopyTextOption1();
		 page.clickCopyTextOption2();
		 page.clickCopyTextOption3();
		 page.clickCopyTextOption4();
		 page.clickCopyTextOption5();
	}
}

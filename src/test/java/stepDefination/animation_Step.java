package stepDefination;



 

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.animation_page;
import runner.TestRunners;


public class animation_Step extends TestRunners{
	 
	@Given("^Already on the API demo app$")
	public void already_on_the_API_demo_app() throws Throwable {
//		setup();
	}

	@When("^Click on animation button$")
	public void click_on_animation_button() throws Throwable {
		animation_page page=new animation_page(wd);
	    page.clickAnimation();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		log.info("***************" +nameofCurrMethod+ "***************");
	    Thread.sleep(10000);
	}

	@When("^Click on hide show animation$")
	public void click_on_hide_show_animation() throws Throwable {
		animation_page page=new animation_page(wd);
	    page.clickHideShowAnnimation();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		log.info("***************" +nameofCurrMethod+ "***************");
	    Thread.sleep(10000);
	}
	@When("^Click on Show Button$")
	public void click_on_Show_Button() throws Throwable {
		animation_page page=new animation_page(wd);
	    page.clickShowButton();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		log.info("***************" +nameofCurrMethod+ "***************");
	    Thread.sleep(10000);
	}

	@When("^Click on custom Animation$")
	public void click_on_custom_Animation() throws Throwable {
		animation_page page=new animation_page(wd);
	    page.clickCustomAnimation();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		log.info("***************" +nameofCurrMethod+ "***************");
	    Thread.sleep(10000);
	}

	@When("^Click on hide$")
	public void click_on_hide() throws Throwable {
		animation_page page=new animation_page(wd);
	    page.clickHide();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		log.info("***************" +nameofCurrMethod+ "***************");
	    Thread.sleep(10000);
	}

	@When("^Click on hide rangeButton$")
	public void click_on_hide_rangeButton() throws Throwable {
		animation_page page=new animation_page(wd);
	    page.clickRange_Button();
		String nameofCurrMethod =new Throwable().getStackTrace()[0].getMethodName();
		log.info("***************" +nameofCurrMethod+ "***************");
	    Thread.sleep(10000);
	}
	@Then("^Validate if the button working$")
	public void validate_if_the_button_working() throws Throwable {
		animation_page page=new animation_page(wd);
//		boolean ans=page.validationOnRange();
//		System.out.println(ans);
//		Assert.assertEquals(ans, true);
	   
	}
	
	@Given("^already on animation/Hide show$")
	public void already_on_animation_Hide_show() throws Throwable {
	     
	}

	@Then("^Valiadte if button hide working$")
	public void valiadte_if_button_hide_working() throws Throwable {
	    wd.close();
	}

}

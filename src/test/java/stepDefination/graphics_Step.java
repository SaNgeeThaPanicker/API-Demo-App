package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.graphics_page;
 

public class graphics_Step extends BaseTest{
	
	
	@Given("^Already in Api demo app$")
	public void already_in_Api_demo_app() throws Throwable {
//	     setup();
	}

	@When("^Click on graphics$")
	public void click_on_graphics() throws Throwable {
		graphics_page page =new graphics_page(wd);
		page.clickGraphics();
	}

	@When("^Click on AlphaBitmap$")
	public void click_on_AlphaBitmap() throws Throwable {
		graphics_page page =new graphics_page(wd);
		page.clickAlphaBitmap();
		page.clickBack();
	}

	@When("^Click on AnimateDrawaables$")
	public void click_on_AnimateDrawaables() throws Throwable {
		graphics_page page =new graphics_page(wd);
		page.clickAnimateDrawaables();
		page.clickBack();
	}

	@When("^Click on Arcs$")
	public void click_on_Arcs() throws Throwable {
		graphics_page page =new graphics_page(wd);
		page.clickArcs();
		page.clickBack();
	}
	
	@Then("^Click on Back Button$")
	public void click_on_Back_Button() throws Throwable {
		graphics_page page =new graphics_page(wd);
		page.clickBack();
	}

}

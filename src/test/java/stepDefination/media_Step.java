package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.media_page;
 

public class media_Step extends BaseTest{
	
	@Given("^already in Api demo app$")
	public void already_in_Api_demo_app() throws Throwable {
//	     setup();
	}
	
	@When("^Click on Media$")
	public void click_on_Media() throws Throwable {
	     media_page page=new media_page(wd);
	     page.clickMedia();
	     
	}

	@When("^Click on MediaPlayer$")
	public void click_on_MediaPlayer() throws Throwable {
		 media_page page=new media_page(wd);
	     page.clickMediaPlayer();
	
	     
	}

	@When("^Click on play video$")
	public void click_on_play_video() throws Throwable {
		 media_page page=new media_page(wd);
	     page.clickPlayVideo();
	     Thread.sleep(10000);
	     page.clickBack();
	}

	@When("^Click on play streaming video$")
	public void click_on_play_streaming_video() throws Throwable {
		 media_page page=new media_page(wd);
	     page.clickPlayStreamingVideo();
	     Thread.sleep(10000);
	     page.clickBack();
	     
	}

	@When("^Click on play audio from local file$")
	public void click_on_play_audio_from_local_file() throws Throwable {
		 media_page page=new media_page(wd);
	     page.clickPlayAudioFromLocalFile();
	     Thread.sleep(10000);
	     page.clickBack();
	     
	}

	@When("^Click on play audio from resources$")
	public void click_on_play_audio_from_resources() throws Throwable {
		 media_page page=new media_page(wd);
	     page.clickPlayAudioFromResources();
	     Thread.sleep(10000);
	     page.clickBack();
	     
	}

	@Then("^valiadte buttons$")
	public void valiadte_buttons() throws Throwable {
//		 media_page page=new media_page(wd);	
	    
	}
}

package com.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Library.Library;
import com.pages.News;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NewStepdef extends Library {
	Utility util;
	News news;
	final static Logger LOG = LogManager.getLogger(NewStepdef.class.getName());
	
	
	@Given("^News I launch Chrome browser$")
    public void news_i_launch_chrome_browser() throws Throwable {
		launchApp();
		LOG.info("launched the browser");
		
	}
	
	 @Then("^News Click on the News button$")
	    public void news_click_on_the_news_button() throws Throwable {
			news=new News(driver);
		   news.newsreviews();
		   LOG.info("Clicked on News Button");
	      
	    }

	 @Then("^News Click on the Mobile button$")
	    public void news_click_on_the_mobile_button() throws Throwable {
	    	news=new News(driver);
	    	   news.mobile();
	    	   LOG.info("Clicked on Mobile Button");
	    	   
	    }

	 @Then("^News Click on the Mobileapps button$")
	    public void news_click_on_the_mobileapps_button() throws Throwable {
	    	news=new News(driver);
	    	   news.mobileapps();
	    	   LOG.info("Clicked on Mobileapps Button");
	    	   
	    }
	 @Then("^News Takes a ScreenShot$")
	    public void news_takes_a_screenshot() throws Throwable {
	  	util = new Utility(driver);
	   	util.takeSnapShot("C:\\Users\\sanjay\\eclipse-workspace\\Softpediaproject\\src\\test\\resources\\Screenshot\\News.png");
	   	LOG.info("Screenshot sucessful");
    	driver.quit();
    	LOG.info("Driver quit");

	    }

}
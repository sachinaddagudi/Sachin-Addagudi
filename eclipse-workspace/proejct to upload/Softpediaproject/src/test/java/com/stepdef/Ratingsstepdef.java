package com.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Library.Library;
import com.pages.Ratings;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Ratingsstepdef extends Library {
	
	Utility util;
	Ratings ratings;
	final static Logger LOG = LogManager.getLogger(NewStepdef.class.getName());
	
	
	 @Given("^Ratings I launch Chrome browser$")
	    public void ratings_i_launch_chrome_browser() throws Throwable {
		 launchApp();
			LOG.info("launched the browser");
	        
	    }

	    @Then("^RatingsClick on the News button$")
	    public void ratingsclick_on_the_news_button() throws Throwable {
	    	ratings =new Ratings(driver);
			   ratings.clickwindows();
			   LOG.info("Clicked on Windows Button");
			     
	    }

	    @Then("^Ratings Click on the Mobile button$")
	    public void ratings_click_on_the_mobile_button() throws Throwable {
	    	ratings =new Ratings(driver);
			   ratings.clickantivirus();
			   LOG.info("Clicked on Anti virus Button");
	        
	    }

	    @Then("^Ratings Click on the Mobileapps button$")
	    public void ratings_click_on_the_mobileapps_button() throws Throwable {
	    	ratings =new Ratings(driver);
			   ratings.clickratings();
			   LOG.info("Clicked on Ratings Button");
	       
	    }

	    @Then("^Ratings Takes a ScreenShot$")
	    public void ratings_takes_a_screenshot() throws Throwable {
	    	util = new Utility(driver);
		   	util.takeSnapShot("C:\\Users\\sanjay\\eclipse-workspace\\Softpediaproject\\src\\test\\resources\\Screenshot\\Ratings.png");
		   	LOG.info("Screenshot sucessful");
	    	driver.quit();
	    	LOG.info("Driver quit");
	      
	    }

}

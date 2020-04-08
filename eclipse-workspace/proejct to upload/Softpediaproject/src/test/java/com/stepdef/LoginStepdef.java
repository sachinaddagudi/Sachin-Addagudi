package com.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Library.Library;
import com.pages.LoginPage;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class LoginStepdef extends Library{
		
		Utility util;
		LoginPage login;
		final static Logger LOG = LogManager.getLogger(LoginStepdef.class.getName());
	
	 	@Given("^I launch Chrome browser$")
	    public void i_launch_chrome_browser() throws Throwable {
		 launchApp();
		   LOG.info("launched the browser");
		    
	    }

	    @When("^Login Softpedia page opened$")
	    public void login_softpedia_page_opened() throws Throwable {
	    	login= new LoginPage(driver);
	    	login.login();
	        LOG.info("Softpedia login page opened");
	    }

	    @Then("^enter \"([^\"]*)\" and \"([^\"]*)\" in the login field$")
	    public void enter_something_and_something_in_the_login_field(String username, String password) throws Throwable {
	    	login=new LoginPage(driver);
	        login.username(username);
	        login.gpassword(password);
	        LOG.info("usernam and password are :");
	       
	    }

	    @Then("^Click on the login button$")
	    public void click_on_the_login_button() throws Throwable {
	        login.fsubmit();
	        LOG.info("Clicked on submit button");
	    }

	    @Then("^Takes a screenshot$")
	    public void takes_a_screenshot() throws Throwable {
	    	util = new Utility(driver);
	    	util.takeSnapShot("C:\\Users\\sanjay\\eclipse-workspace\\Softpediaproject\\src\\test\\resources\\Screenshot\\Login.png");
	    	LOG.info("Screenshot sucessful");
	    	driver.quit();
	    	LOG.info("Driver quit");
	    }
	

}

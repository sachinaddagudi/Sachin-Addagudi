package com.stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Library.Library;
import com.pages.Register;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class Registerstepdef extends Library {
	
	Utility util;
	Register register;
	final static Logger LOG = LogManager.getLogger(LoginStepdef.class.getName());
	

	@Given("^TC(\\d+)_(\\d+) I launch Chrome browser$")
	public void tc___I_launch_Chrome_browser(int arg1, int arg2) throws Throwable {
		 launchApp();
		 LOG.info("launched the browser");
	       
	    }


	@When("^TC(\\d+)_(\\d+) Login Softpedia page opened$")
	public void tc___Login_Softpedia_page_opened(int arg1, int arg2) throws Throwable {
	    	register= new Register(driver);
	    	register.login();
	    	
	    	  LOG.info("Softpedia login page opened");
	        
	    }


	@Then("^TC(\\d+)_(\\d+) Click n register buttton$")
	public void tc___Click_n_register_buttton(int arg1, int arg2) throws Throwable {
	    	register= new Register(driver);
	    	register.register();
	    	  LOG.info("Clicked on New Register Button");
	        
	    }

	 @Then("^TC01_02 enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in the login field$")
	    public void tc0102_enter_something_something_something_something_in_the_login_field(String Username, String password, String emailid, String confirmpassword) throws Throwable {
	    	register= new Register(driver);
	    	register.username(Username);
	    	register.gpassword(password);
	    	register.enter_email(emailid);
	    	register.confirm_password(confirmpassword);
	    	
	    	  LOG.info("Rgistration Details are entered");
	    	
	    }


    @Then("^TC(\\d+)_(\\d+) Click on regiter button$")
    public void tc___Click_on_regiter_button(int arg1, int arg2) throws Throwable {
	        register.fsubmit(); 
	        LOG.info("Click on the The Register button");
	    }
    @Then("^TC01_02 click on done$")
    public void tc0102_click_on_done() throws Throwable {
    	register.done();
    	  LOG.info("clicked on done");
    }

    @Then("^TC(\\d+)_(\\d+)Takes a screenshot$")
   public void tc___Takes_a_screenshot(int arg1, int arg2) throws Throwable {
	   	util = new Utility(driver);
	   	util.takeSnapShot("C:\\Users\\sanjay\\eclipse-workspace\\Softpediaproject\\src\\test\\resources\\Screenshot\\Registration.png");
	   	LOG.info("Screenshot sucessful");
	    	driver.quit();
	   	LOG.info("Driver quit");
	    }

}

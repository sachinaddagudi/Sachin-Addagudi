package com.pages;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Logger LOG = Logger.getLogger(LoginPage.class.getName());
	WebDriver driver;

	//to click on login option
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[3]/ul[2]/li[3]")
	WebElement login;

	//to enter email
	@FindBy(xpath = "/html/body/div[5]/div/div[1]/form/input[1]")
	WebElement email  ;

	//to enter password
	@FindBy(xpath = "/html/body/div[5]/div/div/form/input[2]")
	WebElement password;

	//to click on login button to login
	@FindBy(xpath = "/html/body/div[5]/div/div/form/input[3]")
	WebElement submit;

	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}


	public void login() {
	login.click();
//	LOG.info("clicked on login icon");
	}
	public void username(String userid) {
	email.sendKeys(userid);
//	LOG.info("entered email id in the field");

	}
	public void gpassword(String userpassword) {
	password.sendKeys(userpassword);
//	LOG.info("entered password in the field");

	}
	public void fsubmit() {
	submit.click();
//	LOG.info("clicked login button");

	}


}

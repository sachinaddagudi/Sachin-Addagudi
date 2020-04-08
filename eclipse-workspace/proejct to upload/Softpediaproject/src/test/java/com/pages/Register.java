package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[3]/ul[2]/li[3]")
	WebElement login;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/a[3]")
	WebElement registerbtn;
	
	@FindBy(xpath="/html/body/div[5]/div/div/form/input[1]")
	WebElement username;
	
	@FindBy(xpath="/html/body/div[5]/div/div/form/div[1]/input[1]")
	WebElement password;

	@FindBy(xpath="/html/body/div[5]/div/div/form/input[2]")
	WebElement emailid;

	@FindBy(xpath="/html/body/div[5]/div/div/form/div[1]/input[2]")
	WebElement confirmpass;

	@FindBy(xpath="/html/body/div[5]/div/div/form/button[1]")
	WebElement register;
	
	@FindBy(xpath="/html/body/div[5]/div/div/form/button")
	WebElement Done;
	
	public Register(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public void login() {
		login.click();
	}
	public void register() {
		registerbtn.click();
	}
	
	public void username(String userid) {
		username.sendKeys(userid);
	}
	
	public void gpassword(String userpassword) {
		password.sendKeys(userpassword);
	}
	
		public void enter_email(String useremail)
		{
			emailid.sendKeys(useremail);
		}
		public void confirm_password(String confirm)
		{
			confirmpass.sendKeys(confirm);
		}
		public void fsubmit() {
			register.click();
		}
		
		public void done() {
			Done.click();
		}
	
			
		
}

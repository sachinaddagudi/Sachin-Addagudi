package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class News  {
	WebDriver driver;
	
	
	@FindBy(xpath ="/html/body/div[1]/div[1]/div[2]/div/div[3]/ul[1]/li[7]/a")
	WebElement Newsreviews;
	

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[3]/ul[1]/li[4]/a")
	WebElement Mobile;
	
	

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/ul/li[4]/a")
	WebElement Mobileapps;
	
	
	public News (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}
	
	public void newsreviews() {
		Newsreviews.click();
	}
	
	public void mobile() {
		Mobile.click();
	}
	
	
	public void mobileapps() {
		Mobileapps.click();
	}

	
}

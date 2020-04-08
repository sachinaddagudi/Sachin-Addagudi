package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ratings {
	WebDriver driver;
	
	@FindBy(xpath ="/html/body/div[1]/div[1]/div[2]/div/div[3]/ul[1]/li[1]/a")
	WebElement Windows;
	
	@FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div/div[2]/ul[1]/li[1]/a")
	WebElement Antivirus;
	
	@FindBy(xpath ="/html/body/div[1]/div[2]/div[2]/div[4]/div[4]/div/a")
	WebElement Ratings;
	
	public Ratings (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}
	

	public void clickwindows() {
		Windows.click();
	}
	
	public void clickantivirus() {
		Antivirus.click();
	}
	
	
	public void clickratings() {
		Ratings.click();
	}
	
	
	
	
	


}

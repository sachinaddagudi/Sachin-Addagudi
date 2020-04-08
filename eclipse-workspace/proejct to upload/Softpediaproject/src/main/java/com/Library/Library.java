package com.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {
	public WebDriver driver;
	 Properties prop;
	 FileInputStream fis;


	 
	  public void launchApp() throws IOException {
	 //give the path of yours from config.property
	 fis = new FileInputStream("C:\\Users\\sanjay\\eclipse-workspace\\Softpediaproject\\src\\test\\resources\\configurationproperty\\config.property");
	   prop = new Properties();
	prop.load(fis);
	String browser = prop.getProperty("browser");
	 
	  try {
	  //for launching firefox browser
	  if(browser.equalsIgnoreCase("firefox")) {
	  driver = new FirefoxDriver();
	  }
	  else if (browser.equalsIgnoreCase("chrome")) {
	  //for launching chrome browser
	  System.setProperty("webdriver.chrome.driver", "C:/Users/sanjay/Desktop/eclipse/chromedriver_win32/chromedriver.exe/");

	  driver = new ChromeDriver();
	  }
	 
	 // to window to get maximize
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));
	 
	 
	  }catch(WebDriverException e) {
	  System.out.println("browser couldnot be launched");
	  }
	}
	 // to quit the browser
	  public void quit() {
	  driver.quit();
	  }

}

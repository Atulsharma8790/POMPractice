package com.test.Automation.uiAutomation.testBase;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	
	public WebDriver driver;
	String url = "http://automationpractice.com/index.php";
	String browser = "firefox";
	
	public void init(){
		
		selectBrowser(browser);
		log.info("Browser is selected and opened");
		getUrl(url);
		log.info("Opened the URL");
		String log4jConfiguration = "log4j.properties";
		PropertyConfigurator.configure(log4jConfiguration);
		
	}

	private void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
	}

	private void selectBrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
	}

}

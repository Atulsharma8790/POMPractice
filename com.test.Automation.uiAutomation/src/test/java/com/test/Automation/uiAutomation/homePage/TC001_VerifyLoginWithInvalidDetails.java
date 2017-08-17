package com.test.Automation.uiAutomation.homePage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.Automation.uiAutomation.testBase.TestBase;
import com.test.Automation.uiAutomation.uiActions.HomePage;


public class TC001_VerifyLoginWithInvalidDetails extends TestBase {
	
	HomePage homepage;
	
	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidDetails.class.getName());
	
	@BeforeTest
	public void setUp(){
		log.info("Browser is selected and opened");
		init();
		log.info("Opened the URL");
		log.info("Initial Steps in Before Test done");
	}
	
	@Test
	public void verifyLoginWithInvalidDetails() throws InterruptedException{
		homepage = new HomePage(driver);
		log.info("Logging into the application now");
		try{
		homepage.loginToApplication("Test12@gmail.com", "passwd", driver);
		}catch(Exception e){
			e.printStackTrace();
		}
		Thread.sleep(5000);
		Assert.assertEquals(homepage.AuthenticateMsg(),"Authentication failed.");
		
	}
	
	@AfterTest
	public void endTest(){
		log.info("Test Case executed. Now closing the instance");
		driver.close();
		
	}

}

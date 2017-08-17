package com.test.Automation.uiAutomation.homePage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.Automation.uiAutomation.testBase.TestBase;
import com.test.Automation.uiAutomation.uiActions.HomePage;


public class TC002_VerifyLoginWithDifferentRecords extends TestBase{

	
	HomePage homepage;
	@DataProvider(name="loginData")
	public String[][] getTestData()
	{
		String[][] testRecords = getData("TestData.xlsx", "Sheet1");
		return testRecords;
	}
	
	@BeforeClass
	public void SetUp(){
		init();
	}
	
	@Test(dataProvider="loginData")
	public void testLogin(String emailAddress, String password) throws InterruptedException{
		log.info("==============Starting login with different records test==================");
		homepage = new HomePage(driver);
		homepage.loginToApplication(emailAddress, password, driver);
	}
	
	@AfterClass
	public void endTest(){
		
	}
}

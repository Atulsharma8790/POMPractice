package com.test.Automation.uiAutomation.uiActions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class homePage {

	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	//@FindBy(xpath="//a[@class='login']")
	WebElement signIn;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement emailAddress;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement submitButton;
	
	@FindBy(xpath="//*[@id='center_column']/div[1]/ol/li")
	WebElement authFailedMsg;
	
	public WebDriverWait wait;
	
	public homePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void loginToApplication(String emailId, String passwd, WebDriver driver) throws InterruptedException{
		 wait = new WebDriverWait(driver,30);
		Thread.sleep(5000);
		signIn.click();
		//wait.until(ExpectedConditions.visibilityOf(signIn)).click();
		
		
		wait.until(ExpectedConditions.visibilityOf(emailAddress)).sendKeys(emailId);
		
		password.sendKeys(passwd);
		submitButton.click();
		
		
	}
	
	public String AuthenticateMsg(){
		
		return authFailedMsg.getText();
	}
}

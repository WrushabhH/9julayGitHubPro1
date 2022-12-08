package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	
	//-----------Obj----------------

	
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txt;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txt;

	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;

	
	
	//-------Action Method-----------

	
	
	public void enterEmailID(String email)
	{
       email_txt.sendKeys(email);
       
       logger.info("Enter Email Id");
	}
	public void enterPassword(String password) 
	{
		password_txt.sendKeys(password);
		
		logger.info("Enter Password");
	}
	public void clickOnLoginButton() 
	{
	    login_btn.click();
	    
	    logger.info("click on Login Button");
	}
	
	public String getUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	
}

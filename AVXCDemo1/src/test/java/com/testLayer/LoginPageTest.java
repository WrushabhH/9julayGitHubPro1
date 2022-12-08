package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.LoginPage;
import com.testBase.TestBase;

public class LoginPageTest extends TestBase{
   
	String expected_url = "https://apps.dalalstreet.ai/dashboard";
	
	
	@Test(enabled=false)
	public void verifyLoginFunctioalityWithValidCred() throws InterruptedException
	{
		String expected_url = "https://apps.dalalstreet.ai/dashboard";
		Thread.sleep(2000);
		
		String actual_url = login.getUrl();
		System.out.println(actual_url);
		Assert.assertEquals(actual_url, expected_url);//assertEqual for pass
		
		logger.info("Login Test Case Passed");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	@Test(enabled=false)
	public void verifyLoginFunctioalityWithInvalidPassCred() throws InterruptedException
	{
		String expected_url = "https://apps.dalalstreet.ai/dashboard";
		
		//Enter user name
		//Enter Wrong password
		LoginPage login = new LoginPage(); 
		login.enterEmailID("wrushabhhedaoo20@gmail.com");
		login.enterPassword("mnd5hackno");
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		String actual_url = login.getUrl();
		System.out.println(actual_url);
		Assert.assertNotEquals(actual_url, expected_url);//assertNotEqual for pass
		
		logger.info("Login Test Case Failed");
	}
	
	
	@Test(enabled=false)
	public void verifyLoginFunctioalityWithBlankPassCred() throws InterruptedException
	{
		String expected_url = "https://apps.dalalstreet.ai/dashboard";
		
		//Enter user name
		//Do not Enter password
		LoginPage login = new LoginPage(); 
		login.enterEmailID("wrushabhhedaoo20@gmail.com");
		login.enterPassword("");
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		String actual_url = login.getUrl();
		System.out.println(actual_url);
		Assert.assertNotEquals(actual_url, expected_url);//assertNotEqual for pass
		
		logger.info("Login Test Case Failed");
	}
	
	@Test(enabled=false)
	public void verifyLoginFunctioalityWithInvalidUNCred() throws InterruptedException
	{
		String expected_url = "https://apps.dalalstreet.ai/dashboard";
		
		//Enter Wrong user name
		//Enter password
		LoginPage login = new LoginPage(); 
		login.enterEmailID("wrushabhhedaoo@gmail.com");
		login.enterPassword("m!nd20hack");
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		String actual_url = login.getUrl();
		System.out.println(actual_url);
		Assert.assertNotEquals(actual_url, expected_url);//assertNotEqual for pass
		
		logger.info("Login Test Case Failed");
	}
	
	@Test(enabled=false)
	public void verifyLoginFunctioalityWithBlankUNCred() throws InterruptedException
	{
		String expected_url = "https://apps.dalalstreet.ai/dashboard";
		
		//Enter Wrong user name
		//Enter password
		LoginPage login = new LoginPage(); 
		login.enterEmailID("");
		login.enterPassword("m!nd20hack");
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		String actual_url = login.getUrl();
		System.out.println(actual_url);
		Assert.assertNotEquals(actual_url, expected_url);//assertNotEqual for pass
		
		logger.info("Login Test Case Failed");
	}
	
	
	@Test(enabled=false)
	public void verifyLoginFunctioalityWithInValidUNPassCred() throws InterruptedException
	{
		String expected_url = "https://apps.dalalstreet.ai/dashboard";
		
		//Enter Wrong user name
		//Enter password
		LoginPage login = new LoginPage(); 
		login.enterEmailID("wrushabhhedaoo@gmail.com");
		login.enterPassword("mnd2hackno");
		login.clickOnLoginButton();
		Thread.sleep(2000);
		
		String actual_url = login.getUrl();
		System.out.println(actual_url);
		Assert.assertNotEquals(actual_url, expected_url);//assertNotEqual for pass
		
		logger.info("Login Test Case Failed");
	}
	
	
	
}

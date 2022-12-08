package com.testBase;


import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pageLayer.DashboardPage;
import com.pageLayer.Exchange;
import com.pageLayer.LoginPage;
import com.pageLayer.TransactionsPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Logger logger;
	public LoginPage login;
	public DashboardPage dash;
	public Exchange exchange;
	public TransactionsPage transactions;

	@BeforeClass
	public void start() 
	{
	   logger = Logger.getLogger("DalalStreetFramework");      //do not import logger
	   PropertyConfigurator.configure("Log4j.properties");
	   
	   logger.info("Execution started");
	}
	
	@AfterClass
	public void end() 
	{
	   logger.info("Execution end");
	}
	
//--------------------------------------------------------	
	
	@BeforeMethod
	public void setup() throws InterruptedException 
	{
		String browser = "ChRome";
		
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
		}
		else
		{
			System.out.print("Please Enter the valide Browser");
		}
		
		logger.info("Browser Launched");
		
		driver.navigate().to("https://apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		logger.info("url, maximize and provided wait");
		
		
		//------------------object creation------------------
		    login = new LoginPage();
		    dash = new DashboardPage();
	        exchange = new Exchange();
	        transactions = new TransactionsPage();
	        
	        
	        
	    //------------------Login Steps----------------------
	        login.enterEmailID("wrushabhhedaoo20@gmail.com");
			login.enterPassword("m!nd20hack");
			login.clickOnLoginButton();
			Thread.sleep(3000);
			
		logger.info("Logged in Successfully");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("Browse Closed");
	}

}

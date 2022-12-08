package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.testBase.TestBase;

public class TradingShearTest extends TestBase{
	
	@Test
	public void verifyBuyShareIciciBank() throws InterruptedException
	{		
	//--------------ICICI BANK---------------------
		dash.enterCompanyName("ICICI BANK");
		dash.clickOnCompanyOption();
		logger.info("ICICI BANK Shares");
		Thread.sleep(3000);
	//---------------------------------------------
		exchange.clickOnBuyButtonOption();
		exchange.clickOnIntradayOption();
		exchange.clickOnCustomLimit();
		exchange.enterQuantityofShares("1");
		exchange.clickOnBuyButton();
		Thread.sleep(3000);
	//---------------------------------------------
		String actual_status = exchange.getStatus();
		String expected_status = "Limit Order Created Successfully";
		
		Assert.assertEquals(actual_status, expected_status);
	}
	
	
	@Test
	public void verifyBuyShareWipro() throws InterruptedException
	{		
	//-------------------WIPRO---------------------
		dash.enterCompanyName("WIPRO");
		dash.clickOnCompanyOption();
		logger.info("WIPRO Shares");
		Thread.sleep(3000);
	//---------------------------------------------
		exchange.clickOnBuyButtonOption();
		exchange.clickOnIntradayOption();
		exchange.clickOnCustomLimit();
		exchange.enterQuantityofShares("1");
		exchange.clickOnBuyButton();
		Thread.sleep(3000);
	//---------------------------------------------
		String actual_status = exchange.getStatus();
		String expected_status = "Limit Order Created Successfully";
		
		Assert.assertEquals(actual_status, expected_status);
	}
	
	

	@Test
	public void verifyBuyShareAxisBank() throws InterruptedException
	{		
	//-------------------AXIS---------------------
		dash.enterCompanyName("AXIS");
		dash.clickOnCompanyOption();
		logger.info("AXIS BANK Shares");
		Thread.sleep(3000);
	//---------------------------------------------
		exchange.clickOnBuyButtonOption();
		exchange.clickOnIntradayOption();
		exchange.clickOnCustomLimit();
		exchange.enterQuantityofShares("1");
		exchange.clickOnBuyButton();
		Thread.sleep(3000);
	//---------------------------------------------
		String actual_status = exchange.getStatus();
		String expected_status = "Limit Order Created Successfully";
		
		Assert.assertEquals(actual_status, expected_status);
	}

	
}

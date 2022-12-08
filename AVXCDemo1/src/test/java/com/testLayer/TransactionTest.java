package com.testLayer;

import org.testng.annotations.Test;

import com.testBase.TestBase;

public class TransactionTest extends TestBase{
	
	@Test
	public void getTransationDetailsOnConsol() throws InterruptedException 
	{
		dash.clickonTransactionsLink();
		Thread.sleep(2000);
		transactions.getTransactionDetails();
	}

}

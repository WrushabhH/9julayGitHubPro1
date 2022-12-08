package com.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
        logger.info("Test execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test execution Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test execution Failure");
	    ScreenS.SScode(result.getName()+System.currentTimeMillis());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test execution Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    
		}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
			}

	@Override
	public void onStart(ITestContext context) {
			}

	@Override
	public void onFinish(ITestContext context) {
	
	}

}

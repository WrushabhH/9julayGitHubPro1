package com.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;


import com.testBase.TestBase;

public class ScreenS extends TestBase
{
	public ScreenS()
	{
		PageFactory.initElements(driver, this);
	}
	
	static String path = "C:\\Users\\wrushabh\\Desktop\\09julyGitHub\\9julayGitHubPro1\\AVXCDemo1\\ScreenShotPath\\";
	public static void SScode(String filename) {
		
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File(path+filename+".png");
		FileHandler.copy(src, des);
		}
		catch(IOException e)
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}
	}

}

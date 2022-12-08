package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Exchange extends TestBase{
	
	public Exchange()
	{
		PageFactory.initElements(driver, this);
	}
	
    //---------------obj----------------------
	private By buy_btn_Option = By.xpath("//a[@class='active nav-link']");
	private By intrad_Order = By.xpath("//label[text() = 'Intraday']");
    private By cut_lmt = By.xpath("//label[text()='Custom Limit']");
	private By quantity_txt = By.xpath("//input[@name='input-Qunatity']");
	private By buy_btn = By.xpath("//button[@class='w-md btn btn-success']");
	private By status_text = By.xpath("//div[contains(text(),'Limit Order Created Successfully')]");
	
	
	
	public void clickOnBuyButtonOption()
	{
		driver.findElement(buy_btn_Option).click();
		
		logger.info("click on buy btn Option");
	}
	
	public void clickOnIntradayOption()
	{
		driver.findElement(intrad_Order).click();
		
		logger.info("click on Intraday Option");
	}
	
	public void clickOnCustomLimit()
	{
		driver.findElement(cut_lmt).click();
		
		logger.info("click on Custom Limit");
	}
	
	public void enterQuantityofShares(String count)
	{
		driver.findElement(quantity_txt).sendKeys(count);
		
		logger.info("Enter Quantity of Shares");
	}
	
	public void clickOnBuyButton()
	{
		driver.findElement(buy_btn).click();
		
		logger.info("click on buy btn");
	}
	
	public String getStatus() {
		String sta = driver.findElement(status_text).getText();
	    return sta;
	}
	
}

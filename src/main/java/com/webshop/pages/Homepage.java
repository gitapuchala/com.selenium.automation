package com.webshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.driver.DriverScript;

public class Homepage extends DriverScript
{
	//***************finding page objects*****************************
	@FindBy(linkText="Register") private WebElement registerlink;
	@FindBy(xpath = "//a[text()='login']") private WebElement loginlink;
	
	//***************Page Initialization/initializing web elements*******************
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
//**************Page Actions/Methods*********************************
	
	public String gethomepagetitle()
	{
		return driver.getTitle();
		}
	
	public void clickRegisterlink()
	{
		registerlink.click();
	}
	public void clickLoginlink()
	{
		loginlink.click();
	}
}

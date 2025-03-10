package com.webshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.driver.DriverScript;

public class RegisterPage extends DriverScript
{
	//*************Page elements******************
	@FindBy(xpath="//h1[text()='Register']") private WebElement registertext;
	@FindBy(xpath="//input[@id='gender-female']") private WebElement femaleradiobutton;
	@FindBy(xpath="//input[@id='FirstName']") private WebElement firstnametextbox;
	@FindBy(xpath="//input[@id='LastName']") private WebElement lastnametextbox;
	@FindBy(xpath="//input[@id='Email']") private WebElement emailtextbox;
	@FindBy(xpath="//input[@id='Password']") private WebElement passwordtextbox;
	@FindBy(xpath="//input[@id='ConfirmPassword']") private WebElement confirmpasswordtextbox;
	@FindBy(xpath="//input[@id='register-button']") private WebElement registerbutton;
	@FindBy(xpath="//li[text()='The specified email already exists']") private WebElement errortext;
	
	//*****************Page Initialization************
	
	public RegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//*****************Page Actions/Methods*****************
	public String geterrortext()
	{
		return errortext.getText();
	}
	public void clickregisterbutton()
	{
		registerbutton.click();
	}
	public String getregisterpagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean isregisterdisplayed()
	{
		return registertext.isDisplayed();
	}
	public void clickfemaleradiobutton()
	{
		femaleradiobutton.click();
	}
	public void firstnametext(String firstname)
	{
		firstnametextbox.sendKeys(firstname);
	}
	public void lastnametext(String lastname)
	{
		lastnametextbox.sendKeys(lastname);
	}
	public void emailtext(String email)
	{
		emailtextbox.sendKeys(email);
	}
	public void passwordtext(String password)
	{
		passwordtextbox.sendKeys(password);
	}
	public void confirmpasswordtext(String confirmpassword)
	{
		confirmpasswordtextbox.sendKeys(confirmpassword);
	}
	

}

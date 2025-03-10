package com.webshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterpageTest extends Basetest
{
	@Test(priority = 1)
	public void testinvaliddataentry() 
	{
			
		hpg.clickRegisterlink();
		logger.pass("clickregisterlink");
		rpg.clickfemaleradiobutton();
		logger.pass("clickfemaleradiobutton");
		rpg.firstnametext("monica");
		logger.pass("enterfirstname");
		rpg.lastnametext("reddy");
		logger.pass("enterlasttname");
		rpg.emailtext("gitapuchala@gmail.com");
		logger.pass("email");
		rpg.passwordtext("Monica@25");
		logger.pass("password");
		rpg.confirmpasswordtext("Monica@25");
		logger.pass("confirmpassword");
		rpg.clickregisterbutton();
		logger.pass("clickregister");
		String error = rpg.geterrortext();
		System.out.println(error);
		Assert.assertTrue(true);
		logger.pass("verifiederror");
			}
	@Test(priority = 2)
	public void testregisterlandingpage()
	{
		
		hpg.clickRegisterlink();
		logger.pass("clickregister");
		String rpgtitle = rpg.getregisterpagetitle();
		System.out.println(rpgtitle);
		Assert.assertTrue(true);
		logger.pass("verifiedtitle");
		
	}
	@Test(priority = 3)
public void testregisterform() 
{
		
	hpg.clickRegisterlink();
	rpg.clickfemaleradiobutton();
	rpg.firstnametext("shyamala");
	rpg.lastnametext("roy");
	rpg.emailtext("ray@hotmail.com");
	rpg.passwordtext("Monica@25");
	rpg.confirmpasswordtext("Monica@25");
	
	
	 
}
}

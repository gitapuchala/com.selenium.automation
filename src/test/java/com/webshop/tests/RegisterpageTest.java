package com.webshop.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterpageTest extends Basetest
{
	@Test(priority = 1)
	public void testvalidationmessage() {
		logger = report.createTest("testvalidationmessage");
		String hpgtitle = hpg.gethomepagetitle();
		logger.pass("get homepage title");
		System.out.println(hpgtitle);
		
		//Assert.assertTrue(hpgtitle.contains("demo web shop"));
		//logger.pass("home page title validated");
		
		hpg.clickRegisterlink();
		logger.pass("click register link");
		rpg.clickfemaleradiobutton();
		logger.pass("click female radiobutton");
		rpg.firstnametext("moni");
		logger.pass("enter firstname");
		rpg.lastnametext("roy");
		logger.pass("enter lasttname");
		rpg.emailtext("gitapuchala@gmail.com");
		logger.pass("email");
		rpg.passwordtext("Monica@25");
		logger.pass("password");
		rpg.confirmpasswordtext("Monica@25");
		logger.pass("confirmpassword");
		rpg.clickregisterbutton();
		logger.pass("click register button");
		String text = rpg.geterrortext();
		System.out.println(text);
		Assert.assertTrue(text.contains("email already exists"));
		logger.pass("verified validation message");

	}

	@Test(priority = 2)
	public void testregisterlandingpage() {
		logger = report.createTest("test register landing page");
		hpg.clickRegisterlink();
		logger.pass("clickregister");
		String rpgtitle = rpg.getregisterpagetitle();
		System.out.println(rpgtitle);
		
		//Assert.assertTrue(rpgtitle.contains("register"));
		//logger.pass("verified title");
		
		boolean registerlabel = rpg.isregisterdisplayed();
		System.out.println(registerlabel);
		Assert.assertTrue(registerlabel);
		logger.pass("verified register label");

	}

	@Test(priority = 3)
	public void testregisterform() {
		hpg.clickRegisterlink();
		rpg.clickfemaleradiobutton();
		rpg.firstnametext("shyam");
		rpg.lastnametext("reddy");
		rpg.emailtext("shyam@hotmail.com");
		rpg.passwordtext("Shyam@25");
		rpg.confirmpasswordtext("Shayam@25");

	}
}

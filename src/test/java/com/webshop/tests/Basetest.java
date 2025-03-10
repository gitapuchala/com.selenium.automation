package com.webshop.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webshop.driver.DriverScript;
import com.webshop.pages.Homepage;
import com.webshop.pages.RegisterPage;

public class Basetest extends DriverScript {
	public static ExtentTest logger;
	public static ExtentReports report;
	Homepage hpg;
	RegisterPage rpg;

	@BeforeSuite
	public void setupreport() {
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./testreports");
		report = new ExtentReports();
		report.attachReporter(extent);
	}

	@BeforeMethod
	public void pretest() {
		InitApplication();
		hpg = new Homepage();
		rpg = new RegisterPage();
	}

	@AfterMethod
	public void teardown() {
		report.flush();
		driver.quit();
	}

}

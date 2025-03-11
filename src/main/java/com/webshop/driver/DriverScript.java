package com.webshop.driver;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverScript 
{
	public static WebDriver driver;
	static Properties prop;
	
/*This constructor 'driver script' loads the properties file
 * 
 */
public DriverScript()
{
	try
	{
		File file = new File("./src/test/resources/config/config.properties");
		 FileInputStream fis = new FileInputStream(file);
		  prop = new Properties();
		 prop.load(fis);
	}
	catch(Exception e)
	{
		System.err.println("unable to load driver");
		e.printStackTrace();
	}
	}
	/*
	 * This method InitApplication() will launch the browser based on properties file value.
	 */
	
	public void InitApplication()
	{
		String browser = prop.getProperty("browser");
				
	if(browser.trim().equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.trim().equalsIgnoreCase("edge"))
	{
	driver= new EdgeDriver();
	}
	else if(browser.trim().equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("unsupported browser");
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	geturl();
	}
	
	/*
	 * this method is used to fetch application url from properties file
	 * and it is called inside InitApplication() method.
	 */
	public static void geturl()
	{
		String url=prop.getProperty("url");
		driver.get(url);
	}
	/*
	 * this method is used to quit driver
	 */
public static void quitdriver()
{
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e)
	{		
		e.printStackTrace();
	}
	driver.quit();
}
}
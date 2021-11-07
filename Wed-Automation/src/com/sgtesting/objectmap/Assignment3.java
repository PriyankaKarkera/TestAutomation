package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		deletecustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createcustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagetaskbtn")).click();
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("homepageaddnewbtn")).click();
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("homepagenewcustomerbtn")).click();
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("entercustomernamefield")).sendKeys("Customer1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createcustomerbtn")).click();
			Thread.sleep(1000);
				
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deletecustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("createdcustomersettingbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customerfieldactionbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customerdeletebtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customerdeletepermanentlybtn")).click();
			Thread.sleep(1000);
			}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}


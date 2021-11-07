package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		modifyuser();
		deleteuser();
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
	static void createuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageuserbtn")).click();
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("homepageadduserbtn")).click();
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("adduserFirstnametxtfield")).sendKeys("User1");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("adduserMiddlenametxtfield")).sendKeys("M");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("adduserLastnametxtfield")).sendKeys("L");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("adduserEmailtxtfield")).sendKeys("User1@gmail.com");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("addusernametxtfield")).sendKeys("User11");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("adduserpasswordtxtfield")).sendKeys("12");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("adduserretypepasswordtxtfield")).sendKeys("12");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("createuserbtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifyuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("selectuser1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("adduserFirstnametxtfield")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("usersavechangesbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("selectuser1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deletebuttonforuser")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(2000);
		
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



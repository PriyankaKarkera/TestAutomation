package com.sg.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
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
			System.setProperty("webdriver.chrome.driver", "D:\\\\ExampleAutomation\\\\Automation\\\\Wed-Automation\\\\Library\\\\Driver\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createuser()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.adduser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("priyanka");
			oPage.getmiddleName().sendKeys("km");
			oPage.getlastName().sendKeys("Karkera");
			oPage.getemail().sendKeys("Priya@gmail");
			oPage.getusername().sendKeys("priya");
			oPage.getuserDataLightBox_passwordField().sendKeys("1234");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("1234");
			Thread.sleep(2000);
			oPage.createbutton().click();
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
			oPage.selectuser1().click();
			Thread.sleep(1000);
			oPage.getuserDataLightBox_firstNameField().sendKeys("Priyankaaa");
			Thread.sleep(1000);
			oPage.getselectchanges().click();
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
			oPage.selectuser1().click();
			Thread.sleep(2000);
			oPage.getdelete().click();
			Thread.sleep(2000);
			
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}	
	
	
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
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


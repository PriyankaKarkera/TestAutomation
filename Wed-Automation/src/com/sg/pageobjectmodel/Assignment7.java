package com.sg.pageobjectmodel;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		createproject();
		createtask();
		deletetask();
		deleteproject();
		deletecustomer();
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
	static void createcustomer()
	{
		try
		{
			oPage.getselecttask().click();
			Thread.sleep(1000);
			oPage.getaddnew().click();
			Thread.sleep(1000);
			oPage.getcreatecustomer1().click();
			Thread.sleep(1000);
			oPage.customerLightBox_nameField().sendKeys("Priyanka");
			Thread.sleep(1000);
			oPage.getcreatenewcustomerbutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createproject()
	{
		try
		{
			oPage.getselecttask().click();
			Thread.sleep(1000);
			oPage.getaddnew().click();
			Thread.sleep(1000);
			oPage.gotonewproject().click();
			Thread.sleep(1000);
			oPage.gotoprojectnamefield().sendKeys("Banking");
			Thread.sleep(1000);
			oPage.clickcreateproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createtask()
	{
		try
		{
			oPage.addnewtask().click();
			Thread.sleep(1000);
			oPage.createnewtask().click();
			Thread.sleep(1000);
			oPage.entertaskname().sendKeys("manager");
			Thread.sleep(1000);
			oPage.createtask().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deletetask()
	{
		try
		{
			oPage.gototaskcreated().click();
			Thread.sleep(2000);
			oPage.gotoactionfortask().click();
			Thread.sleep(2000);
			oPage.gotodeletetask().click();
			Thread.sleep(2000);
			oPage.gotoconfirmdelete().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}	
	
	
	static void deleteproject()
	{
		try
		{
			oPage.gotoviewprojectsetting().click();
			Thread.sleep(2000);
			oPage.gotoactionforproject().click();
			Thread.sleep(2000);
			oPage.gotodeleteproject().click();
			Thread.sleep(2000);
			oPage.gotoconfirmdeleteproject().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}	
	
	
	static void deletecustomer()
	{
		try
		{
			oPage.getocustomersettingbutton().click();
			Thread.sleep(2000);
			oPage.getodeleteactionbutton().click();
			Thread.sleep(2000);
			oPage.getodeletebutton().click();
			Thread.sleep(2000);
			oPage.customerPanel_deleteConfirm_submitTitle().click();
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


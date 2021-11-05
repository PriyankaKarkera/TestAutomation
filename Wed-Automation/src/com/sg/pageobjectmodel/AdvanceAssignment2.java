package com.sg.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceAssignment2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser1();
		logout1();
		loginuser1();
		createuser2();
		logoutuser1();
		loginuser2();
		createuser3();
		logoutuser2();
		loginuser3();
		logoutuser3();
		loginuser2A();
		modifyuser3();
		logoutuser2A();
		loginuser3A();
		logoutuser3A();
		loginuser1A();
		modifyuser2();
		logoutuser1A();
		loginuser2B();
		logoutuser2B();
		loginadmin1();
		modifyuser1();
		logout2();
		loginuser1B();
		logoutuser1B();
	    loginuser2C();
	    deleteuser3();
	    logoutuser2C();
	    loginuser1C();
	    deleteuser2();
	    logout1C();
	    loginadmin2();
	    deleteuser1();
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
	
	static void createuser1()
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
	static void logout1()
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
	static void loginuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("priya");
			oPage.getPassword().sendKeys("1234");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.startexplore().click();
			Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createuser2()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.adduser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("prajwal");
			oPage.getmiddleName().sendKeys("km");
			oPage.getlastName().sendKeys("Karkera");
			oPage.getemail().sendKeys("Prajju@gmail");
			oPage.getusername().sendKeys("praj");
			oPage.getuserDataLightBox_passwordField().sendKeys("5678");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("5678");
			Thread.sleep(2000);
			oPage.createbutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutuser1()
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
	static void loginuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("praj");
			oPage.getPassword().sendKeys("5678");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.startexplore().click();
			Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createuser3()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.adduser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("pranvi");
			oPage.getmiddleName().sendKeys("km");
			oPage.getlastName().sendKeys("Salian");
			oPage.getemail().sendKeys("Pranvi@gmail");
			oPage.getusername().sendKeys("prannu");
			oPage.getuserDataLightBox_passwordField().sendKeys("1011");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("1011");
			Thread.sleep(2000);
			oPage.createbutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutuser2()
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
	static void loginuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("prannu");
			oPage.getPassword().sendKeys("1011");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.startexplore().click();
			Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutuser3()
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
	static void loginuser2A()
	{
		try
		{
			oPage.getUserName().sendKeys("praj");
			oPage.getPassword().sendKeys("5678");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifyuser3()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.selectcreateduser3().click();
			Thread.sleep(1000);
			oPage.getuserDataLightBox_passwordField().sendKeys("1920");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("1920");
			Thread.sleep(1000);
			
			oPage.getselectchanges().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutuser2A()
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
	static void loginuser3A()
	{
		try
		{
			oPage.getUserName().sendKeys("prannu");
			oPage.getPassword().sendKeys("1920");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutuser3A()
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
	static void loginuser1A()
	{
		try
		{
			oPage.getUserName().sendKeys("priya");
			oPage.getPassword().sendKeys("1234");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifyuser2()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.selectcreateduser2().click();
			Thread.sleep(1000);
			oPage.getuserDataLightBox_passwordField().sendKeys("1718");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("1718");
			Thread.sleep(1000);
			oPage.getselectchanges().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutuser1A()
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
	
	static void loginuser2B()
	{
		try
		{
			oPage.getUserName().sendKeys("praj");
			oPage.getPassword().sendKeys("1718");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutuser2B()
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
	static void loginadmin1()
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
	static void modifyuser1()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.selectcreateduser1().click();
			Thread.sleep(1000);
			oPage.getuserDataLightBox_passwordField().sendKeys("1516");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("1516");
			Thread.sleep(1000);
			oPage.getselectchanges().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logout2()
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
	static void loginuser1B()
	{
		try
		{
			oPage.getUserName().sendKeys("priya");
			oPage.getPassword().sendKeys("1516");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logoutuser1B()
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
	static void loginuser2C()
	{
		try
		{
			oPage.getUserName().sendKeys("praj");
			oPage.getPassword().sendKeys("1718");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteuser3()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.selectcreateduser3().click();
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
	
	static void logoutuser2C()
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
	static void loginuser1C()
	{
		try
		{
			oPage.getUserName().sendKeys("priya");
			oPage.getPassword().sendKeys("1516");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteuser2()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.selectcreateduser2().click();
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
	static void logout1C()
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
	
	static void loginadmin2()
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
	static void deleteuser1()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.selectcreateduser2().click();
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
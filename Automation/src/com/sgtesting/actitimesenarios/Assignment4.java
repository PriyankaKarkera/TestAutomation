package com.sgtesting.actitimesenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class Assignment4 {
	SoftAssert soft=new SoftAssert();
	public static Logger log=Logger.getLogger("Automation...");
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			log.info("Assignment4");
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Wed-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			log.info("The Actitime launched Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=2)
	public  void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			 String Expectetitle="actiTIME - Login";
			 String Actualtitle=oBrowser.getTitle();
		    soft.assertEquals(Expectetitle,Actualtitle);
			System.out.println("The Assert Steps has passed for navigate !!!");
		    soft.assertAll();
			log.info("The Actitime navigated Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=3,dataProvider = "loginadmin")
	public void login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for login !!!");
			soft.assertAll();
			log.info("The Actitime login Successfully here...");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=4)
	public  void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for minimizeFlyOutWindow !!!");
			soft.assertAll();
			log.info("The Actitime minimized FlyOutWindow Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=5,dataProvider = "createcustomer")
	public  void createcustomer(String cusnm)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys(cusnm);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for createcustomer !!!");
			soft.assertAll();
			log.info("The Actitime created customer Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=6,dataProvider ="modifycustomer")
	public  void modifycustomer(String mun)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[1]/div[3]/div/span")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")).sendKeys(mun);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")).click();
			Thread.sleep(1000);
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for modifycustomer !!!");
			soft.assertAll();
			log.info("The Actitime modified customer Successfully here...");
			}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=7)
	public  void deletecustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(2000);
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for deletecustomer !!!");
			soft.assertAll();
			log.info("The Actitime deleted customer Successfully here...");
			}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=8)
	public  void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for logout !!!");
			soft.assertAll();
			log.info("The Actitime logged out Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=9)
	public  void closeApplication()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(1000);
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for closeApplication !!!");
			soft.assertAll();
			log.info("The Actitime closed Application Successfully here...");
			log.info("++++++++++++++++++++++++++++++++++++++++++++++");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	@DataProvider(name="loginadmin")
	public Object[][] getloginadmin()
	{
		return new Object[][] {
			{"admin","manager"}
			};
	}
	
	@DataProvider(name="createcustomer")
	public Object[][] getCreatecustomer()
	{
		return new Object[][]{
			{"Priyanka"}
	};
	}
	@DataProvider(name="modifycustomer")
	public Object[][] getmodifycustomer()
	{
		return new Object[][]{
			{"Karkera"}
	};
	}


	


}




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


public class Assignment2 {
	SoftAssert soft=new SoftAssert();
	public static Logger log=Logger.getLogger("Automation...");
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	public  void launchBrowser()
	{
		try
		{
			log.info("Assignment2");
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
			log.info("The Actitime minimizeFlyOutWindow Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	

	@Test(priority=5,dataProvider ="createuser")
	public  void createuser(String fn,String mn,String ln,String gm,String un,String pwd,String rpwd)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys(fn);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_middleNameField\']")).sendKeys(mn);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys(ln);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']")).sendKeys(gm);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys(un);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys(rpwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			log.info("The Actitime logout Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=6,dataProvider ="modifyuser")
	public void modifyuser(String modfn)
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys(modfn);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			log.info("The Actitime modified user Successfully here...");
	      }catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=7)
	public  void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for deleteuser !!!");
			soft.assertAll();
			log.info("The Actitime deleted user Successfully here...");
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
	@DataProvider(name="createuser")
	public Object[][] getCreateuser()
	{
		return new Object[][]{
			{"Priyanka","km","karkera","priya@gmail.com","priya","xyz","xyz"}
			};
	}

	@DataProvider(name="modifyuser")
	public Object[][] getmodifyuser()
	{
		return new Object[][]{
			{"Priyanka"}
			};
	}



}

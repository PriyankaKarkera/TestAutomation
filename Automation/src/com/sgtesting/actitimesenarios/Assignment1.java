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
import org.testng.asserts.SoftAssert;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assignment1 {
	SoftAssert soft=new SoftAssert();
	public static Logger log=Logger.getLogger("Automation...");
	public static WebDriver oBrowser=null;
	
	@Test(priority=1)
	public  void launchBrowser()
	{
		try
		{
			log.info("Assignment1");
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Wed-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			log.info("The Actitime launched Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=2)
	public void navigate()
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
			String expectedname="username";
			String Actualname=oBrowser.findElement(By.xpath("//*[@id=\'username\']")).getAttribute("name");
			soft.assertEquals(expectedname,Actualname);
			System.out.println("The Assert Steps has passed for usernamefield !!!");
		    soft.assertAll();
		    
		    oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
		    String expectedtype="password";
		    String Actualtype=oBrowser.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).getAttribute("type");
			soft.assertEquals(expectedtype,Actualtype);
			System.out.println("The Assert Steps has passed for passwordfield !!!");
		    soft.assertAll();
				
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			log.info("The Actitime login Successfully here...");
			Thread.sleep(3000);
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
		    String expectedclass="gettingStartedShortcutsLabel";
		    String Actualclass=oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).getAttribute("class");
			soft.assertEquals(expectedclass,Actualclass);
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
			String expectedclass="img";
		    String Actualclass=oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).getAttribute("class");
			soft.assertEquals(expectedclass,Actualclass);
			System.out.println("The Assert Steps has passed for usersfield !!!");
		    soft.assertAll();
		    
		    oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			String expectedclass1="buttonText";
		    String Actualclass1=oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).getAttribute("class");
			soft.assertEquals(expectedclass1,Actualclass1);
			System.out.println("The Assert Steps has passed for adduserfield !!!");
		    soft.assertAll();
		    
		    oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys(fn);
			Thread.sleep(500);
			String expectedid="userDataLightBox_firstNameField";
		    String Actualid=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).getAttribute("id");
			soft.assertEquals(expectedid,Actualid);
			System.out.println("The Assert Steps has passed for firstname !!!");
		    soft.assertAll();
		    
		    oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_middleNameField\']")).sendKeys(mn);
			Thread.sleep(500);
			String expectedid1="userDataLightBox_middleNameField";
		    String Actualid1=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_middleNameField\']")).getAttribute("id");
			soft.assertEquals(expectedid1,Actualid1);
			System.out.println("The Assert Steps has passed for middlename !!!");
		    soft.assertAll();
		    
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_lastNameField\"]")).sendKeys(ln);
			Thread.sleep(500);
			String expectedid2="userDataLightBox_lastNameField";
		    String Actualid2=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).getAttribute("id");
			soft.assertEquals(expectedid2,Actualid2);
			System.out.println("The Assert Steps has passed for lastname !!!");
		    soft.assertAll();
		    
		    oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']")).sendKeys(gm);
			Thread.sleep(500);
			String expectedid3="userDataLightBox_emailField";
		    String Actualid3=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']")).getAttribute("id");
			soft.assertEquals(expectedid3,Actualid3);
			System.out.println("The Assert Steps has passed for email !!!");
		    soft.assertAll();
		    
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys(un);
			Thread.sleep(500);
			String expectedid4="userDataLightBox_usernameField";
		    String Actualid4=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).getAttribute("id");
			soft.assertEquals(expectedid4,Actualid4);
			System.out.println("The Assert Steps has passed for username !!!");
		    soft.assertAll();
		    
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys(pwd);
			Thread.sleep(500);
			String expectedid5="userDataLightBox_passwordField";
		    String Actualid5=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).getAttribute("id");
			soft.assertEquals(expectedid5,Actualid5);
			System.out.println("The Assert Steps has passed for password !!!");
		    soft.assertAll();
		    
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys(rpwd);
			Thread.sleep(500);
			String expectedid6="userDataLightBox_passwordCopyField";
		    String Actualid6=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).getAttribute("id");
			soft.assertEquals(expectedid6,Actualid6);
			System.out.println("The Assert Steps has passed for retypepassword !!!");
		    soft.assertAll();
		    
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(500);
			String expectedclass2="buttonTitle";
		    String Actualclass2=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).getAttribute("class");
			soft.assertEquals(expectedclass2,Actualclass2);
			System.out.println("The Assert Steps has passed for createuserbutton !!!");
		    soft.assertAll();
		    
			log.info("The Actitime created Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=6)
	public void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			String expectedclass="name";
		    String Actualclass=oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).getAttribute("class");
			soft.assertEquals(expectedclass,Actualclass);
			System.out.println("The Assert Steps has passed for selectuser !!!");
		    soft.assertAll();
		   
		    oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			 Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			String expectedid="userDataLightBox_deleteBtn";
		    String Actualid=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).getAttribute("id");
			soft.assertEquals(expectedid,Actualid);
			System.out.println("The Assert Steps has passed for deletebutton !!!");
		    soft.assertAll();
		   
			log.info("The Actitime deleted user Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}	
	@Test(priority=7)
	public  void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for logout !!!");
			soft.assertAll();
			log.info("The Actitime logout Successfully here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@Test(priority=8)
	public  void closeApplication()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(1000);
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for closeApplication !!!");
			soft.assertAll();
			log.info("The Actitime closed Successfully here...");
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

	
}

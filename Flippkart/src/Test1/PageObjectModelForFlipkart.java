package Test1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;


public class PageObjectModelForFlipkart {
public static Logger log=Logger.getLogger("Automation");
	public static	WebDriver oBrowser=null;
	public static	FlipKartPage fpage=null;
	
	public static void main(String[] args) {	
		launchBrowser();
		navigate();
		closelogoutpage();
		enteritem();
	}

	public static void launchBrowser()
	{
		log.info("launchBrowser starts succesfully...");
		try 
		{
		System.setProperty("webdriver.chrome.driver","D:\\GitHub\\CurrentWorkSpace\\TestAutomation\\Flippkart\\Library\\Driver\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		fpage=new FlipKartPage(oBrowser);
		oBrowser.manage().window().maximize();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("launchBrowser ends succesfully...");
	}
	
	public static void navigate()
	{
		log.info("Navigate starts succesfully");
		try
		{
		oBrowser.get("https://www.flipkart.com");
		oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("Navigate ends succesfully");
	}
	
	public static void closelogoutpage() 
	{
		log.info("closelogoutpage Starts succesfully");
		try
		{
		fpage.closeloginpage().click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("closelogoutpage ends succesfully");
	}
	
	public static void enteritem() 
	{
		log.info("enteritem Starts succesfully");
		try
		{
		fpage.enteritems().sendKeys("mobiles");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("enteritem ends succesfully");
	}
	
	
}

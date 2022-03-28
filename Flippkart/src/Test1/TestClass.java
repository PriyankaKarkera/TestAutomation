package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
	launchbrowser();	
	navigate();
	search();
	closeapplication();
	}

	static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka km\\Desktop\\browsew\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();		
	    }
    }
	
	static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	 }
	
	static void search()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@type='text']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("sarees");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(1000);
		//	oBrowser.findElement(By.xpath("//img[@class='_2r_T1I' and @ src='https://rukminim1.flixcart.com/image/495/594/kjbr8280-0/sari/a/b/9/free-rebit-lichi-toriox-semi-stitched-original-imafywymkygrzxan.jpeg?q=50'] ")).click();
		//	Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).sendKeys("₹1020");
			//Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeapplication()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	 }
  }

  


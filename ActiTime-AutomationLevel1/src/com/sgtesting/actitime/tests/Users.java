package com.sgtesting.actitime.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Users extends Initialization{
	
	
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("Priyanka");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_middleNameField\']")).sendKeys("km");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("Karkera");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']")).sendKeys("priya@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("priya");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("xyz");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("xyz");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("Priyanka");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
	     }catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public static void deleteUser()
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
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	

}

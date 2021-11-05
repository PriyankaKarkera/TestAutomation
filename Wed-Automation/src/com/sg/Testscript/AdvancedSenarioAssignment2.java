package com.sg.Testscript;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSenarioAssignment2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser1();
		logout();
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
		loginuser3B();
		logoutuser3B();
	
		loginuser1A();
		modifyuser2();
		logoutuser1A();
		loginuser2B();
		logoutuser2B();
		loginadmin();
		modifyuser1();
		logoutadmin();
		loginuser3A();
		logoutuser3A();
		loginuser2C();
		deleteuser3();
		logoutuser2C();
		loginuser1C();
		deleteuser2();
		logoutuser1C();
		loginadminA();
		deleteuser1();
		logoutadminA();
		closeApplication();
	}
		
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Wed-Automation\\Library\\Driver\\chromedriver.exe");
				oBrowser=new ChromeDriver();
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
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				//Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Priya");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("km");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Karkera");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("priyanka@gmail.com");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("priya");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1000);
				}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void loginuser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("priya");
				oBrowser.findElement(By.name("pwd")).sendKeys("1234");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		

		
		static void createuser2()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				//Thread.sleep(1000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Gowtham");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("R");
			//	Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Nayak");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("gowtham@gmail.com");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("gow");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("5678");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("5678");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1000);
				
				
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void logoutuser1()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
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
				oBrowser.findElement(By.id("username")).sendKeys("gow");
				oBrowser.findElement(By.name("pwd")).sendKeys("5678");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		static void createuser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
				//Thread.sleep(1000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Prajwal");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("KM");
			//	Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("karkera");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("prajwal@gmail.com");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("praj");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1011");
				//Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1011");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
			
		static void logoutuser2()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
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
				oBrowser.findElement(By.id("username")).sendKeys("praj");
				oBrowser.findElement(By.name("pwd")).sendKeys("1011");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
				
		static void logoutuser3()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
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
				oBrowser.findElement(By.id("username")).sendKeys("gow");
				oBrowser.findElement(By.name("pwd")).sendKeys("5678");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
			
		static void modifyuser3()
		{
			try
			{
				
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				
				
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
				Thread.sleep(1000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("1415");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("1415");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
				
				}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}	
		static void logoutuser2A()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void loginuser3B()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("praj");
				oBrowser.findElement(By.name("pwd")).sendKeys("1415");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
		     }catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void logoutuser3B()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
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
				oBrowser.findElement(By.id("username")).sendKeys("priya");
				oBrowser.findElement(By.name("pwd")).sendKeys("1234");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
					}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
			
		static void modifyuser2()
		{
			try
			{
				
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				
				
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
				Thread.sleep(1000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("2021");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("2021");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
				
				}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}	
		
		static void logoutuser1A()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
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
				oBrowser.findElement(By.id("username")).sendKeys("gow");
				oBrowser.findElement(By.name("pwd")).sendKeys("2021");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
				}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void logoutuser2B()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void loginadmin()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void modifyuser1()
		{
			try
			{
				
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
				Thread.sleep(1000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("1994");
				Thread.sleep(1000);

				
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("1994");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(4000);
				
		      }catch(Exception e)
			{
				e.printStackTrace();		
			}
		}

		static void logoutadmin()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void loginuser3A()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("priya");
				oBrowser.findElement(By.name("pwd")).sendKeys("1994");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
				}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void logoutuser3A()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
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
				oBrowser.findElement(By.id("username")).sendKeys("gow");
				oBrowser.findElement(By.name("pwd")).sendKeys("2021");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
				}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void deleteuser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
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
		
		static void logoutuser2C()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
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
				oBrowser.findElement(By.id("username")).sendKeys("priya");
				oBrowser.findElement(By.name("pwd")).sendKeys("1994");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
				}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void deleteuser2()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				
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
		
		static void logoutuser1C()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		
		static void loginadminA()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
					}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		static void deleteuser1()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
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
		
		static void logoutadminA()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
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
			
			
			
			
			
			
			
			
			
			

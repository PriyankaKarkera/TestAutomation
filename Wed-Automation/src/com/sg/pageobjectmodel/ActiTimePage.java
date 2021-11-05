package com.sg.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//createuser
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oUser;
	public WebElement clickuser()
	{
		return oUser;
	}

	//adduser
		@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
		private WebElement oAddUser;
		public WebElement adduser()
		{
			return oAddUser;
		}
	//firstname
		private WebElement firstName;
		public WebElement getfirstName()
		{
			return firstName;
		}
    //middleName
				private WebElement middleName;
				public WebElement getmiddleName()
				{
					return middleName;
				}
    //lastName
				private WebElement lastName;
				public WebElement getlastName()
				{
					return lastName;
				}
   //email
				private WebElement email;
				public WebElement getemail()
				{
					return email;
				}
   //username
				private WebElement userDataLightBox_usernameField;
				public WebElement getusername()
				{
					return userDataLightBox_usernameField;
				}
 //password
				private WebElement userDataLightBox_passwordField;
				public WebElement getuserDataLightBox_passwordField()
				{
					return userDataLightBox_passwordField;
				}
//retypassword
				private WebElement userDataLightBox_passwordCopyField;
				public WebElement getuserDataLightBox_passwordCopyField()
				{
					return userDataLightBox_passwordCopyField;
				}
//createbutton
				@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
				private WebElement ocreatebutton;
				public WebElement createbutton()
				{
					return ocreatebutton ;
				}
//selectuser1
				@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
				private WebElement oselectuser1;
				public WebElement selectuser1()
				{
					return oselectuser1 ;
				}
//modifyuser1
				private WebElement userDataLightBox_firstNameField;
				public WebElement getuserDataLightBox_firstNameField()
				{
					return userDataLightBox_firstNameField ;
				}
//selectchanges	
				@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
				private WebElement oselectchanges;
				public WebElement getselectchanges()
				{
					return oselectchanges ;
				}
				

//deleteuser1
				
				private WebElement userDataLightBox_deleteBtn;
				public WebElement getdelete()
				{
					return userDataLightBox_deleteBtn ;
				}
//gototask
				@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")
				private WebElement oselecttask;
				public WebElement getselecttask()
				{
					return oselecttask ;
				}
//addnew
				@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
				private WebElement oaddnew;
				public WebElement getaddnew()
				{
					return oaddnew ;
				}
//selectnewcustomer
				@FindBy(xpath="/html/body/div[14]/div[1]")
				private WebElement ocreatecustomer1;
				public WebElement getcreatecustomer1()
				{
					return ocreatecustomer1 ;
				}
//createnewcustomer
				@FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
				
				private WebElement ocustomerLightBox_nameField;
				public WebElement customerLightBox_nameField()
				{
					return ocustomerLightBox_nameField ;
				}
//	createnewcustomerbutton	
				@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
				private WebElement ocreatenewcustomerbutton;
				public WebElement getcreatenewcustomerbutton()
				{
					return ocreatenewcustomerbutton ;
				}
//customersettingbutton
				
				@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
				private WebElement ocustomersettingbutton;
				public WebElement getocustomersettingbutton()
				{
					return ocustomersettingbutton ;
				}
//actionbutton
				
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
				private WebElement odeleteactionbutton;
				public WebElement getodeleteactionbutton()
				{
					return odeleteactionbutton ;
				}
				
//deletebutton
				
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
				private WebElement odeletebutton;
				public WebElement getodeletebutton()
				{
					return odeletebutton ;
				}
				
//confirmdeletebutton
				
				private WebElement customerPanel_deleteConfirm_submitTitle;
				public WebElement customerPanel_deleteConfirm_submitTitle()
				{
					return customerPanel_deleteConfirm_submitTitle ;
				}
//viewcustomerbutton
				@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
				private WebElement oviewsettingbutton;
				public WebElement getviewsettingbutton()
				{
					return oviewsettingbutton ;
				}
//gotocustomernamelable				
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
				private WebElement ogotocustomernamelable;
				public WebElement gotocustomernamelable()
				{
					return ogotocustomernamelable ;
				}

//gotocustomernameeditlable				
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
				private WebElement ogotocustomernameeditlable;
				public WebElement gotocustomernameeditlable()
				{
					return ogotocustomernameeditlable ;
				}
//gotoActionbutton				
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
				private WebElement ogotoActionbutton;
				public WebElement gotoActionbutton()
				{
					return ogotoActionbutton ;
				}
//selectcustomerformodification
				@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
				private WebElement oselectcustomerformodification;
				public WebElement selectcustomerformodification()
				{
					return oselectcustomerformodification ;
				}
//gotoselectstarbutton
				@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
				private WebElement ogotoselectstarbutton;
				public WebElement gotoselectstarbutton()
				{
					return ogotoselectstarbutton ;
				}
//gotonewproject
			
						@FindBy(xpath="/html/body/div[14]/div[2]")
				private WebElement ogotonewproject;
				public WebElement gotonewproject()
				{
					return ogotonewproject ;
				}
//gotoprojectnamefield
				
				private WebElement projectPopup_projectNameField;
				public WebElement gotoprojectnamefield()
				{
					return projectPopup_projectNameField ;
				}
//clickcreateproject
				
				@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
				private WebElement oclickcreateproject;
				
				public WebElement clickcreateproject()
				{
					return oclickcreateproject ;
				}
//gotoviewprojectsetting
				
				@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
				private WebElement ogotoviewprojectsetting;
				
				public WebElement gotoviewprojectsetting()
				{
					return ogotoviewprojectsetting ;
				}
//gotoactionforproject
				
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
				private WebElement ogotoactionforproject;
				
				public WebElement gotoactionforproject()
				{
					return ogotoactionforproject ;
				}
//gotodeleteproject
				
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
				private WebElement ogotodeleteproject;
				
				public WebElement gotodeleteproject()
				{
					return ogotodeleteproject ;
				}
//gotoconfirmdeleteproject
				
             private WebElement projectPanel_deleteConfirm_submitTitle;
				
				public WebElement gotoconfirmdeleteproject()
				{
					return projectPanel_deleteConfirm_submitTitle ;
				}
//gotonametableofproject
				
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
				private WebElement ogotonametableofproject;
				
				public WebElement gotonametableofproject()
				{
					return ogotonametableofproject ;
				}
//gotoeditnametableofproject
					
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
					private WebElement ogotoeditnametableofproject;
					
					public WebElement gotoeditnametableofproject()
					{
						return ogotoeditnametableofproject;

					}
//gotoActionButton
					
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
					private WebElement ogotoActionButton;
					
					public WebElement gotoActionButton()
					{
						return ogotoActionButton;

					}
//gotocloseButton
					
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
					private WebElement ogotocloseButton;
					
					public WebElement gotocloseButton()
					{
						return ogotocloseButton;

					}
//addnewtask
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
					private WebElement oaddnewtask;
					
					public WebElement addnewtask()
					{
						return oaddnewtask;

					}
//createnewtask
					@FindBy(xpath="/html/body/div[13]/div[1]")
					private WebElement ocreatenewtask;
					
					public WebElement createnewtask()
					{
						return ocreatenewtask;

					}
//entertaskname
					@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
					private WebElement oentertaskname;
					
					public WebElement entertaskname()
					{
						return oentertaskname;

					}
//createtask
					@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
					private WebElement ocreatetask;
					
					public WebElement createtask()
					{
						return ocreatetask;

					}
//gototaskcreated
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")
					private WebElement ogototaskcreated;
					
					public WebElement gototaskcreated()
					{
						return ogototaskcreated;

					}
//gotoactionfortask
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
					private WebElement ogotoactionfortask;
					
					public WebElement gotoactionfortask()
					{
						return ogotoactionfortask;

					}
//gotodeletetask
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
					private WebElement ogotodeletetask;
					
					public WebElement gotodeletetask()
					{
						return ogotodeletetask;

					}
//gotoconfirmdelete
                private WebElement taskPanel_deleteConfirm_submitTitle;
					
					public WebElement gotoconfirmdelete()
					{
						return taskPanel_deleteConfirm_submitTitle;

					}
//startexplore
				@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
					private WebElement ostartexplore;
					
					public WebElement startexplore()
					{
						return ostartexplore;

					}
//selectcreateduser1
					@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
					private WebElement oselectcreateduser1;
					
					public WebElement selectcreateduser1()
					{
						return oselectcreateduser1;

					}
//selectcreateduser2
					@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
					private WebElement oselectcreateduser2;
					
					public WebElement selectcreateduser2()
					{
						return oselectcreateduser2;

					}
//selectcreateduser3
					@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
					private WebElement oselectcreateduser3;
					
					public WebElement selectcreateduser3()
					{
						return oselectcreateduser3;

					}

	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}

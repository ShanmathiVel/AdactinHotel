package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "auth_error")
	private WebElement txtAuthErrMsg;

	@FindBy(id = "username")
	private WebElement txtusername;
	@FindBy(id = "password")
	private WebElement txtpassword;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(id="username_show")
	private WebElement txtWelcomeMsg;

	

	public WebElement getTxtWelcomeMsg() {
		return txtWelcomeMsg;
	}

	

	public WebElement getTxtloginerrormsg() {
		return txtAuthErrMsg;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

/**
 * 
 * @param userName
 * @param password
 * @see Method used to verifying adactin hotel login with valid credentials and login using invalid credentials
 *  
 */


	public void login (String userName,String password) {
    
        elementSendkeys(getTxtusername(), userName);
		elementSendkeys(getTxtpassword(), password);
		elementClick(getBtnLogin());
		    
		
		}
	/**
	 * 
	 * @param userName
	 * @param password
	 * @throws AWTException
	 * @see Method used to verifying Aaactin hotel login using Enterkey
	 */

	public void loginWithEnter(String userName, String password) throws AWTException {
		
		elementSendkeys(getTxtusername(), userName);
		elementSendkeys(getTxtpassword(), password);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

	}


}

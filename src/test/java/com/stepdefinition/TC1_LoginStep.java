package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {
	
	
	PageObjectManager  pom = new PageObjectManager();
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Verifying User is on the Adactin page
	 */

	@Given("User is on the Adactin page")
	public void user_is_on_the_adactin_page() throws FileNotFoundException, IOException {

		
	}
	/**
	 * 
	 * @param userName
	 * @param password
	 * @throws InterruptedException
	 * @see  verifying adactin hotel login with valid crendentials
	 */
     @When("User should perform Login {string}, {string}")
	public void user_should_perform_login(String userName, String password) throws InterruptedException {
		pom.getLoginPage().login(userName, password);

		}
    
     /**
      * 
      * @param userName
      * @param password
      * @throws AWTException
      * @see  verifying adactin hotel login with valid crendentials with enterKkey
      */
	@When("User should perform Login {string}, {string} with EnterKey")
	public void user_should_perform_login_with_enter_key(String userName, String password) throws AWTException {
		pom.getLoginPage().loginWithEnter(userName, password);

	}
	/**
	 * 
	 * @param txtAuthErrMsg
	 * @see Verifying Adactin Hotel Login with invalid credentials 
	 * 
	 */

	@Then("User should verify after Login with invalid credentials error message {string}")
	public void user_should_verify_after_login_with_invalid_credentials_error_message(String txtAuthErrMsg) {

		Assert.assertTrue("verify after login error message",getText(pom.getLoginPage().getTxtloginerrormsg()).contains(txtAuthErrMsg));
				
				
	}
	/**
	 * @see Verifying After Login Success Message
	 */
	@Then("User should verify after login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String txtWelcomeMsg) {
	
	   
		Assert.assertEquals("verify after login succes msg", txtWelcomeMsg,
			getAttribute(pom.getLoginPage().getTxtWelcomeMsg()));
				
	}

	

}

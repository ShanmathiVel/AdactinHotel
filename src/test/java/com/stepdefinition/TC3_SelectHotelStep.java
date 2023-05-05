package com.stepdefinition;
import org.junit.Assert;


import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	/**
	 * @see Verifying The SelectHotel Page By Selecting Hotelname
	 */
	
	@Then("User should select  hotel name and continue")
	public void user_should_select_hotel_name_and_continue() {
		pom.getSelectHotelPage().selectHotel();
	    
	}
	/**
	 * 
	 * @param txtBookHtlMsg
	 * @see verifying after select hotel page navigate to "Book A Hotel"
	 */

	@Then("User should verify success message {string}")
	public void user_should_verify_success_message(String txtBookHtlMsg) {
		Assert.assertEquals("verify after search hotel", txtBookHtlMsg,getText(pom.getSelectHotelPage().getTxtBookHtlMsg()));
	  
	}
	/**
	 * @see Verifying The SelectHotel Page By Not Selecting Hotelname
	 */

	@Then("User should  without select  hotel name and continue")
	public void user_should_without_select_hotel_name_and_continue() {
		pom.getSelectHotelPage().selectHotel1();
	   
	}
	/**
	 * 
	 * @param selectHotelErrMsg
	 * @see Verifying Select Hotel Error Message
	 */

	@Then("User should verify select hotel error message {string}")
	public void user_should_verify_select_hotel_error_message(String selectHotelErrMsg) {
	   Assert.assertEquals("verify select hotelerror msg", selectHotelErrMsg,getText(pom.
			   getSelectHotelPage().getSelectHotelErrMsg()));
			
	}
	

}

package com.stepdefinition;
import org.junit.Assert;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC2_SearchHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	/**
	 * 
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param roomNo
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @param childPerRoom
	 * @see Verifying Adactin HotelSerach By Selecting  All Fields
	 */
	@Then("User should search hotels {string},{string},{string},{string}, {string},{string},{string} and {string}")
	public void user_should_search_hotels_and(String location, String hotels, 
			String roomType, String roomNo, String checkInDate, String checkOutDate, String adultsPerRoom, 
			String childPerRoom) {
	   pom.getSearchHotel().searchHotel(location, hotels, roomType, 
			   roomNo, checkInDate, checkOutDate, adultsPerRoom, childPerRoom);
	}
	/**
	 * 
	 * @param txtSelectMsg
	 * @see verifying after seach hotel page navigate to "Select Hotel"
	 */

	@Then("User should verify after seach hotel page navigate to {string}")
	public void user_should_verify_after_seach_hotel_page_navigate_to(String txtSelectMsg) {
	Assert.assertEquals("verify after search hotel", txtSelectMsg, 
			pom.getSearchHotel().getTxtSelectMsg().getText());    
	}
	/**
	 * 
	 * @param location
	 * @param roomNo
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @see Verifying Adactin HotelSerach By Mandatory Fields
	 */
    @Then("User should enter only mandatory fields of search hotel {string},{string},{string},{string} and {string}")
	public void user_should_enter_only_mandatory_fields_of_search_hotel_and(String location, String roomNo, 
			String checkInDate, String checkOutDate, String adultsPerRoom) {
	   pom.getSearchHotel().searchHotel(location, roomNo, checkInDate, checkOutDate, adultsPerRoom);
	}
    /**
     * 
     * @param checkInErrMsg
     * @param checkOutErrMsg
     * @see  Verifying  Adactin Search Hotel Page  By Entering Invalid Date Information
     */
    @Then("User should verify date error message {string} and {string}")
	public void user_should_verify_date_error_message_and(String checkInErrMsg, String checkOutErrMsg) {
	   Assert.assertEquals("verify checkin error msg", checkInErrMsg,getText(pom.getSearchHotel().getCheckInErrMsg()));
	   Assert.assertEquals("verify checkin error msg", checkOutErrMsg, getText(pom.getSearchHotel().getCheckOutErrMsg()));
			   
	}
    /**
     * @see Verifying Navigation Of Adactin Search Hotel Page By Without Selecting Hotel Information
     * 
     */
   @Then("User should search hotels without selecting hotel information")
	public void user_should_search_hotels_without_selecting_hotel_information() {
		pom.getSearchHotel().searchHotel();
	   
	}
   /**
    * 
    * @param txtErrLocation
    * @see Verifying Location Error Message
    */
   @Then("User should verify location error message {string}")
	public void user_should_verify_location_error_message(String txtErrLocation) {
		Assert.assertEquals("Verify the error message after Search Hotel Search Hotel", 
				txtErrLocation,getText(pom.getSearchHotel().getTxtErrLocation()));
		
	   
	}


}

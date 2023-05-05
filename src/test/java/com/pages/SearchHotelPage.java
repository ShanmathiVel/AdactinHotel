package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	public 	SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	@FindBy(id="username_show")
	private WebElement txtWelcomeMsg;
	@FindBy(id="hotels")
	private WebElement dDnhotel;
    @FindBy(id="room_type")
	private WebElement dDnroomtype;
	@FindBy(id="room_nos")
	private WebElement dDnroomnos;
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	@FindBy(id="adult_room")
	private WebElement dDnadultperroom;
	@FindBy(id="child_room")
	private WebElement dDnchildperroom;
	@FindBy(id="Submit")
	private WebElement btnsumbit;
	@FindBy(id= "location_span")
	private WebElement txtErrLocation;
	@FindBy(id="checkin_span")
	private WebElement checkInErrMsg;
	@FindBy(id="checkout_span")
	private WebElement checkOutErrMsg;
	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement txtSelectMsg;
	
	
	
	
	public WebElement getTxtSelectMsg() {
		return txtSelectMsg;
	}




	public WebElement getTxtErrLocation() {
		return txtErrLocation;
	}

	
	
	
	public WebElement getCheckInErrMsg() {
		return checkInErrMsg;
	}
	public WebElement getCheckOutErrMsg() {
		return checkOutErrMsg;
	}
	public WebElement getTxtWelcomeMsg() {
		return txtWelcomeMsg;
	}
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnhotel() {
		return dDnhotel;
	}
	public WebElement getdDnroomtype() {
		return dDnroomtype;
	}
	public WebElement getdDnroomnos() {
		return dDnroomnos;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getdDnadultperroom() {
		return dDnadultperroom;
	}
	public WebElement getdDnchildperroom() {
		return dDnchildperroom;
	}
	public WebElement getBtnsumbit() {
		return btnsumbit;
	}
	/**
	 * 
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param roomNo
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultPerRoom
	 * @param childPerRoom
	 * @see Method used to verifying adactin searchhotel page by selecting  all fields and verifying  adactin searchhotel page 
	   by entering invalid date information
	 */
	

	public void searchHotel(String location,String hotels,String roomType,String roomNo,String checkInDate,
			String checkOutDate,String adultPerRoom,String childPerRoom) {
		
		selectByText(getdDnLocation(), location);
		selectByText(getdDnhotel(), hotels);
		selectByText(getdDnroomtype(), roomType);
		selectByText(getdDnroomnos(), roomNo);
		clear(getCheckindate());
		elementSendkeys(getCheckindate(), checkInDate);
		clear(getCheckoutdate());
		elementSendkeys(getCheckoutdate(), checkOutDate);
		selectByText(getdDnadultperroom(), adultPerRoom);
		selectByText(getdDnchildperroom(), childPerRoom);
		elementClick(getBtnsumbit());
		
	}
	/**
	 * 
	 * @param location
	 * @param roomNo
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultPerRoom
	 * @ Method used to verifying navigation of adactin searchhotel page by selecting only mandatory fields
	 */
	
	public void searchHotel(String location,String roomNo,String checkInDate,String checkOutDate, String adultPerRoom) {
		
		selectByText(getdDnLocation(), location);
		selectByText(getdDnroomnos(), roomNo);
		clear(getCheckindate());
		elementSendkeys(getCheckindate(), checkInDate);
		clear(getCheckoutdate());
		elementSendkeys(getCheckoutdate(), checkOutDate);
		selectByText(getdDnadultperroom(), adultPerRoom);
		elementClick(getBtnsumbit());
	}
	/**
	 * @see Method used to  verifying navigation of adactin searchhotel page by without selecting hotel information
	 */
	public void searchHotel() {
		elementClick(getBtnsumbit());
		
	}
	

}

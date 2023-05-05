package com.pagemanager;

import com.pages.LoginPage;
import com.pages.SearchHotelPage;

public class PageObjectManager {
	private  LoginPage loginPage;
	private  SearchHotelPage searchHotelPage;
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new LoginPage():loginPage;
	}
	public SearchHotelPage getSearchHotel() {
		return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
	}

}

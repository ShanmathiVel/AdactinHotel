package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement txtSelectMsg;
	@FindBy(id="radiobutton_0")
	private WebElement rBtnselect;
	@FindBy(id="continue")
	private WebElement btncontinue;
	@FindBy(id="radiobutton_span")
	private WebElement selectHotelErrMsg;
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtBookHtlMsg;
	

	public WebElement getTxtBookHtlMsg() {
		return txtBookHtlMsg;
	}

	public WebElement getSelectHotelErrMsg() {
		return selectHotelErrMsg;
	}

	public WebElement getrBtnselect() {
		return rBtnselect;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	public WebElement getTxtSelectMsg() {
		return txtSelectMsg;
	}

	
	
	/**
	 * @see Method used to verifying the selecthotel page by selecting hotelname
	 */
	
	
	
	public void selectHotel() {
		
		elementClick(getrBtnselect());
		elementClick(getBtncontinue());
	
	}
	
	/**
	 * @see Method used to verifying the selecthotel page by not selecting hotelname  
	 */
	
	public void selectHotel1() {
		
		elementClick(getBtncontinue());
	}


}

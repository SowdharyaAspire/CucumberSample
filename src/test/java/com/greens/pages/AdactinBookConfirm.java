package com.greens.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author sowndharyalakshmi
 * @Date 23 Nov 2021
 *
 */
public class AdactinBookConfirm {

	/**
	 * @param driver
	 * 
	 * Constructor with Page Factory to init elements in the class
	 */
	public AdactinBookConfirm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "order_no")
	private WebElement txtOrderNumber;

	public WebElement getTxtOrderNumber() {
		return txtOrderNumber;
	}

	@FindBy(how = How.ID, using = "my_itinerary")
	private WebElement btnMyItinery;
	
	@FindBy(how = How.XPATH, using = "//*[@id='booking_form']/table/tbody/tr[1]/td")
	private WebElement titleBookingConfirm;

	public WebElement getTitleBookingConfirm() {
		return titleBookingConfirm;
	}

	/**
	 * @return Order Number of the booking
	 */
	public String getOrderNumber() {
		
		String orderNo = txtOrderNumber.getAttribute("value");
		return orderNo;
	}

	/**
	 * Click My Itenary button in Booking confirm Page
	 */
	public void clickMyItinery() {
		btnMyItinery.click();
	}
}

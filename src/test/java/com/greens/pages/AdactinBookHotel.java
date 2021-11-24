package com.greens.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdactinBookHotel {
	@FindBy(how = How.ID, using = "first_name")
	private WebElement txtFirstName;

	@FindBy(how = How.ID, using = "last_name")
	private WebElement txtLastName;
	
	@FindBy(how = How.ID, using = "address")
	private WebElement txtAddress;
	
	@FindBy(how = How.ID, using = "cc_num")
	private WebElement txtCCNumber;
	
	@FindBy(how = How.ID, using = "cc_type")
	private WebElement drpdwnCCType;
	
	@FindBy(how = How.ID, using = "cc_exp_month")
	private WebElement drpdwnExpMonth;
	
	@FindBy(how = How.ID, using = "cc_exp_year")
	private WebElement drpdwnExpYear;
	
	@FindBy(how = How.ID, using = "cc_cvv")
	private WebElement txtCVV;
	
	@FindBy(how = How.ID, using = "book_now")
	private WebElement btnBookNow;
	
	
	/**
	 * @param driver
	 * 
	 * Constructor with Page Factory to init elements in the class
	 */
	public AdactinBookHotel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUserDetails() {
		txtFirstName.sendKeys("Sowndharya");
		txtLastName.sendKeys("Lakshmi");
		txtAddress.sendKeys("Arizona");
	}
	
	public void enterPaymentDetails() {
		txtCCNumber.sendKeys("1234567812345678");
		selectFromDrpDwn("type", "VISA");
		selectFromDrpDwn("month", "10");
		selectFromDrpDwn("year", "2022");
		txtCVV.sendKeys("456");
		
	}
	public void selectFromDrpDwn(String drpdwnName, String selectOption) {
		WebElement element = null;
		switch (drpdwnName) {
		case "type":
			element = drpdwnCCType;
			break;
		case "month":
			element = drpdwnExpMonth;
			break;
		case "year":
			element = drpdwnExpYear;
			break;
		}
		Select slt = new Select(element);
		slt.selectByValue(selectOption);

	}

	public void clickBookNowButton() {
		btnBookNow.click();
	}
}

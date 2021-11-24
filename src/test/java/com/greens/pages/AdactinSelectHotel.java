package com.greens.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectHotel {
	@FindBy(how = How.ID, using = "radiobutton_2")
	private WebElement rdBtnHotel2;

	@FindBy(how = How.ID, using = "continue")
	private WebElement btnContinue;

	/**
	 * @param driver
	 * 
	 *            Constructor with Page Factory to init elements in the class
	 */
	public AdactinSelectHotel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectHotel() {
		rdBtnHotel2.click();
	}

	public void clickContinueButton() {
		btnContinue.click();
	}
}

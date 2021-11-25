package com.greens.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdactinItenary {
	/**
	 * @param driver
	 *            Constructor with Page Factory to init elements in the class
	 */
	public AdactinItenary(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
	private WebElement txtOrderNumber;

	public String getOrderNumber() {
		String ordNum = txtOrderNumber.getAttribute("value");
		return ordNum;
	}
}

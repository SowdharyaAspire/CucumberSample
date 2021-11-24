package com.greens.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdactinItenary {
	/**
	 * @param driver
	 *            Constructor with Page Factory to init elements in the class
	 */
	public AdactinItenary(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

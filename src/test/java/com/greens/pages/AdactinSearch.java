package com.greens.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdactinSearch {
	/**
	 * @param driver
	 * 
	 * Constructor with Page Factory to init elements in the class
	 */
	public AdactinSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "location")
	private WebElement drpdwnLocation;

	@FindBy(how = How.ID, using = "room_nos")
	private WebElement drpdwnRooms;

	@FindBy(how = How.ID, using = "adult_room")
	private WebElement drpdwnAdultInRoom;

	@FindBy(how = How.ID, using = "Submit")
	private WebElement btnSearch;

	public void selectFromDrpDwn(String drpdwnName, String selectOption) {
		WebElement element = null;
		switch (drpdwnName) {
		case "location":
			element = drpdwnLocation;
			break;
		case "rooms":
			element = drpdwnRooms;
			break;
		case "adult":
			element = drpdwnAdultInRoom;
			break;
		}
		Select slt = new Select(element);
		slt.selectByValue(selectOption);

	}

	public void clickSearchButton() {
		btnSearch.click();

	}
}

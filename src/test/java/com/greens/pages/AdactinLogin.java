package com.greens.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin {
	/**
	 * @param driver
	 * 
	 *            Constructor with Page Factory to init elements in the class
	 */
	public AdactinLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "username")
	public WebElement txtUserName;

	@FindBy(how = How.NAME, using = "password")
	public WebElement txtPassword;

	@FindBy(how = How.NAME, using = "login")
	public WebElement btnLogin;

	public void Login(String userName, String password) {
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(password);
	}

	public void ClickLogin() {
		btnLogin.click();
	}

}

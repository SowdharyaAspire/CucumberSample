package com.greens.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FbSteps {
	WebDriver driver;

	@Given("Launch the Chrome Browser")
	public WebDriver launch_the_Chrome_Browser() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();

		return driver;
	}

	@Given("Enter the URL of Facebook")
	public void enter_the_URL_of_Facebook() {
		String url = "https://www.facebook.com/";
		driver.get(url);
	}

	@When("Check Login Page Loaded Properly")
	public void check_Login_Page_Loaded_Properly() {
		WebElement imgFB = driver.findElement(By.xpath("//*[@alt ='Facebook']"));
		boolean valid = imgFB.isDisplayed();
		Assert.assertTrue("Page Loaded Successfully", valid);
	}

	@When("Enter the Invalid Username")
	public void enter_the_Invalid_Username() {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Test#$5");

	}

	@When("Enter the Valid Password")
	public void enter_the_Valid_Password() {
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("test@123");
	}

	@When("Click Login Button")
	public void click_Login_Button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@Then("Validate error message in User Interface")
	public void validate_error_message_in_User_Interface() {
		WebDriverWait driverWait = new WebDriverWait(driver, 5000);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Facebook – log in or sign up", title);
		WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
		Assert.assertEquals("The email address or mobile number you entered isn't connected to an account. Find your account and log in.", errorMessage.getText());
	}

}

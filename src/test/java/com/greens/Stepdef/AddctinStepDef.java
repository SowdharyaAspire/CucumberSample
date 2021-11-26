package com.greens.Stepdef;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.greens.pages.AdactinBookConfirm;
import com.greens.pages.AdactinBookHotel;
import com.greens.pages.AdactinItenary;
import com.greens.pages.AdactinLogin;
import com.greens.pages.AdactinSearch;
import com.greens.pages.AdactinSelectHotel;
import com.greens.util.DataHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AddctinStepDef {
	WebDriver driver;
	String url = "http://adactinhotelapp.com/";

	AdactinLogin adactinLogin;
	AdactinSearch adactinSearch;
	AdactinSelectHotel adactinSelectHotel;
	AdactinBookHotel adactinBookHotel;
	AdactinBookConfirm adactinBookConfirm;
	AdactinItenary adactinItenary;
	String title;
	String orderNumber;
	String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\DataProvider\\TestData.xlsx";

	Map<String, Map<String, String>> dataSet = DataHelper.readExcelDatafromFile(filepath, "data");

	@Given("User Launch the browser")
	public WebDriver user_Launch_the_browser() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	@Given("User Login with Valid Details \"(.*)\" and \"(.*)\"$")
	public void user_Login_with_Valid_Details(String username, String password) {
		adactinLogin = new AdactinLogin(driver);
		adactinLogin.Login(username, password);
	}

	@When("User Clicks the Login Button")
	public void user_Clicks_the_Login_Button() {
		adactinLogin.ClickLogin();
	}

	@Then("Validate the HomePage")
	public void validate_the_HomePage() {
		adactinSearch = new AdactinSearch(driver);
		title = driver.getTitle();
		Assert.assertEquals(title, "Adactin.com - Search Hotel");
		System.out.println("Home Page is displayed");
	}

	@Then("User Enters the details for Room")
	public void user_Enters_the_details_for_Room() {

		adactinSearch.selectFromDrpDwn("location", "Adelaide");
		adactinSearch.selectFromDrpDwn("rooms", "3");
		adactinSearch.selectFromDrpDwn("adult", "2");

	}

	@When("User clicks Search button")
	public void user_clicks_Search_button() {
		adactinSearch.clickSearchButton();
	}

	@Then("Validate the Search Hotel Page")
	public void validate_the_Search_Hotel_Page() {
		adactinSelectHotel = new AdactinSelectHotel(driver);
		title = driver.getTitle();
		Assert.assertEquals(title, "Adactin.com - Select Hotel");
		System.out.println("Select Hotel Page is Displayed");
	}

	@Then("User Selects the hotel")
	public void user_Selects_the_hotel() {
		System.out.println("Select the Hotel");
		adactinSelectHotel.selectHotel();
	}

	@When("User clicks Continue Button")
	public void user_clicks_Continue_Button() {
		adactinSelectHotel.clickContinueButton();
	}

	@Then("Validate Book Hotel Page")
	public void validate_Book_Hotel_Page() {
		adactinBookHotel = new AdactinBookHotel(driver);
		title = driver.getTitle();
		Assert.assertEquals(title, "Adactin.com - Book A Hotel");
		System.out.println("Book Hotel Page is Displayed");

	}

	@Then("User enter the userDetails and Payment Details")
	public void user_enter_the_userDetails_and_Payment_Details() {
		adactinBookHotel.enterUserDetails();
		adactinBookHotel.enterPaymentDetails();
	}

	@When("User clicks Book Now button")
	public void user_clicks_Book_Now_button() {
		adactinBookHotel.clickBookNowButton();
	}

	@Then("Validate Booking Confirmation")
	public void validate_Booking_Confirmation() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		adactinBookConfirm = new AdactinBookConfirm(driver);
		String text = adactinBookConfirm.getTitleBookingConfirm().getText();
		title = driver.getCurrentUrl();
		System.out.println(text);
		System.out.println(title);

		Assert.assertEquals(title, "http://adactinhotelapp.com/BookingConfirm.php");
		System.out.println("Booking confirmation Page is displayed");
	}

	@Then("Fetch Order Number and store in Excel")
	public void fetch_Order_Number_and_store_in_Excel() {

		WebElement txtOrderNumber = adactinBookConfirm.getTxtOrderNumber();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", txtOrderNumber);
		orderNumber = adactinBookConfirm.getOrderNumber();
		System.out.println(orderNumber);
		System.out.println("Before Update");
		DataHelper.readExcelDatafromFile(filepath, "data");
		DataHelper.updateCellValue(filepath, "data", "Order number", orderNumber);
		System.out.println("After Update");
		DataHelper.readExcelDatafromFile(filepath, "data");
		System.out.println(orderNumber);

	}

	@When("User Clicks MyItenary")
	public void user_Clicks_MyItenary() {
		adactinBookConfirm.clickMyItinery();
	}

	@Then("Validate the Booking confirmation Detials")
	public void validate_the_Booking_confirmation_Detials() {
		adactinItenary = new AdactinItenary(driver);
		title = driver.getCurrentUrl();
		Assert.assertEquals(title, "http://adactinhotelapp.com/BookedItinerary.php");
		System.out.println("Booking confirmation Page is displayed");
		Assert.assertEquals(orderNumber, adactinItenary.getOrderNumber());

	}
}
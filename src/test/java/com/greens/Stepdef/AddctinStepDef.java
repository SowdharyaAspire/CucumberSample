package com.greens.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.greens.pages.AdactinBookConfirm;
import com.greens.pages.AdactinBookHotel;
import com.greens.pages.AdactinLogin;
import com.greens.pages.AdactinSearch;
import com.greens.pages.AdactinSelectHotel;
import com.greens.util.DataHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddctinStepDef {
	WebDriver driver;
	String url = "http://adactinhotelapp.com/";
	
	AdactinLogin adactinLogin;
	AdactinSearch adactinSearch;
	AdactinSelectHotel adactinSelectHotel;
	AdactinBookHotel adactinBookHotel;
	AdactinBookConfirm adactinBookConfirm;

	@Given("User Launch the browser")
	public WebDriver user_Launch_the_browser() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	@Given("User Login with Valid Details")
	public void user_Login_with_Valid_Details() {
		adactinLogin = new AdactinLogin(driver);
		adactinLogin.Login("sowndharya97sathy", "Sownd@123");
	}

	@When("User Clicks the Login Button")
	public void user_Clicks_the_Login_Button() {
		adactinLogin.ClickLogin();
	}

	@Then("Validate the HomePage")
	public void validate_the_HomePage() {
		System.out.println("Home Page is displayed");
	}

	@Then("User Enters the details for Room")
	public void user_Enters_the_details_for_Room() {
		adactinSearch = new AdactinSearch(driver);
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
		System.out.println("SearchHotel Page is Displayed");
	}

	@Then("User Selects the hotel")
	public void user_Selects_the_hotel() {
		adactinSelectHotel = new AdactinSelectHotel(driver);
		adactinSelectHotel.selectHotel();
	}

	@When("User clicks Continue Button")
	public void user_clicks_Continue_Button() {
		adactinSelectHotel.clickContinueButton();
	}

	@Then("Validate Book Hotel Page")
	public void validate_Book_Hotel_Page() {
		System.out.println("Book Hotel Page is Displayed");
		adactinBookHotel= new AdactinBookHotel(driver);
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
		adactinBookConfirm= new AdactinBookConfirm(driver);
		System.out.println("Booking confirmation Page is displayed");
		Thread.sleep(7000);
	}

	@Then("Fetch Order Number and store in Excel")
	public void fetch_Order_Number_and_store_in_Excel() {
		adactinBookConfirm.getOrderNumber();
		String filepath =System.getProperty("user.dir")+ "\\src\\test\\resources\\DataProvider\\TestData.xlsx";
		DataHelper.readExcelDatafromFile(filepath, "data");
		DataHelper.updateCellValue(filepath, "data", "Order number", "sownd");
		adactinBookConfirm.clickMyItinery();
	}

	@When("User Clicks MyItenary")
	public void user_Clicks_MyItenary() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("Validate the Booking confirmation Detials")
	public void validate_the_Booking_confirmation_Detials() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}
}
package com.adactin.stepdefinition;

import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookedItineary;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;
import com.adactin.utility.ConfigurationReader;
import com.adactin.utility.FileReaderManager;
import com.adactin.utility.PageObjectManager;

import cucumber.api.*;
import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("   Scenario:  " + name);
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("    ScenarioStatus:  " + status);
		if (scenario.isFailed()) {
			getScreenshot(scenario.getName());
		}

	}

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		String url = FileReaderManager.getInstance().getcrInstance().getUrl();
		getUrl(url);

	}

	@When("^User enters the valid \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_in_the_username_field(String username) throws Throwable {
		// HomePage hp = new HomePage(driver);
		// inputToElement(hp.getUsername(), username);
		inputToElement(pom.getHp().getUsername(), username);
	}

	@When("^User enters the valid \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_in_the_password_field(String password) throws Throwable {
		// HomePage hp = new HomePage(driver);
		inputToElement(pom.getHp().getPassword(), password);

	}

	@When("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		// HomePage hp = new HomePage(driver);
		clickOnWebElement(pom.getHp().getLogin());
	}

	@Then("^User verifies whether the Homepage navigates to the search hotel page$")
	public void user_verifies_whether_the_Homepage_navigates_to_the_search_hotel_page() throws Throwable {
		 Assert.assertEquals("A", "a");
	}

	@When("^User enters the location in the location field$")
	public void user_enters_the_location_in_the_location_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		SelectDropDown(sh.getLocation(), "Sydney", "value");
	}

	@When("^User enters the name of hotel in hotel field$")
	public void user_enters_the_name_of_hotel_in_hotel_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		SelectDropDown(sh.getHotels(), "Hotel Sunshine", "value");

	}

	@When("^User enters the type of room in room type field$")
	public void user_enters_the_type_of_room_in_room_type_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		SelectDropDown(sh.getRoomtype(), "Deluxe", "text");
	}

	@When("^User enters the number of rooms in the number of rooms field$")
	public void user_enters_the_number_of_rooms_in_the_number_of_rooms_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		SelectDropDown(sh.getRoomnumber(), "3", "index");
	}

	@When("^User enters the date in the check In date field$")
	public void user_enters_the_date_in_the_check_In_date_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		inputToElement(sh.getCheckIn(), "09/02/2021");

	}

	@When("^User enters the date in the Check Out date field$")
	public void user_enters_the_date_in_the_Check_Out_date_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		inputToElement(sh.getCheckOut(), "11/02/2021");

	}

	@When("^User enters the number of persons in Adult per room field$")
	public void user_enters_the_number_of_persons_in_Adult_per_room_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		SelectDropDown(sh.getAdultsperroom(), "3", "index");

	}

	@When("^User enters the number of children in children per room field$")
	public void user_enters_the_number_of_children_in_children_per_room_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		SelectDropDown(sh.getChildrenperroom(), "3", "value");
	}

	@When("^User click the search button$")
	public void user_click_the_search_button() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		clickOnWebElement(sh.getSearch());
	}

	@Then("^User navigates to the select hotel page$")
	public void user_navigates_to_the_select_hotel_page() throws Throwable {
	}

	@When("^User choose the hotel according to their price expected$")
	public void user_choose_the_hotel_according_to_their_price_expected() throws Throwable {
		SelectHotel h = new SelectHotel(driver);
		clickOnWebElement(h.getSelectradiobtn());

	}

	@When("^User clicks the continue button$")
	public void user_clicks_the_continue_button() throws Throwable {
		SelectHotel h = new SelectHotel(driver);
		clickOnWebElement(h.getContinuebtn());

	}

	@Then("^User navigates to  book a hotel page$")
	public void user_navigates_to_book_a_hotel_page() throws Throwable {

	}

	@When("^User enters the first name in the first name field$")
	public void user_enters_the_first_name_in_the_first_name_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputToElement(bh.getFirstname(), "Pavithra");
	}

	@When("^User enters the last name in the last name field$")
	public void user_enters_the_last_name_in_the_last_name_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputToElement(bh.getLastname(), "Ramkumar");
	}

	@When("^User enters the billing address in the billing address field$")
	public void user_enters_the_billing_address_in_the_billing_address_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputToElement(bh.getAddress(), "3/16 F2,SAP Apartments,Pallikaranai");

	}

	@When("^User enters the credit card number in the credit card number field$")
	public void user_enters_the_credit_card_number_in_the_credit_card_number_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputToElement(bh.getCreditcardnumber(), "1346890145678902");

	}

	@When("^User enters the card type in the credit card type field$")
	public void user_enters_the_card_type_in_the_credit_card_type_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		SelectDropDown(bh.getCreditcardtype(), "VISA", "value");
	}

	@When("^User enters the month and year in the expiry date field$")
	public void user_enters_the_month_and_year_in_the_expiry_date_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		SelectDropDown(bh.getExpirymonth(), "April", "text");
		SelectDropDown(bh.getExpiryyear(), "2022", "value");
	}

	@When("^User enters the CVV number in the CVV number field$")
	public void user_enters_the_CVV_number_in_the_CVV_number_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputToElement(bh.getCvvnumber(), "567");

	}

	@When("^User can able to book by clicking book now button$")
	public void user_can_able_to_book_by_clicking_book_now_button() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		clickOnWebElement(bh.getBooknow());

	}

	@When("^After checked user clicks My Itineary button$")
	public void after_checked_user_clicks_My_Itineary_button() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		clickOnWebElement(bh.getItineary());

	}

	@Then("^User navigates to Booked Itineary page$")
	public void user_navigates_to_Booked_Itineary_page() throws Throwable {
	}

	@When("^User can select the Itineary according to their needs$")
	public void user_can_select_the_Itineary_according_to_their_needs() throws Throwable {
		BookedItineary bi = new BookedItineary(driver);
		clickOnWebElement(bi.getRadiobtn());

	}

	@When("^User clicks the logout button$")
	public void user_clicks_the_logout_button() throws Throwable {
		BookedItineary bi = new BookedItineary(driver);
		clickOnWebElement(bi.getLogout());
	}

	@Then("^User navigates to the logout page$")
	public void user_navigates_to_the_logout_page() throws Throwable {
	}

}
/*
 * driver=getBrowser("chrome"); getUrl("https://adactinhotelapp.com/index.php");
 */

/*
 * ConfigurationReader cr = new ConfigurationReader(); String url = cr.getUrl();
 * getUrl(url);
 */

/*
 * @When("^User enters the valid username in the username field$") public void
 * user_enters_the_valid_username_in_the_username_field() throws Throwable {
 * HomePage hp = new HomePage(driver); inputToElement(hp.getUsername(),
 * "pavisweety"); }
 * 
 * @When("^User enters the valid password in the password field$") public void
 * user_enters_the_valid_password_in_the_password_field() throws Throwable {
 * HomePage hp = new HomePage(driver); inputToElement(hp.getPassword(),
 * "Pavi_1@sweety"); };
 */

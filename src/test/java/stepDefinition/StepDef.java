package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	//Hooks
	@Before
	public void browser_launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta\\Desktop\\QA\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qatarairways.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	//Background
	@Given("I close cookie warning window")
	public void i_close_cookie_warning_window() {
		System.out.println("Cookie window closed"); 
	}

	@When("I give number of passengers")
	public void i_give_number_of_passengers() {
		System.out.println("No. of passenger = 3");
	}
	
	@When("I click on {string} button")
	public void i_click_on_button(String string) {
		System.out.println("Search button clicked");
	}
	
	//Scenario valid
	@When("^I input (.*) city in the From textbox$")
	public void i_input_departure_city_in_the_textbox(String string1) {
		System.out.println(string1);  
	}

	@When("^I input (.*) city in the To textbox$")
	public void i_input_destination_city_in_the_textbox(String string2) {
		System.out.println(string2);
	}

	@Then("I check for the search result page for valid results")
	public void i_check_for_the_search_result_page_for_valid_results() {
		System.out.println("Search result found");
	}
	
	//Scenario invalid
	@When("I input wrong departure city in the {string} textbox")
	public void i_input_wrong_departure_city_in_the_textbox(String string) {
		System.out.println("Departure city = ABC");  
	}

	@When("I input wrong destination city in the {string} textbox")
	public void i_input_wrong_destination_city_in_the_textbox(String string) {
		System.out.println("Destination city = DEF");
	}
	
	@Then("I check for the search result page for invalid results")
	public void i_check_for_the_search_result_page_for_invalid_results() {
		System.out.println("Search result not found");
	}

}

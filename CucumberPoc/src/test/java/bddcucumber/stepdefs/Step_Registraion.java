package bddcucumber.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bddcucumber.manager.WebdriverSingleton;

import bddcucumber.po.Po_Registraton;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Registraion {

	WebdriverSingleton browserManager = WebdriverSingleton.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	Po_Registraton  po_Registraton=PageFactory.initElements(driver, Po_Registraton.class);
	Scenario scn ;

	@Then("I click on My account ")
	public void i_click_on_My_account() {
		po_Registraton.myaccount();
	}

	@Then("I click on signout")
	public void i_click_on_signout() {
		po_Registraton.signout();
	}
	
	@Then("I click on My account{int}")
	public void i_click_on_My_account(Integer int1) {
		po_Registraton.myaccount1();
	}


	@When("I click on Registration link at top of right")
	public void i_click_on_Registration_link_at_top_of_right() {
		po_Registraton.Click_on_registration();
	}

	@Then("I enter first name")
	public void i_enter_first_name() {
		po_Registraton.FirstName("chintan");
	}

	@Then("I enter last name")
	public void i_enter_last_name() {
		po_Registraton.LastName("pachchigar");
	}

	@Then("I enter phone")
	public void i_enter_phone() {
		po_Registraton.Phone("12345678901");
	}

	@Then("I enter email")
	public void i_enter_email() {
		po_Registraton.EmailId("pachchigarchintan@gmail.com");
	}

	@Then("I enter password")
	public void i_enter_password() {
		po_Registraton.password("1234567890");
	}

	@Then("I enter confirm password")
	public void i_enter_confirm_password() {
		po_Registraton.ConfirmPassword("1234567890");
	}

	@Then("I enter birthday")
	public void i_enter_birthday() {
		po_Registraton.birthdate();
		po_Registraton.months();
		po_Registraton.years();
		po_Registraton.dates();

	}
	
	@Then("I check the checkbox")
	public void i_check_the_checkbox() {
		po_Registraton.click_on_check_box();
	}


	@Then("I click on Registration button")
	public void i_click_on_Registration_button() {
		po_Registraton.click_on_register_button();
	}




}

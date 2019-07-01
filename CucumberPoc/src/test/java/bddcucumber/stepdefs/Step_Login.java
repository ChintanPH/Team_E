package bddcucumber.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bddcucumber.manager.WebdriverSingleton;

import bddcucumber.po.Po_Login;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Login {

	WebdriverSingleton browserManager = WebdriverSingleton.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	Po_Login pologin=PageFactory.initElements(driver,Po_Login.class);
	Scenario scn ;

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}


	@Given("As a user when I launch application in {string}")
	public void as_a_user_when_I_launch_application_in(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			browserManager= WebdriverSingleton.getInstanceOfWebDriverManager();
			driver = browserManager.getDriver();
			scn.write("Chrome Driver Invoked");
		}else if (browser.equalsIgnoreCase("firefox")) {

		}
	}

	@Given("navigate to url as {string}")
	public void navigate_to_url_as(String url) {
		driver.get(url);
	}

	@When("I click on My account")
	public void i_click_on_My_account() {
		pologin.MyAccount();
	}

	@When("click on Sign in button")
	public void click_on_Sign_in_button() {
		pologin.Signin();
	}


	@Then("sign in pop up is displayed")
	public void sign_in_pop_up_is_displayed() {

	}

	@Then("username and password already entered")
	public void username_and_password_already_entered() {
		pologin.EmailId("customer@example.com");
		pologin.Password("customer");
	}

	@When("I click on sign in button")
	public void i_click_on_sign_in_button() {
		pologin.signin();
	}

	@Then("I am logged in to the application")
	public void i_am_logged_in_to_the_application() {

	}
	



}



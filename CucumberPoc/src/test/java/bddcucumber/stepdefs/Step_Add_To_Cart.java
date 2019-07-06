package bddcucumber.stepdefs;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import bddcucumber.manager.WebdriverSingleton;
import bddcucumber.po.Po_AddToCart;
import bddcucumber.po.Po_Login;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Add_To_Cart {

	WebdriverSingleton browserManager = WebdriverSingleton.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();

	Po_AddToCart po_AddToCart=PageFactory.initElements(driver,Po_AddToCart.class);

	Scenario scn ;

	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}

	@When("I enter {string} in top search box")
	public void i_enter_in_top_search_box(String product) {
		po_AddToCart.SearchBox(product);
	}

	@When("click on search submit button")
	public void click_on_search_submit_button() {
		po_AddToCart.SarchButton();
	}


	@Then("product results are displayed")
	public void product_results_are_displayed() {

	}

	@When("I click on list view button")
	public void i_click_on_list_view_button() {
		po_AddToCart.List_Btn();
	}

	@Then("products are displayed in list view")
	public void products_are_displayed_in_list_view() {

	}

	@When("I click add to cart for product code H{int}E{int}OE{int}")
	public void i_click_add_to_cart_for_product_code_H_E_OE(Integer int1, Integer int2, Integer int3) {
		po_AddToCart.Add_To_Cart();
	}

	@Then("my cart is updated with product quantity as {int} and correct total price")
	public void my_cart_is_updated_with_product_quantity_as_and_correct_total_price(Integer int1) {
		try {
			  Thread.sleep(2000);
			po_AddToCart.Add_To_My_Cart();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Then("close the browser")
	public void close_the_browser() {

	}
}

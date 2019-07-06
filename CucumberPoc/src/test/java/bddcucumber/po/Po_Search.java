package bddcucumber.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Po_Search {

	WebDriver driver;

	public Po_Search(WebDriver d) {
		driver = d;
	}

	@FindBy(how = How.ID,using = "search_input")
	WebElement search_products;

	@FindBy(how = How.ID,using = "search_input")
	WebElement click_on_search_btn;

	public void search(String arg)
	{
		search_products.sendKeys(arg);
	}
	
	public void search_btn()
	{
		search_products.click();
	}
}


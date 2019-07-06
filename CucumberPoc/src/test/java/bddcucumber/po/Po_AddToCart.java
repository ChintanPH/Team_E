package bddcucumber.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Po_AddToCart {
	
	WebDriver driver;
	
	public Po_AddToCart(WebDriver d)
	{
		driver=d;
	}

	@FindBy(how = How.ID,using = "search_input")
	WebElement Enter_Search_Box;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"tygh_main_container\"]/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/button/i")
	WebElement Click_On_Search_Btn;

	@FindBy(how = How.XPATH,using = "//a[@data-ca-target-id='pagination_contents']//i[@class='ty-icon-short-list']")
	WebElement Click_On_List_btn;

	@FindBy(how = How.ID,using = "button_cart_217")
	WebElement Click_Add_To_Cart;
	
	 @FindBy(how=How.XPATH,using="//*[@id=\"sw_dropdown_8\"]/a/i")
		WebElement Click_On_My_Cart;
	
	public void SearchBox(String p)
	{
		Enter_Search_Box.sendKeys(p);
	}
	
	public void SarchButton()
	{
		Click_On_Search_Btn.click();
	}
	
	public void List_Btn()
	{
		Click_On_List_btn.click();
	}
	
	public void Add_To_Cart()
	{
		Click_Add_To_Cart.click();
	}
	
	public void Add_To_My_Cart()
	{
		Click_On_My_Cart.click();
	}
}

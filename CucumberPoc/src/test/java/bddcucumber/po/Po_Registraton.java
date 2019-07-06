package bddcucumber.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Po_Registraton {

	WebDriver driver;

	public void Po_Registraton(WebDriver d)
	{
		this.driver=d;
	}

	@FindBy(how = How.LINK_TEXT,using = "My Account")
	WebElement Click_on_MyAccount;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"account_info_4\"]/div[2]/a")
	WebElement Click_on_signout;
	
	@FindBy(how = How.LINK_TEXT,using = "My Account")
	WebElement Click_on_MyAccount1;
	
	@FindBy(how=How.XPATH,using=" //a[@class='ty-btn ty-btn__primary']")
	WebElement Click_on_registration_link;
	
	@FindBy(how=How.NAME,using="user_data[firstname]")
	WebElement Enter_firstname;
	
	@FindBy(how=How.NAME,using="user_data[lastname]")
	WebElement Enter_lastname;

	@FindBy(how=How.NAME,using="user_data[phone]")
	WebElement Enter_phone;
	
	@FindBy(how=How.ID,using="email")
	WebElement Enter_emaiId;

	@FindBy(how=How.ID,using="password1")
	WebElement Enter_password;

	@FindBy(how=How.ID,using="password2")
	WebElement Enter_confirm_password;

	@FindBy(how=How.ID,using="birthday")
	WebElement Enter_birthdate;

	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
	WebElement Enter_month;

	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
	WebElement Enter_year;

	@FindBy(how=How.XPATH,using="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[1]/a")
	WebElement Enter_date;

	@FindBy(how=How.NAME,using="mailing_lists[]")
	WebElement click_on_check;
	
	@FindBy(how=How.XPATH,using="//button[@class='ty-btn__secondary ty-btn' and @name='dispatch[profiles.update]']")
	WebElement click_on_register;

	public void myaccount() 
	{
		Click_on_MyAccount.click();
	}
	
	public void signout() 
	{
		Click_on_signout.click();
	}
	
	public void myaccount1() 
	{
		Click_on_MyAccount1.click();
	}
	
	public void Click_on_registration() 
	{
		Click_on_registration_link.click();
	}
	
	public void FirstName(String firstname) 
	{
		Enter_firstname.sendKeys(firstname);
	}
	
	public void LastName(String lastname) 
	{
		Enter_lastname.sendKeys(lastname);
	}
	
	public void Phone(String phone) 
	{
		Enter_phone.sendKeys(phone);
	}

	public void EmailId(String arg) 
	{
		Enter_emaiId.sendKeys(arg);
	}

	public void password(String arg) 
	{
		Enter_password.sendKeys(arg);
	}

	public void ConfirmPassword(String arg) 
	{
		Enter_confirm_password.sendKeys(arg);
	}

	public void birthdate() 
	{
		Enter_birthdate.click();
	}

	public void months() 
	{
		Select mon=new Select(Enter_month);
		mon.selectByVisibleText("Apr");
		Enter_month.click();
	}

	public void years() 
	{
		Select yer=new Select(Enter_year);
		yer.selectByVisibleText("1995");
		Enter_year.click();
	}
	public void dates() 
	{
		Enter_date.click();
	}

	public void click_on_check_box() 
	{
		click_on_check.click();
	}
	
	public void click_on_register_button() 
	{
		click_on_register.click();
	}
}

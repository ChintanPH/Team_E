package bddcucumber.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Po_Login {

	WebDriver driver;

	public void Po_Login(WebDriver d)
	{
		this.driver=d;
	}

	@FindBy(how = How.LINK_TEXT,using = "My Account")
	WebElement Click_on_MyAccount;

	@FindBy(how = How.LINK_TEXT,using = "Sign in")
	WebElement Click_on_SignIn;

	@FindBy(how = How.ID,using = "login_main_login")
	WebElement Enter_EmailId;

	@FindBy(how = How.ID,using = "psw_main_login")
	WebElement Enter_Passoword;

	@FindBy(how = How.XPATH,using = "//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[1]/div/div/div/form/div[3]/div[1]/button")
	WebElement Click_on_Sign;

	@FindBy(how = How.LINK_TEXT,using = "My Account")
	WebElement Click_on_MyAccounts;


	public void MyAccount() 
	{
		Click_on_MyAccount.click();	
	}

	public void Signin() 
	{
		Click_on_SignIn.click();	
	}

	public void EmailId(String emaild) 
	{
		Enter_EmailId.clear();
		Enter_EmailId.sendKeys(emaild);

	}

	public void Password(String password) 
	{
		Enter_Passoword.clear();
		Enter_Passoword.sendKeys(password);
	}

	public void signin() 
	{
		Click_on_Sign.click();
	}



}

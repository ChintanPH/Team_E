package bddcucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"D:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\eclipse\\CucumberPoc\\src\\test\\resources\\features\\eCommerce"},
		glue= {"bddcucumber/stepdefs"},
		tags= {"@cs_cart_AddToCart"}
		)


public class TestRunner {

}

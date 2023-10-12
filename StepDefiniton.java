package cucumbersclassnote;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefiniton extends TestBase {
	
	LogonWebElements lw ;

	@Given("^User tries to launch the browser with the url$")
	public void user_tries_to_launch_the_browser_with_the_url()   {
		
		TestBase.intilize();
		TestBase.geturl();

	}

	@When("^USer tries to login$")
	public void user_tries_to_login() {
		lw = new LogonWebElements();
		lw.validcredentails();

	}

	@Then("^Login should be successfull$")
	public void login_should_be_successfull()  {
		
		LogonWebElements.checkingstatus();

		
	}

	@And("^Browser need to closed$")
	public void browser_need_to_closed()  {
		
		TestBase.close();

	}



}

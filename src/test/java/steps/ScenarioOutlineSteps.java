package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is on Application landing page")
	public void user_is_on_application_landing_page() {
	  System.out.println("Given statement ");
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
		System.out.println("When statement for signin button");
	}

	@Then("user should see the login page")
	public void user_should_see_the_login_page() {
		System.out.println("Then statement for seeing the login page");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		System.out.println("When statement enter username as "+string);
	}

	@When("user enters  password as {string}")
	public void user_enters_password_as(String string) {
		System.out.println("When statement enter password as "+string);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		System.out.println("When statement for click on login button");
	}

	@Then("user should get error messsage")
	public void user_should_get_error_messsage() {
		System.out.println("Then statement for error message");
	}

}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
//	ctrl + shift + o
	
	@Given("user should be at login screen of application")
	public void user_should_be_at_login_screen_of_application() {
	  System.out.println("Given for BG");  
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String username) {
		 System.out.println("When for BG");
		 System.out.println("Argument value is : "+username);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	   System.out.println("When for BG for pwd");
	   System.out.println("The argument is "+string);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    System.out.println("When for BG for login button");
	}

	@When("user click on previous order")
	public void user_click_on_previous_order() {
		System.out.println("When for previous order");
	}

	@Then("user should see the previous order information")
	public void user_should_see_the_previous_order_information() {
		System.out.println("then for previous order");
	}

	@When("user click on placed order")
	public void user_click_on_placed_order() {
		System.out.println("When for current order");
	}

	@Then("user should see the placed order information")
	public void user_should_see_the_placed_order_information() {
		System.out.println("then for current order");
	}

	@When("user click on cancelled order")
	public void user_click_on_cancelled_order() {
		System.out.println("When for cancelled order");
	}

	@Then("user should see the cancelled order information")
	public void user_should_see_the_cancelled_order_information() {
		System.out.println("then for cancelled order");
	}

}

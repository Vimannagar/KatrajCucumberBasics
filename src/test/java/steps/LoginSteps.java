package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
@Given("user is at the login screen")
public void prerequisiteForLogin()
{
	System.out.println("Given statement");
}	
	

@When("user enters the username")
public void user_enters_the_username() {
	System.out.println("When statement for username");
}

@When("user enters the password")
public void user_enters_the_password() {
	System.out.println("When statement for password");
}

@When("user click on login button")
public void user_click_on_login_button() {
	System.out.println("When statement for login button");
}

@Then("usee should get logged in")
public void usee_should_get_logged_in() {
	System.out.println("then statement for user logged inside the system");
}


}

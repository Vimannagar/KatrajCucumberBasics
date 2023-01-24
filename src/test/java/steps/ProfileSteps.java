package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	
	@Given("User should available at profile page")
	public void user_should_available_at_profile_page() {
	 System.out.println("given for profile page");
	}

	@When("User click on add button")
	public void user_click_on_add_button() {
	 
		System.out.println("when for add button");
	}

	@Then("user should be able to add the information")
	public void user_should_be_able_to_add_the_information() {
		System.out.println("then for add information");
	}

	@When("User click on edit button")
	public void user_click_on_edit_button() {
		System.out.println("when for edit button");
	}

	@Then("user should be able to edit the information")
	public void user_should_be_able_to_edit_the_information() {
		System.out.println("then for edit information");
	}

	@When("User click on delete button")
	public void user_click_on_delete_button() {
		System.out.println("when for delete button");
	}

	@Then("user should be able to delete the information")
	public void user_should_be_able_to_delete_the_information() {
		System.out.println("then for delete information");
	}

}

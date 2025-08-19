package Login_Step_Def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("Users navigate to the login page")
	public void users_navigate_to_the_login_page() {
	   System.out.println("Users navigate to the login page");
	}

	@When("Users enters valid email address {string}")
	public void users_enters_valid_email_address(String emailAddressText) {
		System.out.println("Users enters valid email address"+emailAddressText);
	}

	@And("Enter valid password {string}")
	public void enter_valid_password(String passwordText) {
		System.out.println("Users Enter valid password"+passwordText);
	}

	@When("Clicks on the login button")
	public void clicks_on_the_login_button() {
		System.out.println("Users should click on the login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println("Users should login successfully");
	}

	@When("Users enters invalid email address {string}")
	public void users_enters_invalid_email_address(String invalidEmailAddress) {
		System.out.println("Users enters invalid email address"+invalidEmailAddress);
	}

	@When("Enter invalid password {string}")
	public void enter_invalid_password(String invalidPassword) {
		System.out.println("Users Enter invalid password"+invalidPassword);
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		System.out.println("User should get a proper warning message");
	}

	@When("user dont enter any credential")
	public void user_dont_enter_any_credential() {
	   
	}

	@When("Click on login button")
	public void click_on_login_button() {
	   
	}

}

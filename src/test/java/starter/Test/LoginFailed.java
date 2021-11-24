package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginFailedSteps;

public class LoginFailed {
    @Steps
    LoginFailedSteps loginfailedsteps;
    @Given("I open demoqa login page for the second time")
    public void i_open_demoqa_login_page_for_the_second_time() {
        loginfailedsteps.openHomePage();
        loginfailedsteps.openLoginPage();
    }

    @When("I input valid username and invalid password")
    public void i_input_valid_username_and_invalid_password() {
        loginfailedsteps.inputValidUsernamePassword();
    }

    @Then("I am failed to login because invalid password")
    public void i_am_failed_to_login_because_invalid_password() {
        loginfailedsteps.enterProfile();
    }
}

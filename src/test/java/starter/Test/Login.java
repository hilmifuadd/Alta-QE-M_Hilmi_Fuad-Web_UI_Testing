package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class Login {
    @Steps
    LoginSteps loginSteps;

    @Given("I open demoqa login page")
    public void i_open_demoqa_login_page() {
        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I input valid username and password")
    public void i_input_valid_username_and_password() {
        loginSteps.inputValidUsernamePassword();
    }

    @Then("I can see my profile")
    public void i_can_see_my_profile() {
        loginSteps.enterProfile();
    }
}

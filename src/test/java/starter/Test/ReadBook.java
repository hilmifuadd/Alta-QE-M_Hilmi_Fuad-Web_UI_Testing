package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.ReadBookSteps;

public class ReadBook {
    @Steps
    ReadBookSteps readBookSteps;
    @Given("I open login bookstore")
    public void i_open_login_bookstore() {
        readBookSteps.openHomePage();
        readBookSteps.openLoginPage();
    }

    @When("I input valid username and password to read book")
    public void i_input_valid_username_and_password_to_read_book() {
        readBookSteps.inputValidUsernamePassword();
    }

    @When("I go to profile status book")
    public void i_go_to_profile_status_book() {
        readBookSteps.enterProfile();
    }

    @Then("I click go to bookstore")
    public void i_click_go_to_bookstore() {
        readBookSteps.enterBook();
    }

    @Then("I click the book i want to see")
    public void i_click_the_book_i_want_to_see() {
        readBookSteps.validasiReadBook();
    }

}

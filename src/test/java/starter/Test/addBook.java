package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.AddBookSteps;

public class addBook {
    @Steps
    AddBookSteps addBookSteps;
    @Given("I open login page")
    public void i_open_login_page(){
        addBookSteps.openHomePage();
        addBookSteps.openLoginPage();
    }

    @When("I input valid username and password to add book")
    public void i_input_valid_username_and_password_to_add_book() {
        addBookSteps.inputValidUsernamePassword();
    }

    @When("I go to profile")
    public void i_go_to_profile() {
        addBookSteps.enterProfile();
    }

    @When("I go to bookstore and choose the book")
    public void i_go_to_bookstore_and_choose_the_book() {
        addBookSteps.enterBook();
    }

    @Then("I click to my collection")
    public void i_click_to_my_collection() {
        addBookSteps.addBookCollection();
    }

    @Then("The book successfully added")
    public void the_book_successfully_added() {
        addBookSteps.cekBook();
    }
}

package starter.Steps;

import starter.Pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage;

    public void openHomePage(){
        loginPage.open();
    }
    public void openLoginPage(){
        loginPage.clickIconBookStore();
        loginPage.clickButtonLogin();
    }
    public void inputValidUsernamePassword(){
        loginPage.inputUsernamePassowrd();
        loginPage.clickBtnLogin();
    }
    public void enterProfile(){
        loginPage.validasiUsername();
    }
}

package starter.Steps;

import starter.Pages.LoginFailedPage;

public class LoginFailedSteps{
    LoginFailedPage loginfailed;
    public void openHomePage(){
        loginfailed.open();
    }
    public void openLoginPage(){
        loginfailed.clickIconBookStore();
        loginfailed.clickButtonLogin();
    }
    public void inputValidUsernamePassword(){
        loginfailed.inputUsernamePassowrd();
        loginfailed.clickBtnLogin();
    }
    public void enterProfile(){
        loginfailed.validasiInvalidPassword();
    }
}

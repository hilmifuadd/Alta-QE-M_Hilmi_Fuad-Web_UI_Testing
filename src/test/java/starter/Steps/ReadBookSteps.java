package starter.Steps;

import starter.Pages.ReadBookPage;

public class ReadBookSteps {
    ReadBookPage readBookPage;
    public void openHomePage(){
        readBookPage.open();
    }
    public void openLoginPage(){
        readBookPage.clickIconBookStore();
        readBookPage.clickButtonLogin();
    }
    public void inputValidUsernamePassword(){
        readBookPage.inputUsernamePassowrd();
        readBookPage.clickBtnLogin();
    }
    public void enterProfile(){
        readBookPage.validasiUsername();
    }
    public void enterBook(){
//        readBookPage.clickButtonStore();
        readBookPage.clickSeeBook();
    }
    public void validasiReadBook(){
        readBookPage.validasiBookSuccess();
    }
}

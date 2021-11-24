package starter.Steps;

import starter.Pages.addBookPage;

public class AddBookSteps {
    addBookPage addBookPage;
    public void openHomePage(){
        addBookPage.open();
    }
    public void openLoginPage(){
        addBookPage.clickIconBookStore();
        addBookPage.clickButtonLogin();
    }
    public void inputValidUsernamePassword(){
        addBookPage.inputUsernamePassowrd();
        addBookPage.clickBtnLogin();
    }
    public void enterProfile(){
        addBookPage.validasiUsername();
    }
    public void enterBook(){
//        addBookPage.clickButtonStore();
        addBookPage.clickSeeBook();
    }
    public void addBookCollection(){
        addBookPage.AddBookValidate();
    }
    public void cekBook(){
        addBookPage.clickCekBook();
        addBookPage.validasiBookSuccess();
    }
}

package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginFailedPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div")
    WebElement iconBookStore;

    public void clickIconBookStore(){
        iconBookStore.click();
    }

    @FindBy(id = "login")
    WebElement buttonLogin;

    public void clickButtonLogin(){
        buttonLogin.click();
    }

    @FindBy(id = "userName")
    WebElement inputUserName;

    @FindBy(id = "password")
    WebElement inputPassword;

    @FindBy(id = "login")
    WebElement btnLogin;

    public void inputUsernamePassowrd(){
        inputUserName.sendKeys("hilmifuad239");
        inputPassword.sendKeys("Kembalisuci921*");
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }
    @FindBy(id = "name")
    WebElement cekLogin;

    public void validasiInvalidPassword(){
        Assert.assertEquals("Invalid username or password!",cekLogin.getText());
    }
}

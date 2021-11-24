package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div")
    WebElement iconBookStore;

    public void clickIconBookStore(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(iconBookStore));
        iconBookStore.click();
    }

    @FindBy(id = "login")
    WebElement buttonLogin;

    public void clickButtonLogin(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(buttonLogin));
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
        inputPassword.sendKeys("Kembalisuci97@");
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }
    @FindBy(id = "userName-value")
    WebElement cekUsername;

    public void validasiUsername(){
        Assert.assertEquals("hilmifuad239",cekUsername.getText());
    }
}

package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadBookPage extends PageObject {
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
    @FindBy(id = "gotoStore")
    WebElement buttonStore;

//    public void clickButtonStore(){
//        buttonStore.click();
//    }
    @FindBy(id = "see-book-Git Pocket Guide")
    WebElement seeBookGitPocket;
    @FindBy(id = "see-book-Learning JavaScript Design Patterns")
    WebElement seeBookLearning;
    @FindBy(id = "see-book-Designing Evolvable Web APIs with ASP.NET")
    WebElement seeBookDesigning;
    @FindBy(id = "see-book-Speaking JavaScript")
    WebElement seeBookSpeaking;
    @FindBy(id = "see-book-You Don't Know JS")
    WebElement seeBookJS;
    @FindBy(id = "see-book-Programming JavaScript Applications")
    WebElement seeBookProgramming;
    @FindBy(id = "see-book-Eloquent JavaScript, Second Edition")
    WebElement seeBookEloquent;
    @FindBy(id = "see-book-Understanding ECMAScript 6")
    WebElement seeBookUnderstanding;
    public void clickSeeBook(){
        seeBookGitPocket.click();
    }
    @FindBy(xpath = "//div[@id='title-wrapper']//label[@id='userName-value']")
    WebElement validasiBook;

    public void validasiBookSuccess(){
        Assert.assertEquals("Git Pocket Guide",validasiBook.getText());
    }
}

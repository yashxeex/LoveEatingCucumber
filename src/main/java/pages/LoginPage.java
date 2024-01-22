package pages;

import base.BaseTest;
import base.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="signInBtn")
    WebElement signInButton;

    Utilities core=null;

    public LoginPage() {
        core=new Utilities(driver);
        PageFactory.initElements(driver,this);
    }

    public void openURL(String url) {
        driver.get(url);
    }

    public void enterUsername(String userID) {
        username.sendKeys(userID);
    }
    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }
    public void clickOnSignIn() throws InterruptedException {
        signInButton.click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    By username = By.id("username");
    By password = By.id("password");
    By signInButton = By.id("signInBtn");

    public void openURL(String url) {
        driver.get(url);
    }

    public void enterUsername(String userID) {
        driver.findElement(username).sendKeys(userID);
    }
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
    public void clickOnSignIn() throws InterruptedException {
        driver.findElement(signInButton).click();
        Thread.sleep(10000);
    }
}

package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class StepDef {
    LoginPage loginPage;
    HomePage homePage;


    @Given("User is on Rahul Shetty Login Page")
    public void user_is_on_rahul_shetty_login_page() {
         loginPage=new LoginPage();
         loginPage.openURL("https://rahulshettyacademy.com/loginpagePractise/");
    }

    @Given("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage=new LoginPage();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
    @When("User clicks on Sign In Button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        loginPage=new LoginPage();
        loginPage.clickOnSignIn();
    }
    @Then("User is able to click on Checkout Button")
    public void userIsSuccessfullyLoggedIn() {
        homePage=new HomePage();
        homePage.clickOnCategoryOne();
    }
}

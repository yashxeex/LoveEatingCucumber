package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BeyoungPage;

public class BeyoungStepDef {

    BeyoungPage beyoungPage;

    @Given("User is on Beyoung website")
    public void userIsOnBeyoungWebsite() {
        beyoungPage=new BeyoungPage();
        beyoungPage.openURL("https://www.beyoung.in/");
    }

    @When("User selects {} and {}")
    public void userSelectsAnd(String majorOptions, String subOptions) throws InterruptedException {
        beyoungPage=new BeyoungPage();
        beyoungPage.chooseOptionsCatalog(majorOptions,subOptions);
    }
}

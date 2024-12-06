package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CareersPage;

public class jobApplications {

    CareersPage careersPage;

    @Given("Go to {} careers website")
    public void goToCareersWebsite(String company) throws InterruptedException {
        careersPage=new CareersPage();
        careersPage.goToCompanyWebsite(company);

    }
    @When("On careers page, search with {} and {}")
    public void onCareersPageSearchWithAnd(String location, String keyword) throws InterruptedException {
        careersPage=new CareersPage();
        careersPage.searchFilter(location,keyword);
    }
    @Then("Filter result and send email to myself with screenshots")
    public void filter_result_and_send_email_to_myself_with_screenshots() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

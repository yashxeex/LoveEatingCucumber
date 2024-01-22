package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import base.BaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BaseTest {
    BaseTest test = new BaseTest();

    @Before
    public void beforeScenario(){
        test.init();
    }

    @After
    public void afterScenario(){
        System.out.println("Quit Driver");
        driver.quit();
    }
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        final byte[] screenShot = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenShot, "image/png", scenario.getName());
    }
}

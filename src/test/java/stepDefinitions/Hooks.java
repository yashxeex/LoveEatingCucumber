package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import base.BaseTest;

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
}

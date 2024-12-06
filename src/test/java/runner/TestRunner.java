package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
                 glue = {"stepDefinitions"},
//               plugin = {"pretty", "html:target/cucumber-reports/cucumber-reports.html"},
                 plugin =  {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = false,
                 publish = true,
                 tags = "@Test2")

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
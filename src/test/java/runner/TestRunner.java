package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
                 glue = {"stepDefinitions"},
                 plugin = {"pretty", "html:target/cucumber-reports/cucumber-reports.html"},
                 monochrome = false,
                 publish = true,
                 tags = "@Test1")

public class TestRunner extends AbstractTestNGCucumberTests {

}
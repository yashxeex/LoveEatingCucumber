package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utilities extends BaseTest {
    public Utilities(WebDriver driver) {
        this.driver=driver;
    }

    public WebDriverWait setExplicitWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void waitForElementVisibility(WebElement element) {
        setExplicitWait().until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementInvisibility(WebElement element) {
        setExplicitWait().until(ExpectedConditions.invisibilityOf(element));
    }
}

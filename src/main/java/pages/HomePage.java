package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    By headText = By.xpath("//a[text()='ProtoCommerce']");
    By categoryOne = By.xpath("//a[contains(text(),'Category 1')]");

    public String getHomePageTitle() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(headText).getText();
    }
    public void clickOnCategoryOne() {
        driver.findElement(categoryOne).click();
    }

}

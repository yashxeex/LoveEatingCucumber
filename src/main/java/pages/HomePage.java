package pages;

import base.BaseTest;
import base.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
    @FindBy(xpath = "//a[text()='ProtoCommerce']")
    WebElement headText;

    @FindBy(xpath = "//a[contains(text(),'Category 1')]")
    WebElement categoryOne;

    Utilities core=null;

    public HomePage() {
        core=new Utilities(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnCategoryOne() {
        core.waitForElementVisibility(headText);
        core.waitForElementVisibility(categoryOne);
        categoryOne.click();
    }

}

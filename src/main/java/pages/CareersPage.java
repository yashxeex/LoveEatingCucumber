package pages;

import base.BaseTest;
import base.Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends BaseTest {

    @FindBy(css="span#locat")
    WebElement bofALocation;

    @FindBy(css="input#location-selector")
    WebElement bofALocationInputBox;

    @FindBy(xpath = "//input[contains(@placeholder,'Keyword')]")
    WebElement bofAKeyword;

    @FindBy(css="button#keywordInput")
    WebElement bofAKeywordSearch;

    @FindBy(css="img.loader.active")
    WebElement bofALoader;

    public static String companyNameGlobal="";

    Utilities core=null;

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public CareersPage() {
        core=new Utilities(driver);
        PageFactory.initElements(driver,this);
    }

    public void goToCompanyWebsite(String companyName) throws InterruptedException {
        companyNameGlobal=companyName;
        switch (companyName) {
            case "bankOfAmerica":
                driver.get("https://careers.bankofamerica.com/en-us/job-search/india");
                driver.manage().window().maximize();
                Thread.sleep(5000);
                core.waitForElementInvisibility(bofALoader);
                break;
        }

    }
    public void searchFilter(String location, String keyword) throws InterruptedException {
        switch (companyNameGlobal) {
            case "bankOfAmerica":
                searchFilterForBofA(location,keyword);
                break;
        }

    }

    public void searchFilterForBofA(String location, String keyword) throws InterruptedException {
/*        core.waitForElementVisibility(bofALocation);
        bofALocation.click();
        core.waitForElementVisibility(bofALocationInputBox);
        bofALocationInputBox.sendKeys(location);
        Thread.sleep(2000);
        core.waitForElementInvisibility(bofALoader);
        new Actions(driver).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();*/

/*        core.waitForElementVisibility(bofALocation);
        WebElement locationDOM= (WebElement) js.executeScript("return document.querySelector(\"#locat\");");
        js.executeScript("arguments[0].click();",locationDOM);
        Thread.sleep(3000);
        core.waitForElementVisibility(bofALocationInputBox);
        bofALocationInputBox.sendKeys(location);*/


        core.waitForElementVisibility(bofAKeyword);
        bofAKeyword.sendKeys(keyword);
        Thread.sleep(2000);
        new Actions(driver).sendKeys(Keys.RETURN).build().perform();
        Thread.sleep(10000);
    }
}

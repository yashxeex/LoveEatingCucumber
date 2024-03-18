package pages;

import base.BaseTest;
import base.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BeyoungPage extends BaseTest {

    @FindBy(css = "div.header")
    WebElement headerSection;

    @FindBy(css="h1.heading")
    WebElement nextPageHeader;

    Utilities core=null;
   public BeyoungPage() {
        core=new Utilities(driver);
        PageFactory.initElements(driver,this);
    }
    public void openURL(String url) {
        driver.get(url);
    }

    public void chooseOptionsCatalog(String majorOp, String subOp) throws InterruptedException {
        core.waitForElementVisibility(headerSection);
        WebElement majorOptionElement=driver.findElement(By.xpath("//a[text()='"+majorOp+"']"));
        new Actions(driver).moveToElement(majorOptionElement).perform();
        System.out.println("Selected: " + majorOp);
        Thread.sleep(3000);
        List<WebElement> subOptionElement=driver.findElements(By.xpath("//a[text()='"+subOp+"']"));
        new Actions(driver).moveToElement(subOptionElement.get(0)).click().build().perform();
        System.out.println("Selected: " + subOp);
        core.waitForElementVisibility(nextPageHeader);
        System.out.println(nextPageHeader.getText());
    }

}

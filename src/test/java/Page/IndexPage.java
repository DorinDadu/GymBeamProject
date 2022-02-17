package Page;

import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "header-links-component")
    public WebElement skipLoginElement;

    public void clickSkipLogin(){
        elementMethods.clickElement(skipLoginElement);
    }
}

package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{


    public IndexPage(WebDriver driver) {super(driver);}


    @FindBy(id = "header-links-component")
    private WebElement skipLoginElement;

    public void clickSkipLogin(){
        elementMethods.clickElement(skipLoginElement);
    }
}

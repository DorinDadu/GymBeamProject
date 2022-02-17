package Page;

import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithFacebookPage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public LoginWithFacebookPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div/div/div[2]/div/a/div[2]")
    public WebElement loginWithfacebook;

    public void loginWithFacebook(){
        elementMethods.clickElement(loginWithfacebook);
    }
}

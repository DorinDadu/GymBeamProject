package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWithFacebookPage extends BasePage {

    public LoginWithFacebookPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div/div/div[2]/div/a/div[2]")
    private WebElement loginWithfacebook;

    public void loginWithFacebook() {
        elementMethods.clickElement(loginWithfacebook);
    }
}

package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class LoginWithFacebookPage extends BasePage {

    public LoginWithFacebookPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li>div>div>a[href='https://gymbeam.ro/customer/account/login/']")
    private WebElement skipLoginElement;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div/div/div[2]/div/a/div[2]")
    private WebElement loginWithfacebook;

    public void clickSkipLogin(){elementMethods.clickElement(skipLoginElement);}
    public void loginWithFacebook() {
        elementMethods.clickElement(loginWithfacebook);
    }

    public void loginWithFacebookProcess(HashMap<String, String> inputData){
        clickSkipLogin();
        loginWithFacebook();
    }

}

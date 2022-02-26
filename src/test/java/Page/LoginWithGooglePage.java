package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class LoginWithGooglePage extends BasePage {


    public LoginWithGooglePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div/div/div[1]/div/a")
    private WebElement loginwithGoogleElement;
    @FindBy(css = "input[type='email']")
    private WebElement emailElement;
    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
    private WebElement submitElement;

    public void loginwithGoogle() {
        elementMethods.clickElement(loginwithGoogleElement);
    }

    public void fillEmail(String value) {
        elementMethods.fillElement(emailElement, value);
    }

    public void clicksubmit() {
        elementMethods.clickElement(submitElement);
    }

    public void loginwithGoogleProcess(HashMap<String, String> inputData) {
        loginwithGoogle();
        fillEmail(inputData.get("email"));
        clicksubmit();
    }
}

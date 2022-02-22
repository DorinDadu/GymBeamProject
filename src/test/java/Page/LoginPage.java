package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {super(driver);}


    @FindBy(id = "header-links-component")
    private WebElement loginElement;
    @FindBy(css = "input[name='login[username]']")
    private WebElement userNameElement;
    @FindBy(css = "input[name='login[password]']")
    private WebElement passwordElement;
    @FindBy(id = "send2")
    private WebElement submitElement;

    public void clickLogin(){elementMethods.clickElement(loginElement);}
    public void filluserName(String value) {elementMethods.fillElement(userNameElement, value);}
    public void fillPassword(String value) {elementMethods.fillElement(passwordElement, value);}
    public void clickEnter(){elementMethods.clickElement(submitElement);}

    public void loginValidProcess(HashMap<String, String> inputData){
        clickLogin();
        filluserName(inputData.get("userName"));
        fillPassword(inputData.get("password"));
        clickEnter();

    }

}


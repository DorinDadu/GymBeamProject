package Page;

import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "header-links-component")
    public WebElement loginElement;
    @FindBy(css = "input[name='login[username]']")
    public WebElement userNameElement;
    @FindBy(css = "input[name='login[password]']")
    public WebElement passwordElement;
    @FindBy(id = "send2")
    public WebElement submitElement;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
    public WebElement errorMessageElement;

    public void clickLogin() {
        elementMethods.clickElement(loginElement);
    }
    public void filluserName(String value) {
        elementMethods.fillElement(userNameElement, value);
    }

    public void fillPassword(String value) {
        elementMethods.fillElement(passwordElement, value);
    }
    public void loginValidProcess(String userName, String password){

        filluserName(userName);
        fillPassword(password);
        elementMethods.clickElement(submitElement);
    }
    public void loginInvalidProcess(String password, String error){
        fillPassword(password);
        elementMethods.clickElement(submitElement);
        elementMethods.validateElementText(errorMessageElement, error);

    }

}


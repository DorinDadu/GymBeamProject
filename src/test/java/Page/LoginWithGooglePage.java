package Page;

import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithGooglePage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public LoginWithGooglePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div/div/div[1]/div/a")
    public WebElement loginwithGoogleElement;
    @FindBy(css = "input[type='email']")
    public WebElement emailElement;
    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
    public WebElement submitElement;

    public void loginwithGoogle(){
        elementMethods.clickElement(loginwithGoogleElement);
    }
    public void fillEmail(String value){
        elementMethods.fillElement(emailElement, value);
    }
    public void clicksubmit(){
        elementMethods.clickElement(submitElement);
    }
}

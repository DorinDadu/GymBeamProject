package Page;

import Help.ElementMethods;
import Help.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountregistrationPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public AccountregistrationPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "li>div>div>a[href='https://gymbeam.ro/customer/account/login/']")
    public WebElement autentificareElement;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/div[2]/div/div/a")
    public WebElement crearecontElement;
    @FindBy(id = "email_address")
    public WebElement emailElement;
    @FindBy(id = "firstname")
    public WebElement firstnameElement;
    @FindBy(id = "lastname")
    public WebElement lastnameElement;
    @FindBy(id = "password")
    public WebElement passwordElement;
    @FindBy(id = "gender")
    public WebElement genderElement;
    @FindBy(id = "password-confirmation")
    public WebElement confirmpasswordElement;
    @FindBy(id = "is_subscribed")
    public WebElement newsletterElement;
    @FindBy(css = "form>div>div>[type='submit']")
    public WebElement submitElement;

    public void clickAutentificare(){
        elementMethods.clickElement(autentificareElement);
    }
    public void clickCrearecont(){
        elementMethods.clickElement(crearecontElement);
    }
    public void fillEmail(String value){
        elementMethods.fillElement(emailElement, value);
    }
    public void fillFirstname(String value){
        elementMethods.fillElement(firstnameElement, value);
    }
    public void fillLastname(String value){
        elementMethods.fillElement(lastnameElement, value);
    }
    public void fillPassword(String value){
        elementMethods.fillElement(passwordElement, value);
    }
    public void fillGender(String value){
        elementMethods.fillElement(genderElement,value);
    }
    public void fillConfirmpassword(String value){
        elementMethods.fillElement(confirmpasswordElement, value);
    }
    public void clicknewsletter(){
        elementMethods.clickElement(newsletterElement);
    }
    public void clickSubmit(){
        elementMethods.clickElement(submitElement);
    }

}

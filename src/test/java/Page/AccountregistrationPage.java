package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class AccountregistrationPage extends BasePage {


    public AccountregistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li>div>div>a[href='https://gymbeam.ro/customer/account/login/']")
    private WebElement autentificareElement;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/div[2]/div/div/a")
    private WebElement crearecontElement;
    @FindBy(id = "email_address")
    private WebElement emailElement;
    @FindBy(id = "firstname")
    private WebElement firstnameElement;
    @FindBy(id = "lastname")
    private WebElement lastnameElement;
    @FindBy(id = "password")
    private WebElement passwordElement;
    @FindBy(id = "gender")
    private WebElement genderElement;
    @FindBy(id = "password-confirmation")
    private WebElement confirmpasswordElement;
    @FindBy(id = "is_subscribed")
    private WebElement newsletterElement;
    @FindBy(css = "form>div>div>[type='submit']")
    private WebElement submitElement;

    public void clickAutentificare() {
        elementMethods.clickElement(autentificareElement);
    }

    public void clickCrearecont() {
        elementMethods.clickElement(crearecontElement);
    }

    public void fillEmail(String value) {
        elementMethods.fillElement(emailElement, value);
    }

    public void fillFirstname(String value) {
        elementMethods.fillElement(firstnameElement, value);
    }

    public void fillLastname(String value) {
        elementMethods.fillElement(lastnameElement, value);
    }

    public void fillPassword(String value) {
        elementMethods.fillElement(passwordElement, value);
    }

    public void fillGender(String value) {
        elementMethods.fillElement(genderElement, value);
    }

    public void fillConfirmpassword(String value) {
        elementMethods.fillElement(confirmpasswordElement, value);
    }

    public void clicknewsletter() {
        elementMethods.clickElement(newsletterElement);
    }

    public void clickSubmit() {
        elementMethods.clickElement(submitElement);
    }

    public void registerValidProcess(HashMap<String, String> inputData) {
        clickAutentificare();
        clickCrearecont();
        fillFirstname(inputData.get("firstName"));
        fillEmail(inputData.get("email"));
        fillLastname(inputData.get("lastName"));
        fillPassword(inputData.get("password"));
        fillGender(inputData.get("gender"));
        pageMethods.scrollElement(0,400);
        fillConfirmpassword(inputData.get("confirmPassword"));
        clicknewsletter();
        clickSubmit();
    }

}

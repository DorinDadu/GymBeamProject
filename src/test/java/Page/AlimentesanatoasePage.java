package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AlimentesanatoasePage extends BasePage {

    public AlimentesanatoasePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/alimente-sanatoase']")
    private WebElement alimenteSanatoaseElement;
    @FindBy(css = "a[href='/snacks-uri-proteice']")
    private WebElement gustariproteiceElement;
    @FindBy(css = "[id='btn-cookie-allow']")
    private WebElement acceptCookieElement;
    @FindBy(css = "a[href='https://gymbeam.ro/checkout/cart/")
    private WebElement checkcartElement;
    @FindBy(css = "[class='action action-delete']")
    private WebElement cleancartElement;
    @FindBy(css = "[class='action primary tocart']")
    private WebElement addtoCartElement;
    @FindBy(className = "porto-icon-up-dir")
    private WebElement multiplicateNumberOfProducts;


    public void movetoAlimentesanatoase() {
        elementMethods.movetoElement(alimenteSanatoaseElement);
    }

    public void clickGustariProteice() {
        elementMethods.clickElement(gustariproteiceElement);
    }

    public void clickacceptCookie() {
        elementMethods.clickElement(acceptCookieElement);
    }

    public void gustariProteiceOption(int index) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("[class='product actions product-item-actions']")));
        List<WebElement> produseOption = driver.findElements(By.cssSelector("button[type='submit']"));
        elementMethods.movetoElement(produseOption.get(index));
        elementMethods.DoubleClickElement(produseOption.get(index));
    }

    public void clickMultiplicateProductsNumber() {
        elementMethods.clickElement(multiplicateNumberOfProducts);
    }

    public void clickAddToCart() {
        elementMethods.clickElement(addtoCartElement);
    }

    public void checkCart() {
        elementMethods.clickElement(checkcartElement);
    }

    public void cleanCart() {
        elementMethods.clickElement(cleancartElement);
    }


}

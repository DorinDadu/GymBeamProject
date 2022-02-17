package Page;

import Help.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlimentesanatoasePage {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public AlimentesanatoasePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='/alimente-sanatoase']")
    public WebElement alimenteSanatoaseElement;
    @FindBy(css = "a[href='/cereale-si-musli']")
    public WebElement cerealeMusliElement;
    @FindBy(css = "[class='span3']")
    public WebElement acceptCookieElement;
    @FindBy(css = "a[href='https://gymbeam.ro/checkout/cart/")
    public WebElement checkcartElement;
    @FindBy(css = "td>div>a[href='#']")
    public WebElement cleancartElement;


    public void movetoAlimentesanatoase(){
        elementMethods.movetoElement(alimenteSanatoaseElement);
    }
    public void clickcerealeMusli(){
        elementMethods.clickElement(cerealeMusliElement);
    }
    public void cerealeMusliOption(int index){
        List<WebElement> produseOption = driver.findElements(By.cssSelector("[class='product actions product-item-actions']"));
        produseOption.get(index).click();
    }
    public void clickacceptCookie(){
        elementMethods.clickElement(acceptCookieElement);
    }
    public void checkCart(){
        elementMethods.clickElement(checkcartElement);
    }
    public void cleanCart(){
        elementMethods.clickElement(cleancartElement);
    }



}

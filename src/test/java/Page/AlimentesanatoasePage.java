package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlimentesanatoasePage extends BasePage{

    public AlimentesanatoasePage(WebDriver driver) {super(driver);}


    @FindBy(css = "a[href='/alimente-sanatoase']")
    private WebElement alimenteSanatoaseElement;
    @FindBy(css = "a[href='/cereale-si-musli']")
    private WebElement cerealeMusliElement;
    @FindBy(css = "[class='span3']")
    private WebElement acceptCookieElement;
    @FindBy(css = "a[href='https://gymbeam.ro/checkout/cart/")
    private WebElement checkcartElement;
    @FindBy(css = "td>div>a[href='#']")
    private WebElement cleancartElement;


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

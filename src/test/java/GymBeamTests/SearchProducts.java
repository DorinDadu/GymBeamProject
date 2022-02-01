package GymBeamTests;

import Baza1.sharedData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchProducts extends sharedData {

    @Test

    public void searchproductsTest(){

        WebElement searchProducts= driver.findElement(By.cssSelector("[href='/alimente-sanatoase']"));
        searchProducts.click();

        WebElement energyDrink= driver.findElement(By.xpath("//*[@id=\"amasty-shopby-product-list\"]/div[3]/ol/li[1]/div/a"));
        energyDrink.click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");













    }
}

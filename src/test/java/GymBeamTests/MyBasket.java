package GymBeamTests;

import Baza1.sharedData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyBasket extends sharedData {

    @Test

    public void mybasketTest(){

        WebElement myBasket= driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div[3]/div/a/span[2]/span[2]/span"));
        myBasket.click();
    }
}

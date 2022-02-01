package GymBeamTests;

import Baza1.sharedData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginwithGoogle extends sharedData {

    @Test

    public void loginwithGoogleTest(){

        WebElement skiploginElement= driver.findElement(By.id("header-links-component"));
        skiploginElement.click();

        WebElement loginwithGoogle= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div/div/div[1]/div/a"));
        loginwithGoogle.click();

        WebElement emailcontGoogle= driver.findElement(By.cssSelector("input[type='email']"));
        String emailValue= "DorinP@dogmail.com";
        emailcontGoogle.sendKeys(emailValue);

        WebElement submitGoogleacoount= driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        submitGoogleacoount.click();
    }
}

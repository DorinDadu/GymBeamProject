package GymBeamTests;

import Baza1.sharedData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;




public class Login {
    public static class LoginTest extends sharedData {

        @Test

        public void loginTest() {

            WebElement loginElement= driver.findElement(By.id("header-links-component"));
            loginElement.click();

            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1500)");

            WebElement emailElement= driver.findElement(By.cssSelector("input[name='login[username]']"));
            String email= "DorinP@dogmail.com";
            emailElement.sendKeys(email);

            WebElement passwordElement= driver.findElement(By.cssSelector("input[name='login[password]']"));
            String password= "444Dadu222";
            passwordElement.sendKeys(password);

            WebElement submitElement= driver.findElement(By.id("send2"));
            submitElement.click();

        }
    }

}
package GymBeamTests;

import Baza1.sharedData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AccountRegistration extends sharedData {

    @Test

    public void accountregistrationTest(){


        WebElement loginElement= driver.findElement(By.id("header-links-component"));
        loginElement.click();

        WebElement crearecontButton= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/div[2]/div/div/a/span"));
        crearecontButton.click();

        WebElement emailElement= driver.findElement(By.id("email_address"));
        String email ="DorinP@dogmail.com";
        emailElement.sendKeys(email);


        WebElement lastnameElement= driver.findElement(By.id("lastname"));
        String lastNamevalue="P";
        lastnameElement.sendKeys(lastNamevalue);

        WebElement passwordElement= driver.findElement(By.id("password"));
        String password= "444Dadu222";
        passwordElement.sendKeys(password);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        WebElement genderButton= driver.findElement(By.id("gender"));
        genderButton.click();
        genderButton.sendKeys("Masculin");
        genderButton.sendKeys(Keys.ENTER);

        WebElement confirmpasswordelement= driver.findElement(By.id("password-confirmation"));
        String confirmpasword= "444Dadu222";
        confirmpasswordelement.sendKeys(confirmpasword);

        WebElement newsletterElement= driver.findElement(By.id("is_subscribed"));
        newsletterElement.click();

        WebElement submitElement= driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"));
        submitElement.click();


    }
}



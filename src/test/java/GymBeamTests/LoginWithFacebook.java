package GymBeamTests;

import Baza1.sharedData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginWithFacebook extends sharedData {


    @Test

    public void loginwithFacebookTest(){

        WebElement skiploginElement= driver.findElement(By.id("header-links-component"));
        skiploginElement.click();

        WebElement loginwithFacebook= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div/div/div[2]/div/a/div[2]"));
        loginwithFacebook.click();

    }
}

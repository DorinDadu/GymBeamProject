package GymBeamTests;

import Baza1.sharedData;
import Page.LoginPage;
import org.junit.Test;

public class InvalidLoginTest extends sharedData {
    public LoginPage loginPage;

    @Test

    public void invalidLoginTest(){
        loginPage=new LoginPage(driver);

        loginPage.clickLogin();
        loginPage.loginInvalidProcess("444Dadu222", "A login and a password are required.");

    }
}

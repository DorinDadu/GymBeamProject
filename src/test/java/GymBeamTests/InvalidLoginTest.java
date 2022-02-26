package GymBeamTests;

import Baza1.Hooks;
import Page.LoginPage;
import org.junit.Test;

public class InvalidLoginTest extends Hooks {
    public LoginPage loginPage;

    @Test
    public void invalidLoginFlow() {
        loginPage = new LoginPage(getDriver());
        loginPage.invalidLoginprocess(inputData);
    }


}

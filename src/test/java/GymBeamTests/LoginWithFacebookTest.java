package GymBeamTests;

import Baza1.Hooks;
import Page.LoginWithFacebookPage;
import org.junit.Test;

public class LoginWithFacebookTest extends Hooks {

    public LoginWithFacebookPage loginWithFacebookPage;

    @Test
    public void loginwithFacebookTest() {

        loginWithFacebookPage = new LoginWithFacebookPage(getDriver());
        loginWithFacebookPage.loginWithFacebookProcess(inputData);

    }
}

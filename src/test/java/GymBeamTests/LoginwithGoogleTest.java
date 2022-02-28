package GymBeamTests;

import Baza1.Hooks;
import Page.LoginWithGooglePage;
import org.junit.Test;

public class LoginwithGoogleTest extends Hooks {
    public LoginWithGooglePage loginWithGooglePage;

    @Test
    public void loginwithGoogleTest() {
        loginWithGooglePage = new LoginWithGooglePage(getDriver());

        loginWithGooglePage.loginwithGoogleProcess(inputData);

    }
}

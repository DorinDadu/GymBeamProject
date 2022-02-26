package GymBeamTests;

import Baza1.Hooks;
import Page.IndexPage;
import Page.LoginWithFacebookPage;
import org.junit.Test;

public class LoginWithFacebookTest extends Hooks {
    public IndexPage indexPage;
    public LoginWithFacebookPage loginWithFacebookPage;

    @Test
    public void loginwithFacebookTest() {
        indexPage = new IndexPage(getDriver());
        loginWithFacebookPage = new LoginWithFacebookPage(getDriver());

        indexPage.clickSkipLogin();
        loginWithFacebookPage.loginWithFacebook();


    }
}

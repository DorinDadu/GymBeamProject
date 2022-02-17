package GymBeamTests;

import Baza1.sharedData;
import Page.IndexPage;
import Page.LoginWithFacebookPage;
import org.junit.Test;

public class LoginWithFacebookTest extends sharedData {
    public IndexPage indexPage;
    public LoginWithFacebookPage loginWithFacebookPage;


    @Test

    public void loginwithFacebookTest(){
        indexPage=new IndexPage(driver);
        loginWithFacebookPage=new LoginWithFacebookPage(driver);

        indexPage.clickSkipLogin();
        loginWithFacebookPage.loginWithFacebook();


    }
}

package GymBeamTests;

import Baza1.sharedData;
import Page.IndexPage;
import Page.LoginWithGooglePage;
import org.junit.Test;

public class LoginwithGoogleTest extends sharedData {
   public LoginWithGooglePage loginWithGooglePage;
   public IndexPage indexPage;

    @Test
    public void loginwithGoogleTest(){
        loginWithGooglePage=new LoginWithGooglePage(driver);
        indexPage=new IndexPage(driver);

        indexPage.clickSkipLogin();
        loginWithGooglePage.loginwithGoogle();
        loginWithGooglePage.fillEmail("DorinP@dogmail.com");
        loginWithGooglePage.clicksubmit();

    }
}

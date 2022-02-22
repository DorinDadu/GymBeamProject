package GymBeamTests;

import Baza1.Hooks;
import Page.IndexPage;
import Page.LoginWithGooglePage;
import org.junit.Test;

public class LoginwithGoogleTest extends Hooks {
   public LoginWithGooglePage loginWithGooglePage;
   public IndexPage indexPage;

    @Test
    public void loginwithGoogleTest(){
        loginWithGooglePage=new LoginWithGooglePage(getDriver());
        indexPage=new IndexPage(getDriver());
        indexPage.clickSkipLogin();
        loginWithGooglePage.loginwithGoogleProcess(inputData);

    }
}

package GymBeamTests;

import Baza1.sharedData;
import Page.LoginPage;
import org.junit.Test;

public class LoginTest extends sharedData {

    public LoginPage loginPage;
        @Test

        public void loginflow() {
          loginPage=new LoginPage(driver);

          loginPage.clickLogin();
          loginPage.loginValidProcess("DorinP@dogmail.com", "444Dadu222");


        }
    }


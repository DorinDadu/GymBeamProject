package GymBeamTests;

import Baza1.Hooks;
import Page.LoginPage;
import org.junit.Test;

public class ValidLoginTest extends Hooks {
    public LoginPage loginPage;
        @Test

        public void loginflow() {
            loginPage= new LoginPage(getDriver());
            loginPage.loginValidProcess(inputData);
        }
    }


package GymBeamTests;

import Baza1.Hooks;
import Page.AccountregistrationPage;
import org.junit.Test;

public class AccountRegistrationTest extends Hooks {
    public AccountregistrationPage accountregistrationPage;

    @Test
    public void accountregistrationTest() {
        accountregistrationPage = new AccountregistrationPage(getDriver());

        accountregistrationPage.registerValidProcess(inputData);
    }
}



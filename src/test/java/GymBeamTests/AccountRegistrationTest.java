package GymBeamTests;

import Baza1.Hooks;
import Help.PageMethods;
import Page.AccountregistrationPage;
import org.junit.Test;

public class AccountRegistrationTest extends Hooks {
    public AccountregistrationPage accountregistrationPage;
    public PageMethods pageMethods;
    @Test

    public void accountregistrationTest(){
       accountregistrationPage= new AccountregistrationPage(getDriver());
       pageMethods =new PageMethods(getDriver());

      accountregistrationPage.registerValidProcess(inputData);
    }
}



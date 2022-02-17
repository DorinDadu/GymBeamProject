package GymBeamTests;

import Baza1.sharedData;
import Help.PageMethods;
import Page.AccountregistrationPage;
import org.junit.Test;

public class AccountRegistrationTest extends sharedData {
    public AccountregistrationPage accountregistrationPage;
    public PageMethods pageMethods;
    @Test

    public void accountregistrationTest(){
       accountregistrationPage= new AccountregistrationPage(driver);
       pageMethods =new PageMethods(driver);

       accountregistrationPage.clickAutentificare();
       accountregistrationPage.clickCrearecont();
       accountregistrationPage.fillEmail("DorinP@dogmail.com");
       accountregistrationPage.fillFirstname("Dorin");
       accountregistrationPage.fillLastname("P");
       accountregistrationPage.fillPassword("444Dadu222");
       accountregistrationPage.fillGender("Masculin");
       pageMethods.scrollElement("window.scrollBy(0,400)");
       accountregistrationPage.fillConfirmpassword("444Dadu222");
       accountregistrationPage.clicknewsletter();
       accountregistrationPage.clickSubmit();
    }
}



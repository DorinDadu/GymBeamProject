package GymBeamTests;

import Baza1.sharedData;
import Help.PageMethods;
import Page.AlimentesanatoasePage;
import org.junit.Test;

public class AlimenteSanatoaseTest extends sharedData {
    public AlimentesanatoasePage alimentesanatoasePage;

    @Test
    public void alimentesanatoaseTest() {
        alimentesanatoasePage = new AlimentesanatoasePage(driver);


        alimentesanatoasePage.movetoAlimentesanatoase();
        alimentesanatoasePage.clickcerealeMusli();
        alimentesanatoasePage.clickacceptCookie();
        alimentesanatoasePage.cerealeMusliOption(3);
        alimentesanatoasePage.checkCart();
        alimentesanatoasePage.cleanCart();







    }
}









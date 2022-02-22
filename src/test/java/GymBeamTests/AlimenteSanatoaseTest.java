package GymBeamTests;

import Baza1.Hooks;
import Page.AlimentesanatoasePage;
import org.junit.Test;

public class AlimenteSanatoaseTest extends Hooks {
    public AlimentesanatoasePage alimentesanatoasePage;

    @Test
    public void alimentesanatoaseTest() {
        alimentesanatoasePage = new AlimentesanatoasePage(getDriver());


        alimentesanatoasePage.movetoAlimentesanatoase();
        alimentesanatoasePage.clickcerealeMusli();
        alimentesanatoasePage.clickacceptCookie();
        alimentesanatoasePage.cerealeMusliOption(3);
        alimentesanatoasePage.checkCart();
        alimentesanatoasePage.cleanCart();







    }
}









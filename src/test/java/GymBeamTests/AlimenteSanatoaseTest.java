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
        alimentesanatoasePage.clickGustariProteice();
        alimentesanatoasePage.clickacceptCookie();
        alimentesanatoasePage.gustariProteiceOption(3);
        alimentesanatoasePage.clickMultiplicateProductsNumber();
        alimentesanatoasePage.clickMultiplicateProductsNumber();
        alimentesanatoasePage.clickAddToCart();
        alimentesanatoasePage.checkCart();
        alimentesanatoasePage.cleanCart();

    }
}









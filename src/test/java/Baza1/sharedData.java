package Baza1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import propertiesUtility.PropertiesObject;

import java.time.Duration;


public class sharedData {
    private WebDriver driver;

    public void InitializeDriver(){
        PropertiesObject driverResource = new PropertiesObject("driverResource/DriverResource");
        System.setProperty(driverResource.getValueByKey("browser"), driverResource.getValueByKey("browserPath"));
        driver = new ChromeDriver();
        driver.get(driverResource.getValueByKey("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void TearDown(){

        driver.quit();
    }

    public WebDriver getDriver(){return driver;}
}

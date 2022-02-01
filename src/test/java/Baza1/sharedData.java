package Baza1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sharedData {

    public WebDriver driver;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://gymbeam.ro/");
        driver.manage().window().maximize();

    }

   //@After

    //public void tearDown(){driver.quit();}
}

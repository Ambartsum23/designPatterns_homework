package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FactoryChrome {



    private WebDriver driver;
    //Constructor
    public FactoryChrome(WebDriver driver) {

        this.driver = driver;
        driver.get("https://demoqa.com/");
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

}

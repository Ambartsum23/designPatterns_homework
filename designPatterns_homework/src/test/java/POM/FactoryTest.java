package POM;

import Steps.FactoryMainPage;
import Utils.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FactoryTest{
    private WebDriver driver;
    ChromeAndWeb openn = new ChromeAndWeb();
    FactoryChrome factorOpen = new FactoryChrome( driver);
    FactoryMainPage FPage = new FactoryMainPage( driver );


    public FactoryTest (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @Test
    public void setMainPage(){
        openn.openchrome();
        FPage.formChlick();
    }

  /*@FindBy(xpath = "//div[@class='category-cards']/div[2]");
        WebElement formsElement;
        formsElement.click();
        LeftPannelMethods left;
        left.LeftPannelClick();*/
}

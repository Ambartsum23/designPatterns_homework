package Factory;


import Utils.ChromeAndWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FactoryTests {
    private WebDriver driver;
    ChromeAndWeb openn=new ChromeAndWeb();
    FactoryChrome factorOpen=new FactoryChrome( driver);
    FactoryMainPage f =new FactoryMainPage( driver );


    public FactoryTests (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @Test
    public void setMainPage(){

        openn.openchrome();
        f.formChlick();


    }



    //  @FindBy(xpath = "//div[@class='category-cards']/div[2]");
//        WebElement formsElement;
//        formsElement.click();
//        LeftPannelMethods left;
//        left.LeftPannelClick();
}

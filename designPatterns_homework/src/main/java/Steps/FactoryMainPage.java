package Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryMainPage {
    public WebDriver driver;

    public FactoryMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='category-cards']/div[2]")
    WebElement formsElement;

    public FactoryMainPage formChlick() {
        formsElement.click();
        return this;
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    WebElement practiceForm;

    public FactoryMainPage practiceFormChlick() {
        practiceForm.click();
        return this;
    }
}
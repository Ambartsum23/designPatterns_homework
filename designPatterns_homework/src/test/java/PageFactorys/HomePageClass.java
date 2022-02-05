package PageFactorys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePageClass {
    JavascriptExecutor js;

    public HomePageClass(WebDriver driver){
        js = (JavascriptExecutor) driver;

        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#app > div > div > div.home-body > div > div:nth-child(2)")
    WebElement form;
    @FindBy(xpath = "//div[@class='element-list collapse show']")
    WebElement practiceForm;
    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBys(
            @FindBy(css = "#genterWrapper > div.col-md-9.col-sm-12 > div > label")
    )
    List<WebElement> genders;
    @FindBy(id = "userNumber")
    WebElement phoneNumber;
    @FindBy(id = "submit")
    WebElement submit;
    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement mainText;
    @FindBy(css = "body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(1) > td:nth-child(2)")
    WebElement nameText;
    @FindBy(css = "body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(3) > td:nth-child(2)")
    WebElement genderText;
    @FindBy(css = "body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")
    WebElement phoneNumberText;

    public void ClickToForms() {
        form.click();
    }

    public void ClickToPracticeForms() {
        practiceForm.click();
    }

    public void FillBlank(String name, String last, String gender, String phone){
        firstName.sendKeys(name);
        lastName.sendKeys(last);

        for (WebElement gen : genders)
            if (gen.getText().equals(gender))
                gen.click();

        phoneNumber.sendKeys(phone);
    }
    public void Submit(){
        js.executeScript("arguments[0].scrollIntoView();", submit);
        submit.click();
    }

    public void CheckMainText(String text){
        System.out.println(mainText.getText());
        Assert.assertEquals(mainText.getText(),text);
    }

    public void CheckName(String name, String lastname){
        Assert.assertEquals(nameText.getText(), name+" "+lastname);
    }
    public void CheckGender(String gender){
        Assert.assertEquals(genderText.getText(),gender);
    }
    public void CheckPhoneNumber(String number){
        Assert.assertEquals(phoneNumberText.getText(), number);
    }

}

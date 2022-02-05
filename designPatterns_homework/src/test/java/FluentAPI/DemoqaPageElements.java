package FluentAPI;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DemoqaPageElements {

    public DemoqaPageElements(String url){
        open(url);
    }
    public SelenideElement Forms(){
        return $("#app > div > div > div.home-body > div > div:nth-child(2)");
    }
    public SelenideElement PracticeForms(){
        return $(By.xpath("//div[@class='element-list collapse show']"));
    }
    public SelenideElement FirstName(){
        return $("#firstName");
    }
    public SelenideElement LastName(){
        return $("#lastName");
    }
    public SelenideElement Gender(String gender){
        ElementsCollection genders = $("#genterWrapper > div.col-md-9.col-sm-12").findAll("#genterWrapper > div.col-md-9.col-sm-12 > div > label");
        for (SelenideElement gen : genders)
        {
            if (gen.getText().equals(gender))
            {
                return gen;
            }
        }
        return null;
    }
    public SelenideElement PhoneNumber(){
        return $("#userNumber");
    }
    public SelenideElement SubmitButton(){
        return $("#submit");
    }

    public SelenideElement MainText(){
        return $("#example-modal-sizes-title-lg");
    }
    public  SelenideElement StudentNameText(){
        return  $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(1) > td:nth-child(2)");
    }
    public SelenideElement StudentGenderText(){
        return  $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(3) > td:nth-child(2)");
    }
    public SelenideElement StudentPhoneNumberText(){
        return $("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(4) > td:nth-child(2)");
    }
}

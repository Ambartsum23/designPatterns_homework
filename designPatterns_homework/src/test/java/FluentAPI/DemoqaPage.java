package FluentAPI;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.*;
public class DemoqaPage extends DemoqaPageElements {
    private String _url;
    public DemoqaPage (String url)
    {
        super(url);
        _url = url;
    }
    public DemoqaPage Navigate()
    {
        open(_url);
        return this;
    }
    public DemoqaPage ClickToForms() {
        Forms().scrollTo();
        Forms().click();
        return this;
    }
    public DemoqaPage ClickToPracticeForms() {
        PracticeForms().click();
        return this;
    }
    public DemoqaPage FillFirstName(String firstname){
        FirstName().sendKeys(firstname);
        return this;
    }
    public DemoqaPage FillLastName(String lastName){
        LastName().sendKeys(lastName);
        return this;
    }
    public DemoqaPage FillGender(String gender){
        Gender(gender).click();
        return this;
    }
    public DemoqaPage FillPhoneNumber(String phone){
        PhoneNumber().sendKeys(phone);
        return this;
    }
    public DemoqaPage Submit(){
        SubmitButton().scrollTo();
        SubmitButton().click();
        return this;
    }
    public DemoqaPage CheckMainText(String text){
        MainText().shouldHave(Condition.text(text));
        return this;
    }
    public DemoqaPage CheckStudentNameText(String firsName, String lastName){
        StudentNameText().shouldHave(Condition.text(firsName+" "+lastName));
        return this;
    }
    public DemoqaPage CheckStudentGenderText(String gender){
        StudentGenderText().shouldHave(Condition.text(gender));
        return this;
    }
    public DemoqaPage CheckStudentPhoneNumber(String phone){
        StudentPhoneNumberText().shouldHave(Condition.text(phone));
        return this;
    }
}

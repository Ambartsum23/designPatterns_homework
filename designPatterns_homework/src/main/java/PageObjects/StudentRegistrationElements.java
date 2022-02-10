package PageObjects;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;


public class StudentRegistrationElements {

    public SelenideElement
            nameElement = $("#firstName"),
            lastNameElement = $("#lastName"),
            mobElement = $("#userNumber"),
            genderElement = $(".custom-control-label", 1),
            submit = $("#submit");

}

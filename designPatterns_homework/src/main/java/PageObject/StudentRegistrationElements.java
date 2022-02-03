package PageObject;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;


public class StudentRegistrationElements {

    public SelenideElement
            nameElement = $("#firstName"),
            lastNameElement = $("#lastName"),
            mobElement = $("#userNumber"),
            genderElement = $(".custom-control-label", 1),
            submit = $("#submit");

}

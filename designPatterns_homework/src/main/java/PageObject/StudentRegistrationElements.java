package PageObject;

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


/*
        import com.codeborne.selenide.SelenideElement;

        import static com.codeborne.selenide.Selectors.byId;
        import static com.codeborne.selenide.Selectors.byText;
        import static com.codeborne.selenide.Selenide.$;

public class StudentRegistrationElements {
    Person person = new Person();

    public SelenideElement firstName = $("#firstName");
    public SelenideElement lastName = $("#lastName");
    public SelenideElement gender = $(byText(person.getGender()));
    public SelenideElement mobile = $("#userNumber");
    public SelenideElement date = $(byId("dateOfBirthInput"));
    public SelenideElement submit = $(byId("submit"));
}*/
package Steps;

import PageObject.StudentRegistrationElements;

public class StudentRegistrationMethods {
    StudentRegistrationElements elements = new StudentRegistrationElements();


    public StudentRegistrationMethods setName(String name) {
        elements.nameElement.sendKeys(name);
        return this;
    }

    public StudentRegistrationMethods setLastname(String lastname) {
        elements.lastNameElement.sendKeys(lastname);
        return this;
    }

    public StudentRegistrationMethods setMob(String setMob) {

        elements.mobElement.sendKeys(setMob);
        return this;
    }

    public StudentRegistrationMethods setGender() {

        elements.genderElement.click();
        return this;
    }

    public StudentRegistrationMethods scroll() {
        elements.submit.scrollIntoView(true);
        return this;
    }

    public StudentRegistrationMethods setSubmit() {

        elements.submit.click();
        return this;
    }

}
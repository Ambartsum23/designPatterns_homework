package Steps;

import PageObjects.MainPageElements;
import io.qameta.allure.Step;

public class MainPageMethods {
    MainPageElements form = new MainPageElements();
    @Step("In main page : click forms button")
    public MainPageMethods formClick() {
        form.formsElement.click();
        return this;
    }
}

package Steps;
import PageObject.MainPageElements;

public class MainPageMethods {
    MainPageElements form = new MainPageElements();

    public void formClick() {
        form.formsElement.scrollTo().click();
    }
}

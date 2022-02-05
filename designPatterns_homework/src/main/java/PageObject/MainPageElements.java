package PageObject;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {
    public SelenideElement formsElement = $(withText("Form"));
}
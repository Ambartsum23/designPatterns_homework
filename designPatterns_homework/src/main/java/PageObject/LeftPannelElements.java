package PageObject;

import com.codeborne.selenide.SelenideElement;

        import static com.codeborne.selenide.Selectors.withText;
        import static com.codeborne.selenide.Selenide.$;

public class LeftPannelElements {
    public SelenideElement practiceForm = $(withText("Practice Form"));
}
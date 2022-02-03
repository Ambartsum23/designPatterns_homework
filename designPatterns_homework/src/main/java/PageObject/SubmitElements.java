package PageObject;

import Variables.Variables;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class SubmitElements {
    Variables v = new Variables();
    public WebDriver driver;

    public SelenideElement
            boxTitle = $(new ByText("Thanks for submitting the form")),
            vv = $(new ByText("Ambartsum Karapetyan"));
}


package PageObject;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

public class MainPageElements {

    public  SelenideElement
     formsElement = $(new ByText("Forms"));

}



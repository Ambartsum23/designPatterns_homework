package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

        import static com.codeborne.selenide.Selenide.$;

public class PopUp {

    public SelenideElement
            boxTitle = $(new ByText("Thanks for submitting the form")),
            studentName = $(new ByText("Ambartsum Karapetyan"));


}

/*import com.codeborne.selenide.SelenideElement;

        import java.util.List;

        import static com.codeborne.selenide.Selectors.*;
        import static com.codeborne.selenide.Selenide.$;

public class PopUp {

    public List<SelenideElement>
            rows= $(byTagName("tbody")).$$(byTagName("tr"));

}*/
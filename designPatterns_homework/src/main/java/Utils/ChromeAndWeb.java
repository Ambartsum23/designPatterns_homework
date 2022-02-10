package Utils;

import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.open;

public class ChromeAndWeb {

    ChromeAndWeb form = new ChromeAndWeb();
    // WebDriver driver;
    @Step("open Chrome and link")
    public ChromeAndWeb openchrome() {
        //driver.get("https://demoqa.com/");
        open("https://demoqa.com");
        return this;
    }

}
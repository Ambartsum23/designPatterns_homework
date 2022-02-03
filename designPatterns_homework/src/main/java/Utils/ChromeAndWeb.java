package Utils;
import static com.codeborne.selenide.Configuration.*;
import org.openqa.selenium.chrome.ChromeOptions;
//import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.open;

public class ChromeAndWeb {
    public void openchrome() {
       //startMaximized=true;
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        browserCapabilities = chromeOptions;

        open("https://demoqa.com/");
    }


}

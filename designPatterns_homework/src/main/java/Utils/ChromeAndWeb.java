package Utils;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class ChromeAndWeb {
                @BeforeTest
                public void setUp(){
                        timeout=1000;
                        holdBrowserOpen=false;
        }
        public void openchrome() {

                //startMaximized=true;
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                browserCapabilities = chromeOptions;
                open("https://demoqa.com/");
        }


}
package FluentAPI;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;

public class ConfigurationClass {
    public ConfigurationClass(){
        Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.savePageSource = false;
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
    }
}

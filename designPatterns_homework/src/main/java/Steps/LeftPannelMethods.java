package Steps;

import PageObjects.LeftPannelElements;
import io.qameta.allure.Step;

public class LeftPannelMethods extends LeftPannelElements {
    LeftPannelElements leftMeniu = new LeftPannelElements();

    @Step("Left panel : click practiceform button")
    public LeftPannelMethods LeftPannelClick() {
        leftMeniu.practiceForm.click();
        return this;
    }

}
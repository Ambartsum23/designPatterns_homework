package Steps;

import PageObject.LeftPannelElements;

public class LeftPannelMethods extends LeftPannelElements {

    LeftPannelElements leftMeniu = new LeftPannelElements();

    public LeftPannelMethods LeftPannelClick() {
        leftMeniu.practiceForm.click();
        return this;
    }

}
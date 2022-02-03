package Steps;
import PageObject.LeftPannelElements;

public class LeftPannelMethods extends LeftPannelElements {

    LeftPannelElements leftMeniu = new LeftPannelElements();
    public void LeftPannelClick() {

        leftMeniu.practiceForm.click();
    }
}

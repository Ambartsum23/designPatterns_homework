package Steps;

import PageObject.*;
import Variables.Variables;
import org.testng.Assert;

public class SubmitMethods {
    SubmitElements submit = new SubmitElements();
    Variables cvladebi = new Variables();

    public SubmitMethods checkTitile() {

        submit.boxTitle.getText();
        System.out.println(submit.boxTitle.getText());
        Assert.assertEquals(submit.boxTitle.getText(), "Thanks for submitting the form");
        return this;
    }

    public SubmitMethods checkValues() {
        submit.vv.getText();
        System.out.println(submit.vv.getText());
        Assert.assertEquals(submit.vv.getText(), cvladebi.name + " " + cvladebi.lastname);
        return this;
    }


}

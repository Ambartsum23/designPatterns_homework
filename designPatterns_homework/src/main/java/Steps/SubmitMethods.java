package Steps;
import PageObjects.PopUp;
import Variables.Variables;
import io.qameta.allure.Step;
import org.testng.Assert;

public class SubmitMethods {
    PopUp popup = new PopUp();
    Variables var= new Variables();

    @Step("After registration check title")
    public SubmitMethods checkTitile() {
        popup.boxTitle.getText();
        System.out.println(popup.boxTitle.getText());
        Assert.assertEquals(popup.boxTitle.getText(), "Thanks for submitting the form");
        return this;
    }

    @Step("After resistration check name and lastname")
    public SubmitMethods checkValues() {
        popup.studentName.getText();
        System.out.println(popup.studentName.getText());
        Assert.assertEquals(popup.studentName.getText(), var.getName() + " " + var.getLastname());
        return this;
    }

}
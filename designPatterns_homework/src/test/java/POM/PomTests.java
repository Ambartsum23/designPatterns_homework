package POM;

import Steps.LeftPannelMethods;
import Steps.MainPageMethods;
import Steps.StudentRegistrationMethods;
import Steps.SubmitMethods;
import Utils.ChromeAndWeb;
import Variables.Variables;
import org.testng.annotations.Test;

public class PomTests {

    ChromeAndWeb open = new ChromeAndWeb();
    MainPageMethods main = new MainPageMethods();
    LeftPannelMethods left = new LeftPannelMethods();
    StudentRegistrationMethods registration = new StudentRegistrationMethods();
    SubmitMethods afterSubmit = new SubmitMethods();
    Variables variables = new Variables();

    @Test
    public void testFierst() {
        open.openchrome();
        main.formClick();
        left.LeftPannelClick();
        registration.setName(variables.getName())
                .setLastname(variables.getLastname())
                .setMob(variables.getMobnumber())
                .setGender()
                .scroll()
                .setSubmit();
        afterSubmit.checkTitile().checkValues();
    }



}
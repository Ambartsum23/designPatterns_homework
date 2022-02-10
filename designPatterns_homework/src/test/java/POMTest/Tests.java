package POMTest;

import Steps.LeftPannelMethods;
import Steps.MainPageMethods;
import Steps.StudentRegistrationMethods;
import Steps.SubmitMethods;
import Utils.ChromeAndWeb;
import Variables.Variables;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class Tests extends ChromeAndWeb  {

    //FactoryChrome opn= new FactoryChrome(driver);
    ChromeAndWeb open = new ChromeAndWeb();
    MainPageMethods main = new MainPageMethods();
    LeftPannelMethods left = new LeftPannelMethods();
    StudentRegistrationMethods registration = new StudentRegistrationMethods();
    SubmitMethods afterSubmit = new SubmitMethods();
    Variables variables = new Variables();

    @Test( description = "Student Registration Form name1")
    @Epic("fierst Pom test")
    @Description("Student Registration Form name1")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "allure configuration", type = "https://docs.qameta.io/allure/#_configuration")
    public void testFierst() {
        open.openchrome("https://demoqa.com");
        main.formClick();
        left.LeftPannelClick();
        registration.setName(variables.getName())
                .setLastname(variables.getLastname())
                .setMob(variables.getMobnumber())
                .setGender()
                .scroll()
                .setSubmit();
        afterSubmit.checkTitile()
                .checkValues();
    }

    @Test( description = "Student Registration Form name2")
    @Story("Second pom test - it's story")
    @Description("Student Registration Form name2")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "allure annotation", type = "https://www.seleniumeasy.com/selenium-tutorials/allure-report-example-with-annotations")
    public void testSecond() {

        //  driver.navigate().to("https://demoqa.com/");
        open.openchrome("https://demoqa.com");
        main.formClick();
        left.LeftPannelClick();
        registration.setName(variables.getName2())
                .setLastname(variables.getLastname2())
                .setMob(variables.getMobnumber2())
                .setGender()
                .scroll()
                .setSubmit();
    }

    @Test( description = "second test in this group", priority = 100)
    @Feature("Feature test")
    @Description("test for test ")
    public void testThird() {
        System.out.println("I love test Automation");

    }
}
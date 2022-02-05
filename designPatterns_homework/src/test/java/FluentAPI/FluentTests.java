package FluentAPI;
import FluentAPI.ConfigurationClass;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({SoftAsserts.class})
public class FluentTests extends ConfigurationClass {
    private DemoqaPage _demoqaPage;
    private String _name = "Ambartsum";
    private String _lastName = "Karapetyan";
    private String _gender = "Male";
    private String _phone = "123123123";
    private String _mainText = "Thanks for submitting the form";
    private String _url = "https://demoqa.com/";

    @BeforeMethod
    public void Start(){
        _demoqaPage = new DemoqaPage(_url);
    }

    @Test
    public void MainTest(){
        _demoqaPage
                .Navigate()
                .ClickToForms()
                .ClickToPracticeForms()
                .FillFirstName(_name)
                .FillLastName(_lastName)
                .FillGender(_gender)
                .FillPhoneNumber(_phone)
                .Submit()
                .CheckMainText(_mainText)
                .CheckStudentNameText(_name,_lastName)
                .CheckStudentGenderText(_gender)
                .CheckStudentPhoneNumber(_phone);
    }
}

package Variables;

import io.qameta.allure.Step;

public class Variables {

    private String name = "Ambartsum";
    private String lastname = "Karapetyan";
    private String mobnumber = "123123123";

    private String name2 = "Giorgi";
    private String lastname2 = "Beridze";
    private String mobnumber2 = "987654321";

    @Step("getname")
    public String getName() {
        return this.name;
    }

    @Step("lastname")
    public String getLastname() {
        return this.lastname;
    }

    @Step("mobnumber")
    public String getMobnumber() {
        return this.mobnumber;
    }

    @Step("mobnumber2")
    public String getMobnumber2() {
        return mobnumber2;
    }

    @Step("lastname2")
    public String getLastname2() {
        return lastname2;
    }

    @Step("name2")
    public String getName2() {
        return name2;
    }


}
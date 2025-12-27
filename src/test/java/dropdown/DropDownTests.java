package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AccountCreate;
import pages.DropdownPage;
import pages.SignUpPage;

import static org.testng.Assert.assertEquals;

public class DropDownTests extends BaseTests {

    @Test
    public void testDropDown() {
        SignUpPage signUpPage = homePage.clickSignupLink();
        signUpPage.setName("mutangana");
        signUpPage.setEmail("mutangana@gmail.com");


        DropdownPage dropdownPage = signUpPage.clickSignUp();
        dropdownPage.clickRadioButton("Mr");


        dropdownPage.setNameInDrop("murugi");
        dropdownPage.setPassWordInDrop("muru2023");

        dropdownPage.setDate_of_Birth("15", "July", "2002");

        dropdownPage.setFirstNameField("mutama");
        dropdownPage.setLastNameField("Gilbert");
        dropdownPage.setCompanyField("go there");

        dropdownPage.setAddressField1("Remera");
        dropdownPage.setAddressField2("Kigali");

        dropdownPage.setcountryName("India");

        dropdownPage.setStateField("Birunga");
        dropdownPage.setCityField("kacyiru");

        dropdownPage.setZipCodeField("0000");
        dropdownPage.setMobileField("07892342");


        AccountCreate accountCreate = dropdownPage.clickCreateButton();
        assertEquals(accountCreate.getAlert(), "ACCOUNT CREATED!");

    }
}

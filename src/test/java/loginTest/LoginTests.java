package loginTest;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTests extends BaseTests {


    @Test
    public void testLogin() {
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setUsername("ipacy02@gmail.com");
        loginPage.setPassword("Manirampa20@");
        loginPage.clickLoginButton();

        assertEquals(loginPage.getLengthOfNav(), 1);


    }


}

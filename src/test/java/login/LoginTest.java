package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTests {

    @Test
    public void testLogin() {
        LoginPage loginPage = homePage.clickLoginLink();
        loginPage.setUserEmail("murinzi@gmail.com");
        loginPage.setPassWord("murinzi");

        HomePage homepage = loginPage.clickLogin();
        //change to string the current urls
        String currentUrl = driver.getCurrentUrl();

        assertEquals(currentUrl, "https://www.automationexercise.com/");

    }
}

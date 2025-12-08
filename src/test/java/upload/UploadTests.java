package upload;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.UploadPage;

import static org.testng.Assert.assertEquals;

public class UploadTests extends BaseTests {

    public WebDriver driver;


    @Test
    public void UploadTests() {

        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.setUsernameField("ipacy");
        uploadPage.setEmailField("ipacy02@gmail.com");
        uploadPage.setSubjectField("this is the field");
        uploadPage.setMessage("We are going to use it");


        assertEquals(uploadPage.clickUploadButton(), "Press OK to proceed!");

    }
}


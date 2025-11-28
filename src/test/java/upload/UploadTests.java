package upload;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.UploadPage;

public class UploadTests extends BaseTests {

    public WebDriver driver;


    @Test
    public void UploadTests() {

        driver.get("");

        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.setUsernameField();
        uploadPage.setEmailField();



    }
}


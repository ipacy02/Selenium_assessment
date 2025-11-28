package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {

    private WebDriver driver;
    private By usernameField = By.name("name");
    private By emailField = By.name("email");
    private By subjectField = By.name("subject");
    private By messageField = By.id("message");
    private By uploadFileField = By.name("upload_file");
    private By uploadButton = By.name("submit");



    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUsernameField(String name) {
        driver.findElement(usernameField).sendKeys(name);
    }
    public void setEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void setSubjectField(String subject) {
        driver.findElement(subjectField).sendKeys(subject);
    }
    public void setMessage(String message) {
        driver.findElement(messageField).sendKeys(message);
    }
//    public void uploadFile(String uploads) {
//        driver.findElement(uploadFileField).sendKeys(uploads);
//    }
    public AlertPage clickUploadButton() {
        driver.findElement(uploadButton).click();
        return new AlertPage(driver);
    }

}

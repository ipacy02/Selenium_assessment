package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs {

    private WebDriver driver;
    private By nameField = By.name("name");
    private By emailField = By.name("email");
    private By subjectField = By.name("subject");
    private By messageField = By.id("message");
    private By uploadField = By.name("upload_file");
    private By submitField = By.name("submit");

    public ContactUs(WebDriver driver) {
        this.driver = driver;
    }

    public void setNameField(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setSubject(String subject) {
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void setMessage(String message) {
        driver.findElement(messageField).sendKeys(message);
    }

    public void clickUploadFile(String upload) {
        driver.findElement(uploadField).sendKeys(upload);
    }

    public PopUpMessage clickSubmit() {
        driver.findElement(submitField).click();
        return new PopUpMessage(driver);

    }
}

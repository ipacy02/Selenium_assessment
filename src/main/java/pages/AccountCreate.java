package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreate {

    private WebDriver driver;
    private By alertMessageField = By.cssSelector("h2[class='title text-center']");

    public AccountCreate(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlert() {
        return driver.findElement(alertMessageField).getText();
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By loginField = By.cssSelector("button[data-qa='login-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void setUserEmail(String email) {
        driver.findElement(emailField).sendKeys(email);

    }

    public void setPassWord(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public HomePage clickLogin() {
        driver.findElement(loginField).click();

        return new HomePage(driver);
    }

}

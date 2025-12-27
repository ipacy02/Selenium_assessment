package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    private WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By nameField = By.name("name");
    private By emailField = By.cssSelector("div.signup-form input[name='email']");  //or .signup-form input[type='email'] //div.signup-form input[data-qa="signup-name"]
    private By signUpButton = By.cssSelector("div.signup-form button[data-qa='signup-button']");


    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public DropdownPage clickSignUp() {
        driver.findElement(signUpButton).click();
        return new DropdownPage(driver);
    }
}

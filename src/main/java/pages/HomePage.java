package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public By loginLinkField = By.cssSelector("#/login button");
    public By hovelink = By.className("product-overlay");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogin() {
        driver.findElement(loginLinkField).click();
        return new LoginPage(driver);

    }
    public HoverPage clickHover() {
        driver.findElement(hovelink).click();
        return new HoverPage(driver);
    }

}

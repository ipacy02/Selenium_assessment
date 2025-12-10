package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private By loginLinkField = By.linkText("Signup / Login");
    private By contactFieldLink = By.linkText("Contact us");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage clickLoginLink() {
        driver.findElement(loginLinkField).click();
        return new LoginPage(driver);
    }

    public ContactUs clickContactLink() {
        driver.findElement(contactFieldLink).click();

        return new ContactUs(driver);
    }

    private By productContainer = By.className("product-image-wrapper"); //the page to hover up
    private By addToCartField = By.linkText("Add to cart");  // add to cart
    private By AddedStatus = By.cssSelector(".modal-title.w-100"); //message to be visible after click add to cart

    public String clickCart(int index) {
        WebElement product = driver.findElements(productContainer).get(index);
        Actions action = new Actions(driver);
        action.moveToElement(product).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(addToCartField));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addToCart);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCart);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(AddedStatus)));
        return driver.findElement(AddedStatus).getText();
    }


    public SignUpPage clickSignupLink() {
        driver.findElement(By.linkText("Signup / Login")).click();
        return new SignUpPage(driver);
    }


}

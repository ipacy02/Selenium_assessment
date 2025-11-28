package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoverPage {

    private WebDriver driver;
    public By price = By.cssSelector(".product-overlay h2");
    public By dress = By.cssSelector(".product-overlay p");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public String hoverImage(int number) {
        WebElement printPrice = driver.findElement(price);
        WebElement printDress = driver.findElement(dress);

        Actions actions = new Actions(driver);
        actions.moveToElement(printPrice).perform();
        actions.moveToElement(printDress).perform();

        String caption = driver.findElements(price).get(2).getText();
        return caption;

    }
}

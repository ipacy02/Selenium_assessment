package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class PopUpMessage {

    private WebDriver driver;

    public PopUpMessage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertTextAndAccept() {
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();

        return text;
    }
}


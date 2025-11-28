package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    public HomePage homePage;



    @Test
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");

        homePage = new HomePage(driver);



    }
}

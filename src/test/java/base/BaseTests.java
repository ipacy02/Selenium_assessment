package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    public WebDriver driver;
    protected HomePage homePage;



    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //set chrome driver to access to the website
        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");

        homePage = new HomePage(driver);



    }

}

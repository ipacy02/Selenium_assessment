package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private WebDriver driver;
    private By nameInDrop = By.id("name");
    private By passWordInDrop = By.id("password");
    private By firstNameField = By.id("first_name");
    private By lastNameField = By.id("last_name");
    private By companyField = By.id("company");
    private By addressField1 = By.id("address1");
    private By addressField2 = By.id("address2");
    private By countryField = By.id("country");
    private By stateField = By.id("state");
    private By cityField = By.id("city");
    private By zipCodeField = By.id("zipcode");
    private By mobileField = By.id("mobile_number");
    private By submitField = By.cssSelector("button[data-qa='create-account']");


    public DropdownPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickRadioButton(String value) {
        driver.findElement(By.cssSelector("input[value='" + value + "']")).click();
    }

    public void setNameInDrop(String name) {
        driver.findElement(nameInDrop).sendKeys(name);
    }

    public void setPassWordInDrop(String password) {
        driver.findElement(passWordInDrop).sendKeys(password);
    }

    private By dateField = By.id("days");
    private By monthField = By.id("months");
    private By yearField = By.id("years");

    public void setDate_of_Birth(String day, String month, String year) {
        new Select(driver.findElement(dateField)).selectByVisibleText(day);
        new Select(driver.findElement(monthField)).selectByVisibleText(month);
        new Select(driver.findElement(yearField)).selectByVisibleText(year);
    }


    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setCompanyField(String companyName) {
        driver.findElement(companyField).sendKeys(companyName);
    }

    public void setAddressField1(String address1) {
        driver.findElement(addressField1).sendKeys(address1);
    }

    public void setAddressField2(String address2) {
        driver.findElement(addressField2).sendKeys(address2);
    }

    public void setcountryName(String country) {
        new Select(driver.findElement(countryField)).selectByVisibleText(country);
    }


    public void setStateField(String state) {
        driver.findElement(stateField).sendKeys(state);
    }

    public void setCityField(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void setZipCodeField(String zipcode) {
        driver.findElement(zipCodeField).sendKeys(zipcode);
    }

    public void setMobileField(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public AccountCreate clickCreateButton() {
        driver.findElement(submitField).click();
        return new AccountCreate(driver);
    }

}

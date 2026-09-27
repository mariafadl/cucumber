package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // --- Element Locators ---
    private By lblPageTitle = By.cssSelector(".orangehrm-login-title");
    private By txtUsername = By.name("username");
    private By txtPassword = By.name("password");
    private By btnSubmit = By.cssSelector("button[type='submit']");

    // --- Page Actions ---
    public LoginPage fillCredentials(String user, String pass) {
        driver.findElement(txtUsername).sendKeys(user);
        driver.findElement(txtPassword).sendKeys(pass);
        return this;
    }

    public LoginPage submitLoginForm() {
        driver.findElement(btnSubmit).click();
        return this;
    }

    // --- Validations ---
    public LoginPage verifyLoginPageIsDisplayed() {
        Assert.assertTrue(driver.findElement(lblPageTitle).isDisplayed());
        return this;
    }

    public void verifyRedirectedToDashboard(String expectedUrl) {
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}

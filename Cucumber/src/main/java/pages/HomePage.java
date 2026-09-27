package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // --- Element Locators ---
    private By lblDashboard = By.xpath("//a/span[contains(.,'Dashboard')]");

    // --- Validations ---
    public HomePage verifyDashboardIsVisible() {
        Assert.assertTrue(driver.findElement(lblDashboard).isDisplayed());
        return this;
    }
}

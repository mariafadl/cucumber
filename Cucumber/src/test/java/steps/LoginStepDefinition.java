package steps;

import base.Hooks;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDefinition {

    protected LoginPage loginPage;
    protected HomePage homePage;
    protected WebDriver driver;

    @Before
    public void initPages() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Given("the user navigates to the login screen")
    public void theUserNavigatesToTheLoginScreen() {
        loginPage.verifyLoginPageIsDisplayed();
    }

    @When("the user provides correct username and password")
    public void theUserProvidesCorrectUsernameAndPassword() {
        loginPage.fillCredentials("Admin", "admin123");
    }

    @And("the user submits the login form")
    public void theUserSubmitsTheLoginForm() {
        loginPage.submitLoginForm();
    }

    @Then("the user should land on the dashboard page")
    public void theUserShouldLandOnTheDashboardPage() {
        loginPage.verifyRedirectedToDashboard("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        homePage.verifyDashboardIsVisible();
    }
}

package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public WebDriver driver;

    private static final String BASE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setUp() {
        System.out.println("[Hooks] Launching browser...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        System.out.println("[Hooks] Navigated to: " + BASE_URL);
    }

    @After
    public void tearDown() {
        System.out.println("[Hooks] Test finished.");
        // driver.quit();
    }
}

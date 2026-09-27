package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "base"},
        plugin = {
                "pretty",
                "html:target/reports/orange-report.html",
                "json:target/reports/orange-report.json"
        },
        monochrome = true
)
public class OrangeTestRunner extends AbstractTestNGCucumberTests {

}

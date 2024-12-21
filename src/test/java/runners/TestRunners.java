package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"stepsDef" },
        tags = "@HomepageTest",
        dryRun = false,
        monochrome = true,
        plugin = {
        "html:target/cucumber-html-report.html",
         "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class TestRunners {
}

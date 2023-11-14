package testing;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "testing",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner extends AbstractTestNGCucumberTests{
}

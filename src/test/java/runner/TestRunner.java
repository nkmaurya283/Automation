package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\featureFiles\\Login.feature" },glue = {
        "stepdefinition"},plugin = { "pretty",
        "json:target/login.json" })
public class TestRunner {
}

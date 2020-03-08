package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports"},features = { "src\\test\\resources\\featureFiles\\Heathrow.feature" },glue = {
        "stepdefinition"},monochrome = true
        )
public class TestRunner  {
}

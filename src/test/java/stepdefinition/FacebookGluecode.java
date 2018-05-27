package stepdefinition;

import browserSettings.InitilizeWebDrivers;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.Home;
import propertyReader.PropertyFileReader;

public class FacebookGluecode  {

WebDriver driver;
PropertyFileReader rd=new PropertyFileReader();
InitilizeWebDrivers init;
Home page;

    @Before
    public void setUp() throws Exception
    {
        init=new InitilizeWebDrivers();
        driver= init.standAloneSetup("Firefox");
        page=new Home(driver);
    }
    @Given("^I open the Browser$")
    public void iOpenTheBrowser() throws Throwable {

      page.login();

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}

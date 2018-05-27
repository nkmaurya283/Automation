package browserSettings;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import propertyReader.PropertyFileReader;
import utility.ResourceHelper;

public class InitilizeWebDrivers {
    WebDriver driver;
    PropertyFileReader x=new PropertyFileReader();



    public  WebDriver standAloneSetup(String browserType) throws Exception
    {
       if(browserType.equalsIgnoreCase("Firefox")){

           DesiredCapabilities capabilities=new DesiredCapabilities();
           //capabilities = DesiredCapabilities.firefox();
           capabilities.setBrowserName("firefox");
           capabilities.setVersion("your firefox version");
           capabilities.setPlatform(Platform.WINDOWS);
           capabilities.setCapability("marionette", false);
           FirefoxOptions op=new FirefoxOptions(capabilities);
           System.setProperty("webdriver.gecko.driver", ResourceHelper.getResourcePath("drivers/geckodriver.exe"));
           driver=new FirefoxDriver(op);
           driver.manage().window().maximize();
           driver.get(x.getWebsite());

       }
        if(browserType.equalsIgnoreCase("chrome")){

            DesiredCapabilities capabilities=new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
            ChromeOptions op=new ChromeOptions();

            System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath(x.getChromeDriver()));
            driver=new ChromeDriver(capabilities);
            driver.manage().window().maximize();
            driver.get(x.getWebsite());

        }
       return driver;
    }
}

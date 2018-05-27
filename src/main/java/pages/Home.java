package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import propertyReader.PropertyFileReader;

public class Home {
    private WebDriver driver;
    private PropertyFileReader rd;


    @FindBy( xpath = ".//*[@id='email']" )
    private WebElement username;
    @FindBy( xpath = ".//*[@id='pass']" )
    private WebElement userpass;

    public Home(WebDriver driver){
        this.driver=driver;
        rd=new PropertyFileReader();
        PageFactory.initElements(driver,this);
    }
    public Home login(){
        username.sendKeys(rd.getUserName());
        userpass.sendKeys(rd.getPassword());
        return this;
    }
}

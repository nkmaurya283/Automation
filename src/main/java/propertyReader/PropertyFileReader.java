/**
 * rsr 
 *
 *Aug 6, 2016
 */
package propertyReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Level;

//import com.cucumber.framework.configuration.browser.BrowserType;
import interfaces.IconfigReader;
import utility.ResourceHelper;


/**
 * @author rsr
 *
 * Aug 6, 2016
 */
public class PropertyFileReader implements IconfigReader {
	
	private static Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();
		try {
			File src=new File("src\\main\\resources\\config\\config.properties");
			FileInputStream fis=new FileInputStream(src);
			prop.load(fis);
			//prop.load("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*public PropertyFileReader(String fileName) {

		prop = new Properties();
		try {
			prop.load(ResourceHelper
					.getResourcePathInputStream("configfile/"
							+ fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	public  String getUserName() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getWebsite() {
		return prop.getProperty("Website");
	}
	public String getChromeDriver() {
		return prop.getProperty("ChromeDriver");
	}



	//public BrowserType getBrowser() {
		//return BrowserType.valueOf(prop.getProperty("Browser"));
	//}
	


}

package qa.factory;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

	public static WebDriver webDriver;

	@BeforeSuite
	public void initializeDriver(){
		webDriver =Driver.getDriver();
		String baseUrl=("https://www.gittigidiyor.com/");
		webDriver.get(baseUrl);
		PropertyConfigurator.configure("C:\\Users\\asus\\Downloads\\PageObjectModel-master\\TestiniumProject\\src\\test\\resources\\log4j\\log4j.properties");
	}

	/*@AfterSuite
	public void tearDown() {
		webDriver.quit();
	}*/


}

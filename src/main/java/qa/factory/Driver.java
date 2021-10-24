package qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    public static WebDriver getDriver()
    {
        String browser="firefox";
        switch(browser){
            case "chrome": return  new ChromeDriver();
            case "internetExplorer": return new InternetExplorerDriver();
            case "safari": return new SafariDriver();
            case "opera": return new OperaDriver();
            default:
                return new FirefoxDriver();
        }

    }
}

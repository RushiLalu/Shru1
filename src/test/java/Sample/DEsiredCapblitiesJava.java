package Sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DEsiredCapblitiesJava {



    public static void main(String[] args) {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "77.0");
        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one
        capabilities.setCapability("build", "LambdaTestSampleApp");
        capabilities.setCapability("name", "LambdaTestJavaSample");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs

        capabilities.setCapability("selenium_version", "4.0.0-alpha-2");
        capabilities.setCapability("timezone", "UTC+05:30");
        capabilities.setCapability("geoLocation", "IN");
        capabilities.setCapability("chrome.driver", "78.0");
        try {
            //driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
            WebDriverManager.firefoxdriver().setup();

        } catch (Exception e) {
            System.out.println("Invalid grid URL");
            e.printStackTrace();
        }

    }
}

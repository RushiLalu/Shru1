package Sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxBonigrcia {

    public static void main(String[] args) {
        System.out.println("Working on Bonigracia Module");
        WebDriverManager.chromedriver().setup();

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "chrome");
        cap.setCapability("version", "102.1.0");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chromedriver.chromium.org/");
        System.out.println("FF Launched");


    }
}

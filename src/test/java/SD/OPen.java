package SD;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPen {

    WebDriver driver = null;

    @Given("Open the {string} and launch the application")
    public void open_the_and_launch_the_application(String url) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Url to be launched " + url);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/account/login?");
        driver.manage().window().maximize();

    }

    @When("Enter the {string} and {string}")
    public void enter_the_and(String user, String pass) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enter valid username  " + user);
        String user1 = user;
        String pass1 = pass;
        driver.findElement(By.xpath("//form[@autocomplete=\"on\"]//input[contains(@type,\"text\")]")).sendKeys(user1);
        System.out.println("User enter valid password  " + pass);
        driver.findElement(By.xpath("//form[@autocomplete=\"on\"]//input[contains(@type,\"password\")]")).sendKeys(pass1);

        System.out.println("Clicked Login");
        driver.findElement(By.xpath("//a[contains(text(),\"Privacy Policy\")]/parent::div/following-sibling::div//button[contains(@type,\"submit\")]")).
                click();
    }

    @Then("Click Login button")
    public void click_login_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }

}

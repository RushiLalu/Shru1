package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FF", glue = {"SD"},
        tags = "@Open",
        monochrome = true,stepNotifications = true)
public class MainRunner {
}

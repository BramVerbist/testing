import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "step_definitions",
        plugin =  {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json", "junit:target/cucumberreports/cucumber.xml"}
)
public class TestRunner {
}
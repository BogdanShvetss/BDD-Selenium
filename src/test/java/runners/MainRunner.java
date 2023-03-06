package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"classpath:features"}, glue = {"steps_definitions"},
        tags = "", dryRun = false, plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"})
public class MainRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}

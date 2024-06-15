package Runners;
import Util.BeforeSuite;
import Util.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/Features/",
        glue = "StepsDefinitions",
        tags = "@Regresionlogin",
        snippets = CucumberOptions.SnippetType.CAMELCASE )
@RunWith(RunnerPersonalizado.class)
public class RunnerLogin2 {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/Features/");
    }
}

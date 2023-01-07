package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Prashant\\eclipse-workspace\\nopcomdemo\\src\\test\\java\\Feature\\Login.feature",
glue="stepdef",
monochrome=true,
plugin={"pretty","html:test-output"}
)
public class Runner {

}

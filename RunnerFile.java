package cucumbersclassnote;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\admin\\eclipse-workspace\\seleniumcucumbertrianing\\src\\test\\java\\cucumbersclassnote\\login.feature"
,glue = "Cucumber", plugin= {"pretty","html:target/cucumber.html"})

public class RunnerFile {

}

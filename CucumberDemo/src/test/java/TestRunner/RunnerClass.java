package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeaturesFiles",glue= {"StepDefinations"},monochrome=true,
plugin= {"pretty","json:target/MyReports/report.json","junit:target/MyJunit/report.xml"},publish=true)
public class RunnerClass {

}

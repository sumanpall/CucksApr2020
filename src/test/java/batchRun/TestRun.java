package batchRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="aprdemo.feature",glue= {"defineStep"},tags= {"@RegressionTest"},
plugin="json:target/cucumber-report.json")
public class TestRun {
	
	

}

package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".///Features/Sample.feature",
		glue="stepDefinations",
		monochrome=true,
		//plugin= {"pretty,html:target/cucumber-reports.html"},
		dryRun=true
		
		
		)
public class TestRunner {

}

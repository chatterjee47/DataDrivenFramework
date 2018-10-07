package TestRunner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features="Features",
        tags="@FunctionalTest",
	//	glue={"StepDefinition","utility"},
		glue={"StepDefinition"},
		format = {"pretty"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 
		monochrome = true)

@Test
public class TestExecution extends AbstractTestNGCucumberTests{

}

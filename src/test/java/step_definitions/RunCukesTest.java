package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "classpath:features",
		features="C:\\Users\\user\\Downloads\\CucumberJVMExamples-master\\cucumberjvm-selenium-page-object\\src\\test\\resources\\features\\SigninSignoutContactUs.feature",
		plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
		tags = {}
		)
public class RunCukesTest{
	
}
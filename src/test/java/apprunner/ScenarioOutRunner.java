package apprunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\ScenarioOutline.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty"}
		
		
		
		)


public class ScenarioOutRunner extends AbstractTestNGCucumberTests

{
}

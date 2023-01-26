package apprunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			
			features = {"src\\test\\resources\\applicationtest\\LoginPage.feature"},
			
			glue = {"steps", "hooks"},
			
			plugin = {"pretty"},
			
			dryRun = true
			
			
			)
	public class LoginRunner extends AbstractTestNGCucumberTests {
		
	}

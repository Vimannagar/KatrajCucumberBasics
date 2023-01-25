package apprunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features =  {"src\\test\\resources\\applicationtest\\Profile.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"},
		
		tags = "not @smoke"
		
			
		)



public class ProfileRunner  extends AbstractTestNGCucumberTests   {

}

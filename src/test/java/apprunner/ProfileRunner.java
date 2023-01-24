package apprunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features =  {"src\\test\\resources\\applicationtest\\Profile.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"},
		
		tags = "@smoke or @functional"
		
			
		)



public class ProfileRunner  extends AbstractTestNGCucumberTests   {

}

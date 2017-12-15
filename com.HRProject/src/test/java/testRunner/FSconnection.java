package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class FSconnection {

	@CucumberOptions(
		       
	        features = "Features",
	        glue="com.StepDef"
	      
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}

	

}

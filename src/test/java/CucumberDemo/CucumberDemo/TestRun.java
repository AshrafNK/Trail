package CucumberDemo.CucumberDemo;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Following 3 lines are standard Cucumber options, change according to the 
//@CucumberOptions(features= {"src/test/resources/Features"} , format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
//glue = "Stepdep",
//tags = {"@Sanity"})


@CucumberOptions(features= {"C:\\Users\\Ashraf\\eclipse-workspace\\CucumberDemo\\Features"} , format = {"html:target/site/cucumber-pretty"},
glue = "Stepdefinition")//Do not write stepDefintion, instead right click on StepDefinition (under CucumberDemo.CucumberDemo),
//then Refactor to rename and copy StepDefinition and paste it here.
//tags = {"@Ashraf"})  

public class TestRun extends AbstractTestNGCucumberTests{

}


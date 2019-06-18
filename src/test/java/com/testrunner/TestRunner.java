package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features/LogIn.feature",
		glue="com.steps"
	    //tags="@CartContents"
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}

package com.simplebdd.CucumberConcept;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"pretty", "html:target/cucumber"},
		features = {"cucumber/features"}
	//	src/test/resources
		)
public class CucumberRunner {

}

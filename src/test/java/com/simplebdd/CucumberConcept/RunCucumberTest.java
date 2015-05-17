package com.simplebdd.CucumberConcept;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
    format = {"pretty", "html:target/cucumber"},
    glue = "cucumber.features",
    features = {"src/test/java/cucumber/features"}
)
public class RunCucumberTest {

}
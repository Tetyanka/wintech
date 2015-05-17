package cucumber.features;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.simplebdd.CucumberConcept.Helpers;
import com.simplebdd.CucumberConcept.PageElements;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindValuesAndPrintStepsDefinition {
	protected WebDriver driver = null;
	protected Helpers helper = null;
	public List<String> listOfEntities;
	public FindValuesAndPrintStepsDefinition() {
		super();
		driver = new FirefoxDriver();
		helper = new Helpers(driver);
	}
	
	@After
	public void afterScenario() {
		driver.close();
	}
	
	@Given("^I am on (.*) website$")
	public void openURL(String url) throws Throwable {
		driver.navigate().to(url);
	}

	@When("^I find all (.*)$")
	public void findElementsOnPage(String findItems) throws Throwable {
		listOfEntities = helper.getTextByCSS(PageElements.webSiteValues.get(findItems));
	}
	
	@Then("^I check that the list is not empty$")
	public void checkElementsPresented() throws Throwable {
		Assert.assertNotEquals("No elements were found on the page to meet the criteria",listOfEntities.size(), 0);
	}
	
	@Then("^I print it to the command line$")
	public void printListToCommandLine() throws Throwable {
		helper.printOutList(listOfEntities);
	}
}

package cucumber.features;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.simplebdd.CucumberConcept.Helpers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	protected WebDriver driver = null;
	protected Helpers helper = null;
	public static final String CSS_BETWAY_LIVE_GAMES = "#inplay-module .marketTitle a";
	public static final String CSS_GOOGLE_NEWS_HEADLINES = ".esc-lead-article-title .titletext";
	public StepDefinition() {
		super();
		driver = new FirefoxDriver();
		helper = new Helpers(driver);

	}

	@Given("^I am on (.*) website$")
	public void i_am_on_http_news_google_com_website(String url) throws Throwable {
		driver.navigate().to(url);
	}

	@When("^I write all headlines to file$")
	public void i_write_all_headlines_to_file() throws Throwable {
		List<String> headlineText = helper.getTextByCSS(CSS_GOOGLE_NEWS_HEADLINES);
		helper.printOutList(headlineText);
		//helper.printToFile(headlineText);
	}
	@When("^I write all live games to file$")
	public void i_write_all_live_games_to_file() throws Throwable {
		List<String> livegamesText = helper.getTextByCSS(CSS_BETWAY_LIVE_GAMES);
		helper.printOutList(livegamesText);
	}

	@Then("^File size should not be null$")
	public void file_size_should_not_be_null() throws Throwable {
		driver.close();
	}
}

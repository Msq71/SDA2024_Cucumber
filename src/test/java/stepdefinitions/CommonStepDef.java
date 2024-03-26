package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.time.Duration;


public class CommonStepDef {


    @Given("I open the browser")
    public void i_open_the_browser() {
        Driver.getDriver();
        System.out.println("Mohammed");
    }

    @Given("I am on the google homepage")
    public void i_am_on_the_google_homepage() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.google.com");
    }

    @When("I search for amazon on google")
    public void i_search_for_amazon_on_google() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().findElement(By.name("q")).sendKeys("amazon" + Keys.ENTER);
    }

    @When("I search for {string} on google")
    public void i_search_for_on_google(String searchKey) {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().findElement(By.name("q")).sendKeys(searchKey + Keys.ENTER);
    }

    @Then("I should see amazon on the results")
    public void i_should_see_amazon_on_the_results() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertFalse(Driver.getDriver().findElements(By.xpath("//*[contains(text(),'amazon')]")).isEmpty());
    }

    @Then("I should see {string} on the results")
    public void i_should_see_on_the_results(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertFalse(Driver.getDriver().findElements(By.xpath("//*[contains(text(),'" + string + "')]")).isEmpty());
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().close();
    }
}

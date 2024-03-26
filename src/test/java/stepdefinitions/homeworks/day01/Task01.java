package stepdefinitions.homeworks.day01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task01 {

    WebDriver driver = new ChromeDriver();

    @Given("user goes to google page")
    public void user_goes_to_google_page() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
    }

    @When("user searches for {string}")
    public void user_searches_for(String string) {
        driver.findElement(By.name("q")).sendKeys(string + Keys.ENTER);
    }

    @Then("test that hte page title contains the word {string}")
    public void test_that_hte_page_title_contains_the_word(String string) {
        Assert.assertTrue(driver.getTitle().contains(string));
    }

    @Then("close the page")
    public void close_the_page() {
        driver.close();
    }
}

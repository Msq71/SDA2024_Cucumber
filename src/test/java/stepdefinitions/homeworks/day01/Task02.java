package stepdefinitions.homeworks.day01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class Task02 {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("go to provided url page")
    public void go_to_provided_url_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @When("click on start button")
    public void click_on_start_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("button00")).click();
    }

    @When("click on one button")
    public void click_on_one_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement oneButton = driver.findElement(By.id("button01"));
        // wait.until(ExpectedConditions.visibilityOf(oneButton));
        oneButton.click();
    }

    @When("click on two button")
    public void click_on_two_button() {
        // Write code here that turns the phrase above into concrete actions
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("button02"))));
        WebElement twoButton = driver.findElement(By.id("button02"));
        twoButton.click();
    }

    @When("click on three button")
    public void click_on_three_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement threeButton = driver.findElement(By.id("button03"));
        // wait.until(ExpectedConditions.visibilityOf(threeButton));
        threeButton.click();
    }

    @Then("All Buttons Clicked message appears")
    public void all_buttons_clicked_message_appears() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(By.xpath("//p[.='All Buttons Clicked']")).isDisplayed());
    }

}

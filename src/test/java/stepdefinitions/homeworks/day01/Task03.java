package stepdefinitions.homeworks.day01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;


public class Task03 {

    @Given("go to task03 provided url page")
    public void go_to_task03_provided_url_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

    }

    @When("Enter first name as {string}")
    public void enter_first_name_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().findElement(By.id("firstname")).sendKeys(string);

    }

    @When("Last name as {string}")
    public void last_name_as(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().findElement(By.id("surname")).sendKeys(string);
    }

    @When("Age as {string}")
    public void age_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().findElement(By.id("age")).sendKeys(string);
    }

    @When("Select country as {string}")
    public void select_country_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        WebElement dropDown = Driver.getDriver().findElement(By.id("country"));
        Select select = new Select(dropDown);
        select.selectByValue(string);

    }

    @When("Click on submit")
    public void click_on_submit() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("I should see Validation Response message")
    public void i_should_see_validation_response_message() {
        // Write code here that turns the phrase above into concrete actions
        WebElement msg = Driver.getDriver().findElement(By.xpath("//*[.='Input Validation Response']"));
        Assert.assertTrue(msg.isDisplayed());
    }
}

package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class LoginSteps {

    WebDriver driver;

    @Given("the user is on the login page")
    public void open_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters username {string} and password {string}")
    public void enter_username_password(String username, String password) {
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys(username);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("clicks the login button")
    public void click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("the products page should be displayed")
    public void verify_products_page() {
        boolean isDisplayed = driver.findElement(By.className("inventory_list")).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }

    @Then("an error message should be displayed")
    public void verify_error_message() {
        WebElement error = driver.findElement(By.cssSelector("[data-test='error']"));
        Assert.assertTrue(error.isDisplayed());
        driver.quit();
    }
}
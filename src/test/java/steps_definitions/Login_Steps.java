package steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasePageObject;
import pageObjects.LoginPageObject;

public class Login_Steps extends BasePageObject {
    private LoginPageObject loginPageObject;

    public Login_Steps(LoginPageObject loginPageObject) {
        this.loginPageObject = loginPageObject;
    }

    @Given("I access the web driver university login page")
    public void i_access_the_web_driver_university_login_page() {
        loginPageObject.navigateToWebDriverUniversityLoginPage();
    }

    @When("I enter a username {word}")
    public void i_enter_a_username(String userName) {
        loginPageObject.setUsername(userName);
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
        loginPageObject.setPassword(password);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPageObject.clickOnLoginButton();
    }

    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
        loginPageObject.validateSuccessfulLoginMessage();
    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        loginPageObject.validateUnsuccessfulLoginMessage();
    }

    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String expectedMessage) {
        waitForAlertAndValidateText(expectedMessage);
    }
}
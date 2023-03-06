package steps_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasePageObject;
import pageObjects.ContactUsPageObject;

public class Contact_Us_Steps extends BasePageObject {
    private ContactUsPageObject contactUsPageObject;

    public Contact_Us_Steps(ContactUsPageObject contactUsPageObject) {
        this.contactUsPageObject = contactUsPageObject;
    }


    @Given("I access the web driver university contact us page")
    public void i_access_the_web_driver_university_contact_us_page() {
        contactUsPageObject.navigateToWebDriverUniversityContactUsPage();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUsPageObject.setUniqueFirstName();
    }

    @And("i enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUsPageObject.setUniqueLastName();
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUsPageObject.setUniqueEmailAddress();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUsPageObject.setUniqueComment();
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactUsPageObject.setSpecificFirstName(firstName);
    }

    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUsPageObject.setSpecificLastName(lastName);
    }

    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        contactUsPageObject.setSpecificEmailAddress(email);
    }

    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        contactUsPageObject.setSpecificComment(comment);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contactUsPageObject.clickOnSubmitButton();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUsPageObject.validateSuccessfullSubmissionMessage();
    }
}
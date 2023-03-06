package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static utils.GlobalVars.WEB_DRIVER_UNIVERSITY_URL;

public class ContactUsPageObject extends BasePageObject {
    private @FindBy(how = How.XPATH, using = "//input[@name='first_name']")
    WebElement firstNameTextField;

    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastNameTextField;

    private @FindBy(xpath = "//input[@name='email']")
    WebElement emailAddressTextField;

    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement commentTextField;

    private @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmissionMessage;

    public ContactUsPageObject() {
        super();
    }

    public void navigateToWebDriverUniversityContactUsPage() {
        navigateToUrl(WEB_DRIVER_UNIVERSITY_URL + "/Contact-Us/contactus.html");
    }


    public void setUniqueFirstName() {
        sendKeys(firstNameTextField, "name" + generateRandomNumber(5));
    }

    public void setUniqueLastName() {
        sendKeys(lastNameTextField, "last name" + generateRandomNumber(5));
    }

    public void setUniqueEmailAddress() {
        sendKeys(emailAddressTextField, generateRandomString(5) + "@gmail.com");
    }

    public void setUniqueComment() {
        sendKeys(commentTextField, generateRandomString(10));
    }

    public void setSpecificFirstName(String firstName) {
        sendKeys(firstNameTextField, firstName);
    }

    public void setSpecificLastName(String lastName) {
        sendKeys(lastNameTextField, lastName);
    }

    public void setSpecificEmailAddress(String emailAddress) {
        sendKeys(emailAddressTextField, emailAddress);
    }

    public void setSpecificComment(String comment) {
        sendKeys(commentTextField, comment);
    }

    public void clickOnSubmitButton() {
        waitForWebElementAndClick(submitButton);
    }


    public void validateSuccessfullSubmissionMessage() {
        waitFor(successfulSubmissionMessage);
        Assert.assertEquals(successfulSubmissionMessage.getText(), "Thank You for your Message!");
    }
}
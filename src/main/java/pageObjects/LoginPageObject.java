package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.GlobalVars.WEB_DRIVER_UNIVERSITY_URL;

public class LoginPageObject extends BasePageObject {
    private @FindBy(id = "text")
    WebElement usernameTextField;

    private @FindBy(id = "password")
    WebElement passwordTextField;

    private @FindBy(id = "login-button")
    WebElement loginButton;


    public LoginPageObject() {
        super();
    }

    public void navigateToWebDriverUniversityLoginPage() {
        navigateToUrl(WEB_DRIVER_UNIVERSITY_URL + "/Login-Portal/index.html");
    }


    public void setUsername(String username) {
        sendKeys(usernameTextField, username);
    }

    public void setPassword(String password) {
        sendKeys(passwordTextField, password);
    }

    public void clickOnLoginButton() {
        waitForWebElementAndClick(loginButton);
    }

    public void validateSuccessfulLoginMessage() {
        waitForAlertAndValidateText("validation succeeded");
    }

    public void validateUnsuccessfulLoginMessage() {
        waitForAlertAndValidateText("validation failed");
    }
}

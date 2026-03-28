package page;

import constants.CommonStrings;
import org.openqa.selenium.By;

public class LoginPage extends BaseActions {
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By successMessage = By.cssSelector("div.success");

    public void openPage() {
        openUrl(CommonStrings.HEROKU_APP + "/login");
    }

    public void fillForm(String username, String password) {
        typeToElement(usernameInput, username);
        typeToElement(passwordInput, password);
        clickElement(loginButton);
    }

    public void verifySuccessfulLogin() {
        waitForElement(successMessage);
    }
}

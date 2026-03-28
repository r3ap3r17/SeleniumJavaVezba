package cases;

import base.TestBase;
import org.junit.jupiter.api.Test;
import page.BaseActions;
import page.LoginPage;

public class LoginTest extends TestBase {
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.fillForm("tomsmith", "SuperSecretPassword!");
        loginPage.verifySuccessfulLogin();

    }
}

package cases;

import base.TestBase;
import org.junit.jupiter.api.Test;
import page.BaseActions;

public class LoginTest extends TestBase {
    @Test
    public void loginTest() throws InterruptedException {
        BaseActions actions = new BaseActions();
        actions.openUrl("https://the-internet.herokuapp.com/");
    }
}

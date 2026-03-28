package page;


import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseActions {
    private WebDriver driver;
    public BaseActions() {
        this.driver = DriverFactory.getDRIVER();
    }
}

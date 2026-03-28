package page;


import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseActions {
    private WebDriver driver;
    public BaseActions() {
        this.driver = DriverFactory.getDRIVER();
    }

    public void openUrl(String url) throws InterruptedException {
        driver.get(url);
        driver.wait(5000);
    }
}

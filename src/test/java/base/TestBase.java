package base;

import constants.enums.BrowserType;
import driver.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class TestBase {
    @BeforeEach
    public void setUp() {
        DriverFactory.initDriver(BrowserType.CHROME);
    }

    @AfterEach
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}


import constants.enums.BrowserType;
import driver.DriverFactory;


public class BaseTest {
    @Before
    public void setUp() {
        DriverFactory.initDriver(BrowserType.CHROME);
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}


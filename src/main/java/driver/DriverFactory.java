package driver;


import constants.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class DriverFactory {
    private static WebDriver DRIVER;

    public static WebDriver getDRIVER() {
        return DRIVER;
    }

    public static void setDRIVER(WebDriver DRIVER) {
        DriverFactory.DRIVER = DRIVER;
    }


    public static void initDriver(BrowserType browserType) {

        WebDriver driver = switch (browserType) {
            case CHROME -> createChromeDriver();
            case FIREFOX -> createFirefoxDriver();
        };
        setDRIVER(driver);
    }

    private static WebDriver createChromeDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private static WebDriver createFirefoxDriver() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static void quitDriver() {
        getDRIVER().quit();
    }

}



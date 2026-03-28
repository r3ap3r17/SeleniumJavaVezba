package page;


import constants.Timeouts;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseActions {
    private WebDriver driver;

    public BaseActions() {
        this.driver = DriverFactory.getDRIVER();
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public WebElement waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeouts.MEDIUM));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void typeToElement(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    public String getTextFromElement(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
}



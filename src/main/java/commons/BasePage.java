package commons;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    public By getByLocator(String inputLocator) {

        By outputLocator = null;
        if (inputLocator.startsWith("xpath=") || inputLocator.startsWith("Xpath=") || inputLocator.startsWith("XPATH=") || inputLocator.startsWith("xPath=") || inputLocator.startsWith("XPath=")) {
            outputLocator = By.xpath(inputLocator.substring(6));
        } else if (inputLocator.startsWith("class=") || inputLocator.startsWith("CLASS=") || inputLocator.startsWith("Class=")) {
            outputLocator = By.className(inputLocator.substring(6));
        } else if (inputLocator.startsWith("id=") || inputLocator.startsWith("ID=") || inputLocator.startsWith("Id=")) {
            outputLocator = By.id(inputLocator.substring(3));
        } else if (inputLocator.startsWith("css=") || inputLocator.startsWith("CSS=") || inputLocator.startsWith("Css=")) {
            outputLocator = By.cssSelector(inputLocator.substring(4));
        } else if (inputLocator.startsWith("name=") || inputLocator.startsWith("NAME=") || inputLocator.startsWith("Name=")) {
            outputLocator = By.name(inputLocator.substring(5));
        } else if (inputLocator.startsWith("tagname=") || inputLocator.startsWith("TAGNAME=") || inputLocator.startsWith("Tagname=")) {
            outputLocator = By.tagName(inputLocator.substring(8));
        } else throw new RuntimeException("inputLocator is not valid.");
        return outputLocator;
    }

    public String getDynamicLocator(String inputLocator, String... restParams) {
        return String.format(inputLocator, (Object[]) restParams);
    }

    public WebElement getElement(WebDriver driver, String locator) {
        return driver.findElement(getByLocator(locator));
    }


    public List<WebElement> getListElement(WebDriver driver, String locator) {
        return driver.findElements(getByLocator(locator));
    }

    public void clickToElement(WebDriver driver, String locator) {
        getElement(driver, locator).click();
    }

    public void clickToElement(WebDriver driver, String locator, String... restParams) {
        getElement(driver, getDynamicLocator(locator, restParams)).click();
    }

    public void senkeyToElement(WebDriver driver, String locator, String valueToSend) {
        getElement(driver, locator).clear();
        getElement(driver, locator).sendKeys(valueToSend);
    }

    public String getElementText(WebDriver driver, String locator) {
        return getElement(driver, locator).getText();
    }

    public boolean isElementDisplayed(WebDriver driver, String locator, String... restParams) {
        return getElement(driver, getDynamicLocator(locator, restParams)).isDisplayed();
    }

    public void waitForElementVisible(WebDriver driver, String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.SHORT_TIMEOUT)).until(ExpectedConditions.visibilityOfElementLocated(getByLocator(locator)));
    }

    public void waitForElementVisible(WebDriver driver, String locator, String... restParams) {
        new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.SHORT_TIMEOUT)).until(ExpectedConditions.visibilityOfElementLocated(getByLocator(getDynamicLocator(locator, restParams))));
    }

    public void waitForListElementInvisible(WebDriver driver, String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.SHORT_TIMEOUT)).until(ExpectedConditions.invisibilityOfAllElements(getListElement(driver, locator)));
    }

    public void waitForElementClickable(WebDriver driver, String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.SHORT_TIMEOUT)).until(ExpectedConditions.elementToBeClickable(getByLocator(locator)));
    }

    public void waitForElementClickable(WebDriver driver, String locator, String... restParams) {
        new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.SHORT_TIMEOUT)).until(ExpectedConditions.elementToBeClickable(getByLocator(getDynamicLocator(locator, restParams))));
    }

}

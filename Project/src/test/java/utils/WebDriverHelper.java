package utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {

    WebDriver driver;
    LoggerHandler LoggerHandler;

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
        LoggerHandler = new LoggerHandler();
    }

    /*
 * Method Name: waitForElementToBeVisible
 * Description: This method waits for a web element to become visible within the specified time limit.
 * Author: Chikka Anjani
 * Parameters: By locator, int time
 * Return Type: void
 */
 
 public void waitForElementToBeVisible(By locator, int time) {
    try {
        new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}


/*
* Method Name: waitForElementToBeClickable
* Description: This method waits for a web element to become clickable within the specified time limit.
* Author: Chikka Anjani
* Parameters: By locator, int time
* Return Type: void
*/

public void waitForElementToBeClickable(By locator, int time) {
    try {
        new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(locator));
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}


/**
* Method Name: clickOnElement
* Description: This method waits for an element to become visible and clickable before performing a click action.
* Author: Chikka Anjani
* Parameters: By locator
* Return Type: void
*/

public void clickOnElement(By locator) {
    try {
        waitForElementToBeVisible(locator, 5);
        waitForElementToBeClickable(locator, 5);
        driver.findElement(locator).click();
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}


/**
* Method Name: typeInElement
* Description: This method waits for an element to become visible before entering a provided string into it.
* Author: Chikka Anjani
* Parameters: By locator, String str
* Return Type: void
*/

public void typeInElement(By locator, String str) {
    try {
        waitForElementToBeVisible(locator, 5);
        driver.findElement(locator).sendKeys(str);
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}

/**
* Method Name: hoverOverElement
* Description: This method waits for an element to be visible and clickable, then hovers over it using Selenium Actions.
* Author: Chikka Anjani
* Parameters: By locator
* Return Type: void
*/

public void hoverOverElement(By locator) {
    try {
        waitForElementToBeVisible(locator, 5);
        waitForElementToBeClickable(locator, 5);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).perform();
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}

/*
* Method Name: enter
* Description: This method finds a specified element and simulates the "Enter" key press action on it.
* Author: Chikka Anjani
* Parameters: By locator
* Return Type: void
*/

public void enter(By locator) {
    try {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}

/*
* Method Name: scroll
* Description: This method finds a specified element and moves the cursor to it using the Actions class.
* Author: Chikka Anjani
* Parameters: By locator
* Return Type: void
*/

public void scroll(By locator) {
    try {
        waitForElementToBeVisible(locator, 5);
        WebElement elem = driver.findElement(locator);
        Actions action = new Actions(driver);
        action.moveToElement(elem).build().perform();
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}

   /*
* Method Name: switchWindow
* Description: This method switches the webdriver content to a different window
* Author: Chikka Anjani
* Parameters: NA
* Return Type: void
*/

public void switchWindow() {
    try {
        String currWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String win : windows) {
            if (!win.equals(currWindow)) {
                driver.switchTo().window(win);
                break;
            }
        }
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}
    /*
     * Method Name: getElementsByXPath
     * Description: This method retrieves a list of WebElements using the specified XPath.
     * Author: Chikka Anjani
     * Parameters: String str
     * Return Type: List<WebElement>
     */

public List<WebElement> getElementsByXPath(String str) {
    try {
        return driver.findElements(By.xpath(str));
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
        return null;
    }

}
    /*
     * Method Name: iterate
     * Description: This method iterates through a list of WebElements retrieved using an XPath and performs specific actions based on the element's text content.
     * Author: Chikka Anjani
     * Parameters: String str, String str1
     * Return Type: void
     */
public void iterate(String str, String str1) {
    try {
        List<WebElement> list1 = getElementsByXPath(str);
        for (WebElement ele : list1) {
            String text = ele.getText();
            LoggerHandler.logInfo(text);
            if (text.contains(str1)) {
                ele.click();
            }
        }
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}
    /*
     * Method Name: sortFilter
     * Description: This method applies a filter to a dropdown menu by selecting an option based on its visible text.
     * Author: Chikka Anjani
     * Parameters:  By locator, String str
     * Return Type: void
     */

public void sortFilter(By locator, String str) {
    try {
        WebElement ele = driver.findElement(locator);
        Select select = new Select(ele);
        select.selectByVisibleText(str);
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}

    /*
     * Method Name: dropdown
     * Description: This method retrieves all options from a dropdown menu, iterates through them, and selects the option that matches the specified text (case-insensitive).
     * Author: Chikka Anjani
     * Parameters: By locator , String str
     * Return Type: void
     */

public void dropdown(By locator, String str) {
    try {
        List<WebElement> list = new Select(driver.findElement(locator)).getOptions();
        for (WebElement ele : list) {
            String value = ele.getText();
            if (value.equalsIgnoreCase(str)) {
                new Select(driver.findElement(locator)).selectByVisibleText(value);
            }
        }
    } catch (Exception e) {
        LoggerHandler.logInfo(e.getMessage());
    }

}

/*
 * Method Name: navigateBack
 * Description: This method navigates the browser back to the previous page in the browsing history.
 * Author: Chikka Anjani
 * Parameters: None
 * Return Type: void
 */

 public void navigateBack(){
    driver.navigate().back();
}

/*
 * Method Name: alertDismiss
 * Description: This method switches the WebDriver's context to an alert and dismisses it.
 * Author: Chikka Anjani
 * Parameters: NA
 * Return Type: void
 */

public void alertDismiss(){
    Alert alert=driver.switchTo().alert();
    alert.dismiss();
}

}
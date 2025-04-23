package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/*
 * Class Name: Assertion
 * Author Name: Ramavathar
 * Description: Provides assertion methods for verifying text, partial text, URLs, and titles.
 */

public class Assertion {

    LoggerHandler LoggerHandler  = new LoggerHandler();

    /*
     * Method Name: verifyText
     * Author Name: Ramavathar
     * Description: Verifies that the text of a web element matches the expected value.
     * Return type: void
     * Param List:
     *   - By locator: The locator of the web element.
     *   - String expected: The expected text value.
     *     
     */

    public void verifyText(By locator, String expected) {
        try {
            WebElement ele = Base.driver.findElement(locator);
            String actual = ele.getText();
            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            LoggerHandler.logInfo(e.getMessage());
        }
    }

    /*
     * Method Name: verifyPartialText
     * Author Name: Ramavathar
     * Description: Verifies that the text of a web element contains the expected partial text.
     * Return type: void
     * Param List:
     *   - By locator: The locator of the web element.
     *   - String expected: The expected partial text value.     
     */

    public void verifyPartialText(By locator, String expected) {
        try {
            WebElement ele = Base.driver.findElement(locator);
            String actual = ele.getText();
            Assert.assertTrue(actual.contains(expected));
        } catch (Exception e) {
            LoggerHandler.logInfo(e.getMessage());
        }
    }

    /*
     * Method Name: verifyUrl
     * Author Name: Ramavathar
     * Description: Verifies that the current URL matches the expected URL.
     * Return type: void
     * Param List:
     *   - String expected: The expected URL.     
     */

    public void verifyUrl(String expected) {
        try {
            String actual = Base.driver.getCurrentUrl();
            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            LoggerHandler.logInfo(e.getMessage());
        }
    }

    /*
     * Method Name: verifyTitle
     * Author Name: Ramavathar
     * Description: Verifies that the title of the current page matches the expected title.
     * Return type: void
     * Param List:
     *   - String expected: The expected title.    
     */

    public void verifyTitle(String expected) {
        try {
            String actual = Base.driver.getTitle();
            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            LoggerHandler.logInfo(e.getMessage());
        }

    }

}

package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CambioLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CambioActions {

    WebDriverHelper helper;
    ExtentTest test;
    WebDriver driver;
    LoggerHandler loggerHandler;
    Assertion assertion;

    public CambioActions() {
        helper = new WebDriverHelper(Base.driver);
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();
    }

    /*
     * Method Name: clickOnCambio
     * Author Name: Sharmila Abdul
     * Description: Clicks on the "Cambio" section and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOnCambio(ExtentTest test) {
        try {
            helper.clickOnElement(CambioLocators.cambio);
            Screenshot.takeScreenshot("Cambio");
            loggerHandler.logInfo("Cambio clicked");
            test.info("Cambio clicked");
            test.log(Status.PASS, "Cambio clicked");
        } catch (Exception e) {
            Reporter.addScreenshot("Cambio", test, "Cambio click Failed", driver);
            loggerHandler.logError("Click on Cambio failed");
            test.info("Click on Cambio failed");
            test.log(Status.FAIL, "Click on Cambio failed");
        }
    }

    /*
     * Method Name: switchCambio
     * Author Name: Sharmila Abdul
     * Description: Switches to the Cambio window and sets timeouts.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void switchCambio(ExtentTest test) {
        try {
            helper.switchWindow();
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Screenshot.takeScreenshot("Window switch");
            loggerHandler.logInfo("Window switch");
            test.info("Window switch");
            test.log(Status.PASS, "Window switch");
        } catch (Exception e) {
            Reporter.addScreenshot("Switch window", test, "Window switch Failed", driver);
            loggerHandler.logError("Window switch failed");
            test.info("Window switch failed");
            test.log(Status.FAIL, "Window switch failed");
        }

    }

    /*
     * Method Name: verifyUrl
     * Author Name: Sharmila Abdul
     * Description: Verifies the URL of the Cambio page.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyUrl(ExtentTest test) {
        try {
            assertion.verifyUrl("https://cambiobikes.com/");
            Screenshot.takeScreenshot("VerifyUrl");
            loggerHandler.logInfo("Cambio url verified");
            test.info("Cambio url verified");
            test.log(Status.PASS, "Cambio url verified");
        } catch (Exception e) {
            Reporter.addScreenshot("Veirfy url failed", test, "Verify url Failed", driver);
            loggerHandler.logError("Verify url verification failed");
            test.info("Verify url verification failed");
            test.log(Status.FAIL, "Verify url verification failed");
        }

    }

    /*
     * Method Name: hoverOverBikes
     * Author Name: Sharmila Abdul
     * Description: Hovers over the "Bikes" section and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void hoverOverBikes(ExtentTest test) {
        try {
            helper.hoverOverElement(CambioLocators.Bikes);
            Screenshot.takeScreenshot("Bikes hover");
            loggerHandler.logInfo("Hovered over Bikes");
            test.info("Hovered over Bikes");
            test.log(Status.PASS, "Hovered over Bikes");
        } catch (Exception e) {
            Reporter.addScreenshot("Bikes hover", test, "Bikes hover Failed", driver);
            loggerHandler.logError("Hover over Bikes failed");
            test.info("Hover over Bikes failed");
            test.log(Status.FAIL, "Hover over Bikes failed");
        }
    }

    /*
     * Method Name: clickOnBestSellers
     * Author Name: Sharmila Abdul
     * Description: Clicks on the "Best Sellers" section and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOnBestSellers(ExtentTest test) {
        try {
            helper.clickOnElement(CambioLocators.BestSellers);
            Screenshot.takeScreenshot("Clicked on Best Sellers");
            loggerHandler.logInfo("Clicked on Best Sellers");
            test.info("Clicked on Best Sellers");
            test.log(Status.PASS, "Clicked on Best Sellers");
        } catch (Exception e) {
            Reporter.addScreenshot("Clicked Best Sellers", test, "Clicked Best Sellers Failed", driver);
            loggerHandler.logError("Best Sellers failed");
            test.info("Bikes click failed");
            test.log(Status.FAIL, "Bikes click failed");
        }

    }

    /*
     * Method Name: verifyProductCategories
     * Author Name: Sharmila Abdul
     * Description: Verifies the text of the "Product Categories" section.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyProductCategories(ExtentTest test) {
        try {
            assertion.verifyPartialText(CambioLocators.productCategories, "Product categories");
            Screenshot.takeScreenshot("Verify Product Categories");
            loggerHandler.logInfo("Verified Product Categories");
            test.info("Verified Product Categories");
            test.log(Status.PASS, "Verified Product Categories");
        } catch (Exception e) {
            Reporter.addScreenshot("Product Categories verification failed", test, "Product Categories verification Failed", driver);
            loggerHandler.logError("Product categories verification failed");
            test.info("Product Categories verification failed");
            test.log(Status.FAIL, "Product categories verification failed");
        }
    }

    /*
     * Method Name: verifyBestSellingBicycle
     * Author Name: Sharmila Abdul
     * Description: Verifies the text of the "Best Selling Bicycle" section.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyBestSellingBicycle(ExtentTest test) {
        try {
            assertion.verifyText(CambioLocators.best, "Best Selling Bicycle");
            Screenshot.takeScreenshot("Verify Best Selling Bicycle");
            loggerHandler.logInfo("Verified Best Sellling Bicycle");
            test.info("Verified Best Selling Bicycle");
            test.log(Status.PASS, "Verified Best Selling Bicycle");
        } catch (Exception e) {
            Reporter.addScreenshot("Best Selling Bicycle verification failed", test, "Best Selling Bicycle verification Failed", driver);
            loggerHandler.logError("Best Selling Bicycle verification failed");
            test.info("Best Selling Bicycle verification failed");
            test.log(Status.FAIL, "Best Selling Bicycle verification failed");
        }
    }

    /*
     * Method Name: clickOn26T
     * Author Name: Sharmila Abdul
     * Description: Clicks on the "26T" option and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOn26T(ExtentTest test) {
        try {
            helper.hoverOverElement(CambioLocators.size);
            helper.clickOnElement(CambioLocators.size);
            Screenshot.takeScreenshot("Clicked on 26T");
            loggerHandler.logInfo("Clicked on 26T");
            test.info("Clicked on 26T");
            test.log(Status.PASS, "Clicked on 26T");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on 26T", test, "Click on 26T Failed", driver);
            loggerHandler.logError("Click on 26T failed");
            test.info("Click on 26T failed");
            test.log(Status.FAIL, "Click on 26T failed");
        }

    }

    /*
     * Method Name: hoverOverFirstProduct
     * Author Name: Sharmila Abdul
     * Description: Hovers over the first product and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void hoverOverFirstProduct(ExtentTest test) {
        try {
            helper.hoverOverElement(CambioLocators.firstProduct);
            Screenshot.takeScreenshot("Clicked on First Product");
            loggerHandler.logInfo("Clicked on First Product");
            test.info("Clicked on First Product");
            test.log(Status.PASS, "Clicked on First Product");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on First Product", test, "Click on First Product failed", driver);
            loggerHandler.logError("Click on First Product failed");
            test.info("Click on First Product failed");
            test.log(Status.FAIL, "Click on First Product failed");
        }

    }

    /*
     * Method Name: clickOnSelectOptions
     * Author Name: Sharmila Abdul
     * Description: Clicks on the "Select Options" button and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOnSelectOptions(ExtentTest test) {
        try {
            helper.hoverOverElement(CambioLocators.selectOptions);
            helper.clickOnElement(CambioLocators.selectOptions);
            Screenshot.takeScreenshot("Clicked on Select Options");
            loggerHandler.logInfo("Clicked on Select Options");
            test.info("Clicked on Select Options");
            test.log(Status.PASS, "Clicked on Select Options");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on Select Options", test, "Click on Select Options failed", driver);
            loggerHandler.logError("Click on Select Options failed");
            test.info("Click on select options failed");
            test.log(Status.FAIL, "Click on Select Options failed");
        }

    }

    /*
     * Method Name: verifyTitle26T
     * Author Name: Sharmila Abdul
     * Description: Verifies the title contains "26T".
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyTitle26T(ExtentTest test) {
        try {
            assertion.verifyPartialText(CambioLocators.verify26T, "26T");
            Screenshot.takeScreenshot("Verify Title 26T");
            loggerHandler.logInfo("Verified 26T Title");
            test.info("Verified 26T Title");
            test.log(Status.PASS, "Verified 26T Title");
        } catch (Exception e) {
            Reporter.addScreenshot("26T verification failed", test, "26T verification Failed", driver);
            loggerHandler.logError("26T Title verification failed");
            test.info("26T Title verification failed");
            test.log(Status.FAIL, "26T Title verification failed");
        }

    }

    /*
     * Method Name: clickOnAddToCart
     * Author Name: Sharmila Abdul
     * Description: Clicks on the "Add to Cart" button and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOnAddToCart(ExtentTest test) {
        try {
            helper.hoverOverElement(CambioLocators.addtocart);
            Screenshot.takeScreenshot("Clicked on Add to Cart");
            helper.clickOnElement(CambioLocators.addtocart);
            loggerHandler.logInfo("Clicked on Add to Cart");
            test.info("Clicked on Add to Cart");
            test.log(Status.PASS, "Clicked on Add to Cart");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on Add to Cart", test, "Click on Add to Cart failed", driver);
            loggerHandler.logError("Click on Add to Cart failed");
            test.info("Click on Add to cart failed");
            test.log(Status.FAIL, "Click on Add to Cart failed");
        }

    }

    /*
     * Method Name: clickOnViewCart
     * Author Name: Sharmila Abdul
     * Description: Clicks on the "View Cart" button and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOnViewCart(ExtentTest test) {
        try {
            helper.hoverOverElement(CambioLocators.viewCart);
            helper.clickOnElement(CambioLocators.viewCart);
            Screenshot.takeScreenshot("Clicked on View Cart");
            loggerHandler.logInfo("Clicked on View Cart");
            test.info("Clicked on View Cart");
            test.log(Status.PASS, "Clicked on View Cart");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on View Cart", test, "Click on View Cart failed", driver);
            loggerHandler.logError("Click on View Cart failed");
            test.info("Click on View Cart Failed");
            test.log(Status.FAIL, "Click on View Cart failed");
        }
    }

    /*
     * Method Name: verifyCartTotals
     * Author Name: Sharmila Abdul
     * Description: Verifies the text of the "Cart Totals" section.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyCartTotals(ExtentTest test) {
        try {
            assertion.verifyText(CambioLocators.cartTotals, "CART TOTALS");
            Screenshot.takeScreenshot("Cart Totals");
            loggerHandler.logInfo("Verified CART TOTALS");
            test.info("Verified CART TOTALS");
            test.log(Status.PASS, "Verified CART TOTALS");
        } catch (Exception e) {
            Reporter.addScreenshot("Cart totals verification failed", test, "Cart Totals verification Failed", driver);
            loggerHandler.logError("CART TOTALS verification failed");
            test.info("Cart Totals Verification failed");
            test.log(Status.FAIL, "CART TOTALS verification failed");
        }

    }

    /*
     * Method Name: verifyProceedCheckOut
     * Author Name: Sharmila Abdul
     * Description: Verifies the text of the "Proceed to Checkout" button.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyProceedCheckOut(ExtentTest test) {
        try {
            assertion.verifyText(CambioLocators.proceedCheckOut, "PROCEED TO CHECKOUT");
            Screenshot.takeScreenshot("Cart");
            loggerHandler.logInfo("Verified Proceed to check out");
            test.info("Verified Proceed to check out");
            test.log(Status.PASS, "Verified Proceed to check out");
        } catch (Exception e) {
            loggerHandler.logError("Proceed to cart verification failed");
            test.info("Proceed to cart verification failed");
            test.log(Status.FAIL, "Proceed to cart verification failed");
        }

    }

    /*
     * Method Name: verifyFixedDeposit
     * Author Name: Sharmila Abdul
     * Description: Verifies the title contains "Non Cumulative Fixed Deposit".
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyFixedDeposit(ExtentTest test) {
        try {
            assertion.verifyTitle("Non Cumulative Fixed Deposit,");
            Screenshot.takeScreenshot("Fixed deposit");
            loggerHandler.logInfo("Verified Non Cumulative Fixed Deposit");
            test.info("Verified Non Cumulative Fixed Deposit");
            test.log(Status.PASS, "Verified Non Cumulative Fixed Deposit");
        } catch (AssertionError e) {
            Reporter.addScreenshot("Fixed Deposit verification failed", test, "Fixed deposit verification Failed", driver);
            loggerHandler.logError("Non Cumulative Fixed Deposit, not found in title");
            test.info("Fixed deposit verification failed");
            test.log(Status.FAIL, "Non Cumulative Fixed Deposit, not found in title");
        }

    }

    /*
     * Method Name: testCase10
     * Author Name: Sharmila Abdul
     * Description: Executes the complete test case for Cambio actions including
     * navigation, verification, and interactions.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void testCase10(ExtentTest test) {
        clickOnCambio(test);
        switchCambio(test);
        verifyUrl(test);
        hoverOverBikes(test);
        clickOnBestSellers(test);
        verifyProductCategories(test);
        verifyBestSellingBicycle(test);
        clickOn26T(test);
        hoverOverFirstProduct(test);
        clickOnSelectOptions(test);
        verifyTitle26T(test);
        clickOnAddToCart(test);
        clickOnViewCart(test);
        verifyCartTotals(test);
        verifyProceedCheckOut(test);
        verifyFixedDeposit(test);
    }

}

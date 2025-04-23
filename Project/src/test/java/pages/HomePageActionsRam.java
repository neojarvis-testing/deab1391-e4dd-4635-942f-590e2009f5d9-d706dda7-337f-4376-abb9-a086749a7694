package pages;
import org.openqa.selenium.WebDriver;
import utils.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HomePageLocatorsRam;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class HomePageActionsRam {
    WebDriver driver;
    WebDriverHelper helper;
    ExtentTest test;
    LoggerHandler loggerHandler;
    Assertion assertion;
 
    public HomePageActionsRam() {
        helper = new WebDriverHelper(Base.driver);
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();
    }
   
     /*
     * Method Name: hoverBicycle
     * Author Name: Ramavathar
     * Description: This method hover over the Bicycle Category
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void hoverBicycle(ExtentTest test) {
        try {
            helper.hoverOverElement(HomePageLocatorsRam.biycle);
            Screenshot.takeScreenshot("Hover Bicycle");
            loggerHandler.logInfo("Hovored on Bicycle");
            test.info("Hovored on Bicycle");
            test.log(Status.PASS, "Hovored over Bicycle");
        } catch (Exception e) {
            loggerHandler.logError("Hovored on Bicycle");
            test.log(Status.FAIL, "Hovored over Bicycle");
            Reporter.addScreenshot("Hovored bicycle", test, "hovered over bicycle", driver);
        }
 
    }
 
    /*
 * Method Name: clickElectric
 * Author Name: Ramavathar
 * Description: Clicks on the Electric Bicycle element, takes a screenshot.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickElectric(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.electric);
            Screenshot.takeScreenshot("Electric Bicycle");
            loggerHandler.logInfo("Click  on Electric  Bicycle");
            test.info("Click on  Electric Bicycle");
            test.log(Status.PASS, "Click on Electric Bicycle");
        } catch (Exception e) {
            loggerHandler.logError("Click  on Electric  Bicycle");
            test.log(Status.FAIL, "Click on Electric Bicycle");
            Reporter.addScreenshot("Electric bicycle", test, "Electric bicycle", driver);
        }
 
    }
 
    /*
 * Method Name: clickPrice
 * Author Name: Ramavathar
 * Description: Clicks on the Price element, captures a screenshot, logs the event, and updates the ExtentTest report.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickPrice(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.price);
            Screenshot.takeScreenshot("Price");
            loggerHandler.logInfo("Click  on Price");
            test.info("Click on  Price");
            test.log(Status.PASS, "Click on Price");
        } catch (Exception e) {
            loggerHandler.logError("Click  on price");
            test.log(Status.FAIL, "Click on price");
            Reporter.addScreenshot("Price", test, "Price", driver);
        }
    }
 
     /*
 * Method Name: clickReview
 * Author Name: Ramavathar
 * Description: Clicks on the Review element, logs the action, and registers the result in the ExtentTest object.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickReview(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.review);
            Screenshot.takeScreenshot("Review");
            loggerHandler.logInfo("Click  on Review");
            test.info("Click on  Review");
            test.log(Status.PASS, "Click on Review");
        } catch (Exception e) {
            loggerHandler.logError("Click  on Review");
            test.log(Status.FAIL, "Click on Review");
            Reporter.addScreenshot("Price", test, "Price", driver);
        }
 
    }
 
    /*
 * Method Name: clickReviewFirst
 * Author Name: Ramavathar
 * Description: Clicks on the first review option, logs the action, and updates the test report accordingly.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickReviewFirst(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.reviewFirst);
            Screenshot.takeScreenshot("ReviewFirst");
            loggerHandler.logInfo("Click  on ReviewFirst");
            test.info("Click on  ReviewFirst");
            test.log(Status.PASS, "click on ReviewFirst");
        } catch (Exception e) {
            loggerHandler.logError("Click  on ReviewFirst");
            test.log(Status.FAIL, "Click on ReviewFirst");
            Reporter.addScreenshot("ReviewFirst", test, "ReviewFirst", driver);
        }
 
    }
 
    /*
 * Method Name: clickSize
 * Author Name: Ramavathar
 * Description: Clicks on the Size element, logs the click, and records the action a pass/fail status in the test report.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickSize(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.size);
            Screenshot.takeScreenshot("Size");
            loggerHandler.logInfo("Click  on size");
            test.info("Click on  size");
            test.log(Status.PASS, "Click on size");
        } catch (Exception e) {
            loggerHandler.logError("Click  on size");
            test.log(Status.FAIL, "Click on size");
            Reporter.addScreenshot("Size", test, "size", driver);
        }
 
    }
 
    /*
 * Method Name: clickSizeFirst
 * Author Name: Ramavathar
 * Description: Clicks on the first size option available, logs the interaction, and updates the ExtentTest report.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickSizeFirst(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.sizeFirst);
            Screenshot.takeScreenshot("SizeFirst ");
            loggerHandler.logInfo("Click  on sizeFirst");
            test.info("Click on  sizeFirst");
            test.log(Status.PASS, "click on sizeFirst");
        } catch (Exception e) {
            loggerHandler.logError("Click  on size");
            test.log(Status.FAIL, "Click on size");
            Reporter.addScreenshot("Size", test, "Size", driver);
        }
 
    }
 
    /*
 * Method Name: clickHeight
 * Author Name: Ramavathar
 * Description: Clicks on the Height element, takes a screenshot, logs the event, and records the result in the ExtentTest object.
 * Return Type: void
 * Parameter List: ExtentTest test
 */    
 
    public void clickHeight(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.height);
            Screenshot.takeScreenshot("Height");
            loggerHandler.logInfo("Click  on Height");
            test.info("Click on  Height");
            test.log(Status.PASS, "Click on Height");
        } catch (Exception e) {
            loggerHandler.logError("Click  on Height");
            test.log(Status.FAIL, "Click on Height");
            Reporter.addScreenshot("Height", test, "Height", driver);
        }
 
    }
 
   /*
 * Method Name: clickHeightFirst
 * Author Name: Ramavathar
 * Description: Clicks on the first height option available, logs the click action, and updates the test report.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickHeightFirst(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.heightFirst);
            Screenshot.takeScreenshot("Height First");
            loggerHandler.logInfo("Click  on HeightFirst");
            test.info("Click on  HeightFirst");
            test.log(Status.PASS, "Click on HeightFirst");
        } catch (Exception e) {
            loggerHandler.logError("Click  on HeightFirst");
            test.log(Status.FAIL, "Click on HeightFirst");
            Reporter.addScreenshot("HeightFirst", test, "HeightFirst", driver);
        }
 
    }
 
   /*
 * Method Name: clickColor
 * Author Name: Ramavathar
 * Description: Clicks on the Color element, logs the action, and records the result in the ExtentTest report.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickColor(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.color);
            Screenshot.takeScreenshot("Color");
            loggerHandler.logInfo("Click  on Color");
            test.info("Click on  Color");
            test.log(Status.PASS, "Click on Color");
        } catch (Exception e) {
            loggerHandler.logError("Click  on Color");
            test.log(Status.FAIL, "Click on Color");
            Reporter.addScreenshot("Color", test, "Color", driver);
        }
    }
 
    /*
 * Method Name: clickFilter
 * Author Name: Ramavathar
 * Description: Clicks on the Clear Filter element to reset applied filters, logs the action, and updates the ExtentTest status.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickFilter(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.clear);
            Screenshot.takeScreenshot("Clear Filter");
            loggerHandler.logInfo("Click  on Filter");
            test.info("Click on  Filter");
            test.log(Status.PASS, "Click on Filter");
        } catch (Exception e) {
            loggerHandler.logError("Click  on Filter");
            test.log(Status.FAIL, "Click on Filter");
            Reporter.addScreenshot("Filter", test, "Filter", driver);
        }
 
    }
 
    /*
 * Method Name: clickCategories
 * Author Name: Ramavathar
 * Description: Clicks on the Categories element, logs the action, and updates the test report with the result.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
 
    public void clickCategories(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.categories);
            Screenshot.takeScreenshot("Categories");
            loggerHandler.logInfo("Click  on Categories");
            test.info("Click on  Categories");
            test.log(Status.PASS, "Click on Categories");
        } catch (Exception e) {
            loggerHandler.logError("Click  on Categories");
            test.log(Status.FAIL, "Click on Categories");
            Reporter.addScreenshot("Categories", test, "Categories", driver);
        }
 
    }
 
    /*
 * Method Name: clickBicycleCategory
 * Author Name: Ramavathar
 * Description: Clicks on the Bicycle Category element from the navigation, logs the action, and records the outcome.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void clickBicycleCategory(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.bCategory);
            Screenshot.takeScreenshot("Categories");
            loggerHandler.logInfo("Click  on Bicycle Categories");
            test.info("Click on Bicycle Categories");
            test.log(Status.PASS, "Click on Bicycle Categories");
        } catch (Exception e) {
            loggerHandler.logError("Click  on Bicycle Categories");
            test.log(Status.FAIL, "Click on Bicycle Categories");
            Reporter.addScreenshot("Bicycle Categories", test, "Bicycle Categories", driver);
        }
 
    }
 
     
/*
 * Method Name: verifyBicycleCategory
 * Author Name: Ramavathar
 * Description: Verifies that the text of the Bicycle Category element matches the expected string, logs the result, and takes a screenshot.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void verifyBicycleCategory(ExtentTest test) {
        try {
            assertion.verifyText(HomePageLocatorsRam.biCategory, "Bicycle Category");
            Screenshot.takeScreenshot("Bicycle Category");
            loggerHandler.logInfo("Text verified");
            test.info("Text verified");
            test.log(Status.PASS, "Text verified");
            Screenshot.takeScreenshot("bicycle");
        } catch (Exception e) {
            loggerHandler.logError("verify the text");
            test.log(Status.FAIL, "verify the text");
            Reporter.addScreenshot("verify text", test, "verify text", driver);
        }
 
    }
 
    /*
 * Method Name: test1
 * Author Name: Ramavathar
 * Description: Executes a series of test steps sequentially including hovering over the bicycle category and clicking various elements such as Electric, Price, Review, Size, Height, Color, Filter, and Category before verifying the displayed text.
 * Return Type: void
 * Parameter List: ExtentTest test
 */
 
    public void test1(ExtentTest test) {
        try {
            hoverBicycle(test);
            clickElectric(test);
            clickPrice(test);
            clickReview(test);
            clickReviewFirst(test);
            clickSize(test);
            clickSizeFirst(test);
            clickHeight(test);
            clickHeightFirst(test);
            clickColor(test);
            clickFilter(test);
            clickCategories(test);
            clickBicycleCategory(test);
            verifyBicycleCategory(test);
        } catch (Exception e) {
            loggerHandler.logError("custom test");
            test.log(Status.FAIL, "custom test");
            Reporter.addScreenshot("custom", test, "custom", driver);
        }
    }
 
}
 
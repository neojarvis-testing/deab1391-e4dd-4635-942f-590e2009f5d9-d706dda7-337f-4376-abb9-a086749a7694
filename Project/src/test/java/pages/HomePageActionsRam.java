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

    public HomePageActionsRam() {
        
        helper = new WebDriverHelper(Base.driver);
    }

    public void hoverBicycle(ExtentTest test) {
        try {
            helper.hoverOverElement(HomePageLocatorsRam.biycle); 
            //Screenshot.takeScreenshot("Hover Bicycle");
            LoggerHandler.logInfo("Hovored on Bicycle");
            test.info("Hovored on Bicycle");
            test.log(Status.PASS, "Hovored over Bicycle");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("Hovored on Bicycle");
            test.log(Status.FAIL, "Hovored over Bicycle");
            Reporter.addScreenshot("Hovored bicycle", test, "hovered over bicycle", driver);

        }

    }

    public void clickElectric(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.electric);
            Screenshot.takeScreenshot("Electric Bicycle");
            LoggerHandler.logInfo("click  on Electric  Bicycle");
            test.info("click on  Electric Bicycle");
            test.log(Status.PASS, "click on Electric Bicycle");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on Electric  Bicycle");
            test.log(Status.FAIL, "click on Electric Bicycle");
            Reporter.addScreenshot("Electric bicycle", test, "Electric bicycle", driver);
        }

    }

    public void clickPrice(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.price);
            Screenshot.takeScreenshot("Price");
            LoggerHandler.logInfo("click  on Price");
            test.info("click on  Price");
            test.log(Status.PASS, "click on Price");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on price");
            test.log(Status.FAIL, "click on price");
            Reporter.addScreenshot("price", test, "price", driver);
        }
    }

    public void clickReview(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.review);
            LoggerHandler.logInfo("click  on Review");
            test.info("click on  Review");
            test.log(Status.PASS, "click on Review");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on Review");
            test.log(Status.FAIL, "click on Review");
            Reporter.addScreenshot("price", test, "price", driver);
        }

    }

    public void clickReviewFirst(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.reviewFirst);
            LoggerHandler.logInfo("click  on ReviewFirst");
            test.info("click on  ReviewFirst");
            test.log(Status.PASS, "click on ReviewFirst");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on ReviewFirst");
            test.log(Status.FAIL, "click on ReviewFirst");
            Reporter.addScreenshot("ReviewFirst", test, "ReviewFirst", driver);
        }

    }

    public void clickSize(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.size);
            LoggerHandler.logInfo("click  on size");
            test.info("click on  size");
            test.log(Status.PASS, "click on size");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on size");
            test.log(Status.FAIL, "click on size");
            Reporter.addScreenshot("size", test, "size", driver);
        }

    }

    public void clickSizeFirst(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.sizeFirst);
            LoggerHandler.logInfo("click  on sizeFirst");
            test.info("click on  size");
            test.log(Status.PASS, "click on sizeFirst");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on size");
            test.log(Status.FAIL, "click on size");
            Reporter.addScreenshot("size", test, "size", driver);
        }

    }

    public void clickHeight(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.height);
            LoggerHandler.logInfo("click  on Height");
            test.info("click on  Height");
            test.log(Status.PASS, "click on Height");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on Height");
            test.log(Status.FAIL, "click on Height");
            Reporter.addScreenshot("Height", test, "Height", driver);
        }

    }

    public void clickHeightFirst(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.heightFirst);
            LoggerHandler.logInfo("click  on HeightFirst");
            test.info("click on  HeightFirst");
            test.log(Status.PASS, "click on HeightFirst");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on HeightFirst");
            test.log(Status.FAIL, "click on HeightFirst");
            Reporter.addScreenshot("HeightFirst", test, "HeightFirst", driver);
        }

    }

    public void clickColor(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.color);
            LoggerHandler.logInfo("click  on Color");
            test.info("click on  Color");
            test.log(Status.PASS, "click on Color");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on Color");
            test.log(Status.FAIL, "click on Color");
            Reporter.addScreenshot("Color", test, "Color", driver);
        }
    }

    public void clickFilter(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.clear);
            LoggerHandler.logInfo("click  on Filter");
            test.info("click on  Filter");
            test.log(Status.PASS, "click on Filter");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on Filter");
            test.log(Status.FAIL, "click on Filter");
            Reporter.addScreenshot("Filter", test, "Filter", driver);
        }

    }

    public void clickCategories(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.categories);
            LoggerHandler.logInfo("click  on Categories");
            test.info("click on  Categories");
            test.log(Status.PASS, "click on Categories");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on Categories");
            test.log(Status.FAIL, "click on Categories");
            Reporter.addScreenshot("Categories", test, "Categories", driver);
        }

    }

    public void clickBicycleCategory(ExtentTest test) {
        try {
            helper.clickOnElement(HomePageLocatorsRam.bCategory);
            LoggerHandler.logInfo("click  on Bicycle Categories");
            test.info("click on Bicycle Categories");
            test.log(Status.PASS, "click on Bicycle Categories");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("click  on Bicycle Categories");
            test.log(Status.FAIL, "click on Bicycle Categories");
            Reporter.addScreenshot("Bicycle Categories", test, "Bicycle Categories", driver);
        }

    }

    public void verifyText1(ExtentTest test) {
        try {
            Assertion.verifyText(HomePageLocatorsRam.biCategory, "Bicycle Category");
            LoggerHandler.logInfo("Text verified");
            test.info("Text verified");
            test.log(Status.PASS, "Text verified");
            Screenshot.takeScreenshot("bicycle");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("verify the text");
            test.log(Status.FAIL, "verify the text");
            Reporter.addScreenshot("verify text", test, "verify text", driver);
        }

    }

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
            verifyText1(test);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

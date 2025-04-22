package pages;

import java.time.Duration;

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

    public CambioActions()
    {
        helper = new WebDriverHelper(Base.driver);
    }

    public void clickOnCambio(ExtentTest test)
    {
        try {
            helper.clickOnElement(CambioLocators.cambio);
            Screenshot.takeScreenshot("Cambio");
			LoggerHandler.logInfo("Cambio clicked");
            test.info("Cambio clicked");
			test.log(Status.PASS,"Cambio clicked");
        } catch (Exception e) {
            Reporter.addScreenshot("Cambio", test, "Cambio click Failed", Base.driver);
			LoggerHandler.logError("Click on Cambio failed");
			test.log(Status.FAIL,"Click on Cambio failed");
        }   
    }

    public void switchCambio(ExtentTest test)
    {
        try {
            helper.switchWindow();
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Screenshot.takeScreenshot("Window switch");
			LoggerHandler.logInfo("Window switch");
            test.info("Window switch");
			test.log(Status.PASS,"Window switch");
        } catch (Exception e) {
            Reporter.addScreenshot("Switch window", test, "Window switch Failed", Base.driver);
			LoggerHandler.logError("Window switch failed");
			test.log(Status.FAIL,"Window switch failed");
        }
       
    }

    public void verifyUrl(ExtentTest test)
    {
        try {
            Assertion.verifyUrl("https://cambiobikes.com/");
            LoggerHandler.logInfo("Cambio url verified");
            test.info("Cambio url verified");
			test.log(Status.PASS,"Cambio url verified");
        } catch (Exception e) {
            LoggerHandler.logError("Cambio url verification failed");
			test.log(Status.FAIL,"Cambio url verification failed");
        }
        
    }

    public void hoverOverBikes(ExtentTest test)
    {
        try {
            helper.hoverOverElement(CambioLocators.Bikes);
            Screenshot.takeScreenshot("Bikes hover");
			LoggerHandler.logInfo("Hovered over Bikes");
            test.info("Hovered over Bikes");
			test.log(Status.PASS,"Hovered over Bikes");
        } catch (Exception e) {
            Reporter.addScreenshot("Bikes hover", test, "Bikes hover Failed", Base.driver);
			LoggerHandler.logError("Hover over Bikes failed");
			test.log(Status.FAIL,"Hover over Bikes failed");
        }
    }

    public void clickOnBestSellers(ExtentTest test)
    {
        try {
            helper.clickOnElement(CambioLocators.BestSellers);
            Screenshot.takeScreenshot("Clicked on Best Sellers");
			LoggerHandler.logInfo("Clicked on Best Sellers");
            test.info("Clicked on Best Sellers");
			test.log(Status.PASS,"Clicked on Best Sellers");
        } catch (Exception e) {
            Reporter.addScreenshot("Clicked Best Sellers", test, "Clicked Best Sellers Failed", Base.driver);
			LoggerHandler.logError("Best Sellers failed");
			test.log(Status.FAIL,"Bikes click failed");
        }
        
    }

    public void verifyProductCategories(ExtentTest test)
    {
        try {
            Assertion.verifyPartialText(CambioLocators.productCategories, "Product categories");
			LoggerHandler.logInfo("Verified Product Categories");
            test.info("Verified Product Categories");
			test.log(Status.PASS,"Verified Product Categories");
        } catch (Exception e) {
			LoggerHandler.logError("Product categories verification failed");
			test.log(Status.FAIL,"Product categories verification failed");
        }
    }

    public void verifyBestSellingBicycle(ExtentTest test)
    {
        try {
            Assertion.verifyText(CambioLocators.best,"Best Selling Bicycle");
            LoggerHandler.logInfo("Verified Best Sellling Bicycle");
            test.info("Verified Best Selling Bicycle");
			test.log(Status.PASS,"Verified Best Selling Bicycle");
        } catch (Exception e) {
            LoggerHandler.logError("Best Selling Bicycle verification failed");
			test.log(Status.FAIL,"Best Selling Bicycle verification failed");
        }
    }

    public void clickOn26T(ExtentTest test)
    {
        try {
            helper.hoverOverElement(CambioLocators.size);
            helper.clickOnElement(CambioLocators.size);
            Screenshot.takeScreenshot("Clicked on 26T");
			LoggerHandler.logInfo("Clicked on 26T");
            test.info("Clicked on 26T");
			test.log(Status.PASS,"Clicked on 26T");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on 26T", test, "Click on 26T Failed", Base.driver);
			LoggerHandler.logError("Click on 26T failed");
			test.log(Status.FAIL,"Click on 26T failed");
        }
        
    }
    public void hoverOverFirstProduct(ExtentTest test)
    {
        try {
            helper.hoverOverElement(CambioLocators.firstProduct);
            Screenshot.takeScreenshot("Clicked on First Product");
			LoggerHandler.logInfo("Clicked on First Product");
            test.info("Clicked on First Product");
			test.log(Status.PASS,"Clicked on First Product");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on First Product", test, "Click on First Product failed", Base.driver);
			LoggerHandler.logError("Click on First Product failed");
			test.log(Status.FAIL,"Click on First Product failed");
        }
        
    }
    public void clickOnSelectOptions(ExtentTest test)
    {
        try {
            helper.hoverOverElement(CambioLocators.selectOptions);
            helper.clickOnElement(CambioLocators.selectOptions);
            Screenshot.takeScreenshot("Clicked on Select Options");
			LoggerHandler.logInfo("Clicked on Select Options");
            test.info("Clicked on Select Options");
			test.log(Status.PASS,"Clicked on Select Options");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on Select Options", test, "Click on Select Options failed", Base.driver);
			LoggerHandler.logError("Click on Select Options failed");
			test.log(Status.FAIL,"Click on Select Options failed");
        }
        
    }
    
    public void verifyTitle26T(ExtentTest test)
    {
        try {
            Assertion.verifyPartialText(CambioLocators.verify26T, "26T");
            LoggerHandler.logInfo("Verified 26T Title");
            test.info("Verified 26T Title");
			test.log(Status.PASS,"Verified 26T Title");
        } catch (Exception e) {
            LoggerHandler.logError("26T Title verification failed");
			test.log(Status.FAIL,"26T Title verification failed");
        }
        
    }
    public void clickOnAddToCart(ExtentTest test)
    {
        try {
            helper.hoverOverElement(CambioLocators.addtocart);
            Screenshot.takeScreenshot("Clicked on Add to Cart");
            helper.clickOnElement(CambioLocators.addtocart);
			LoggerHandler.logInfo("Clicked on Add to Cart");
            test.info("Clicked on Add to Cart");
			test.log(Status.PASS,"Clicked on Add to Cart");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on Add to Cart", test, "Click on Add to Cart failed", Base.driver);
			LoggerHandler.logError("Click on Add to Cart failed");
			test.log(Status.FAIL,"Click on Add to Cart failed");
        }
        
    }
    public void clickOnViewCart(ExtentTest test)
    {
        try {
            helper.hoverOverElement(CambioLocators.viewCart);
            helper.clickOnElement(CambioLocators.viewCart);
            Screenshot.takeScreenshot("Clicked on View Cart");
			LoggerHandler.logInfo("Clicked on View Cart");
            test.info("Clicked on View Cart");
			test.log(Status.PASS,"Clicked on View Cart");
        } catch (Exception e) {
            Reporter.addScreenshot("Click on View Cart", test, "Click on View Cart failed", Base.driver);
			LoggerHandler.logError("Click on View Cart failed");
			test.log(Status.FAIL,"Click on View Cart failed");
        }
    }
    public void verifyCartTotals(ExtentTest test)
    {
        try {
            Assertion.verifyText(CambioLocators.cartTotals, "CART TOTALS");
            LoggerHandler.logInfo("Verified CART TOTALS");
            test.info("Verified CART TOTALS");
			test.log(Status.PASS,"Verified CART TOTALS");
        } catch (Exception e) {
            LoggerHandler.logError("CART TOTALS verification failed");
			test.log(Status.FAIL,"CART TOTALS verification failed");
        }
        
    }
    public void verifyProceedCheckOut(ExtentTest test)
    {
        try {
            Assertion.verifyText(CambioLocators.proceedCheckOut, "PROCEED TO CHECKOUT");
            Screenshot.takeScreenshot("Cart");
            LoggerHandler.logInfo("Verified Proceed to check out");
            test.info("Verified Proceed to check out");
			test.log(Status.PASS,"Verified Proceed to check out");
        } catch (Exception e) {
            LoggerHandler.logError("Proceed to cart verification failed");
			test.log(Status.FAIL,"Proceed to cart verification failed");
        }
        
    }

    public void verifyFixedDeposit(ExtentTest test)
    {
        try {
            Assertion.verifyTitle("Non Cumulative Fixed Deposit,");
            LoggerHandler.logInfo("Verified Non Cumulative Fixed Deposit");
            test.info("Verified Non Cumulative Fixed Deposit");
			test.log(Status.PASS,"Verified Non Cumulative Fixed Deposit");
        } catch (AssertionError e) {
            LoggerHandler.logError("Non Cumulative Fixed Deposit, not found in title");
            test.log(Status.FAIL,"Non Cumulative Fixed Deposit, not found in title");
        }
        
    }

    public void testCase10(ExtentTest test) 
    {
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

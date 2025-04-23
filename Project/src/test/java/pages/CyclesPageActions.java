package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
 
import uistore.CyclesPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class CyclesPageActions {
    public WebDriverHelper helper;
    public ExtentTest test;
    LoggerHandler loggerHandler;
    Assertion assertion;
   
    public CyclesPageActions(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();
    }
 
     /*
     * Method Name: verifyCycleText
     * Author Name: Chikka Anjani
     * Description: This method verifies the text Cycle.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
 
public void verifyCycleText(ExtentTest test){
    try{
        assertion.verifyText(CyclesPageLocators.cycles, "MTB Cycles (Single Speed)");
        loggerHandler.logInfo("Verified Cycle text");
        test.info("Verified Cycle Text");
        test.log(Status.PASS, "Verified Cycle text");
        Screenshot.takeScreenshot("Cycle");
    }catch(Exception e){
        Reporter.addScreenshot("Cycle", test, "Verified Cycle failed", Base.driver);
        loggerHandler.logError("Unable to Verify Cycle text");
        test.info("Unable to Verify Cycle text");
        test.log(Status.FAIL, "Unable to Verify Cycle text");
    }
}
 
  /*
     * Method Name: clickOnCyclux
     * Author Name: Chikka Anjani
     * Description: This method clicks on the cyclux element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
public void clickOnCyclux(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.cyclux, 10);
    helper.clickOnElement(CyclesPageLocators.cyclux);
    Screenshot.takeScreenshot("Cyclux");
    loggerHandler.logInfo("Clicked on Cyclux");
    test.info("Clicked on Cyclux");
    test.log(Status.PASS, "Clicked on Cyclux");
    }catch(Exception e){
        Reporter.addScreenshot("Cyclux", test, "Clicked on Cyclux failed", Base.driver);
        loggerHandler.logError("Unable to Click on Cyclux");
        test.info("Unable to Click on Cyclux");
        test.log(Status.FAIL, "Unable to Click on Cyclux");
    }
}
 
 /*
     * Method Name: verifyCycleUrl
     * Author Name: Chikka Anjani
     * Description: This method verifies the Cycle url.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
public void verifyCycleUrl(ExtentTest test){
    try{
    assertion.verifyUrl("https://avoncycles.com/brand/cyclux.html");
    helper.navigateBack();
    loggerHandler.logInfo("URL Verified");
    test.info("Verified URL");
    test.log(Status.PASS,"Verified URL");
    Screenshot.takeScreenshot("CycleURL");
    }catch(Exception e){
        Reporter.addScreenshot("CycleURL", test, "Verified CycleURL failed", Base.driver);
        loggerHandler.logError("Not Verified URL");
        test.info("Not Verified URL");
        test.log(Status.FAIL, "Not Verified URL");
    }
}
 
  /*
     * Method Name: clickOnAvon
     * Author Name: Chikka Anjani
     * Description: This method clicks on the avon element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
public void clickOnAvon(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.avon, 10);
    helper.clickOnElement(CyclesPageLocators.avon);
    Screenshot.takeScreenshot("Avon");
    loggerHandler.logInfo("Clicked on Avon");
    test.info("Clicked on Avon");
    test.log(Status.PASS, "Clicked on Avon");
    }catch(Exception e){
        Reporter.addScreenshot("Avon", test, "Clicked on avon failed", Base.driver);
        loggerHandler.logError("Unable to Click on Avon");
        test.info("Unable to Click on Avon");
        test.log(Status.FAIL, "Unable to Click on Avon");
    }
}
 
 /*
     * Method Name: verifyAvonUrl
     * Author Name: Chikka Anjani
     * Description: This method verifies the AvonUrl.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
public void verifyAvonUrl(ExtentTest test){
    try{
    assertion.verifyUrl("https://avoncycles.com/brand/avon.html");
    loggerHandler.logInfo("URL Verified");
    test.info("Verified URL");
    test.log(Status.PASS,"Verified URL");
    Screenshot.takeScreenshot("Avon");
    }catch(Exception e){
        Reporter.addScreenshot("Avon", test, "Verified Avon failed", Base.driver);
        loggerHandler.logError("Not Verified URL");
        test.info("Not Verified URL");
        test.log(Status.FAIL, "Not Verified URL");  
    }
}
 /*
     * Method Name: verifyPriceText
     * Author Name: Chikka Anjani
     * Description: This method verifies the price.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
public void verifyPriceText(ExtentTest test){
    try{
   assertion.verifyText(CyclesPageLocators.price, "PRICE");
   loggerHandler.logInfo("Verified Price text");
   test.info("Verified Price text");
   test.log(Status.PASS, "Verified Price text");
   Screenshot.takeScreenshot("Price");
    }catch(Exception e){
        Reporter.addScreenshot("Price", test, "Verified Price failed", Base.driver);
    loggerHandler.logError("Unable to Verify Price text");
    test.info("Unable to Verify Price text");
    test.log(Status.FAIL, "Unable to Verify Price text");
    }
}
 
  /*
     * Method Name: clickOnReview
     * Author Name: Chikka Anjani
     * Description: This method clicks on the review element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
public void clickOnReview(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.review, 10);
    helper.clickOnElement(CyclesPageLocators.review);
    Screenshot.takeScreenshot("Review");
    loggerHandler.logInfo("Clicked on Review");
    test.info("Clicked on Review");
    test.log(Status.PASS, "Clicked on Review");
    }catch(Exception e){
        Reporter.addScreenshot("Review", test, "Clicked on Review failed", Base.driver);
        loggerHandler.logError("Unable to Click on review");
        test.info("Unable to Click on review");
        test.log(Status.FAIL, "Unable to Click on review");
    }
}
 
  /*
     * Method Name: clickOnFirstReview
     * Author Name: Chikka Anjani
     * Description: This method clicks on the first option in review element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
public void clickOnFirstReview(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.firstreview, 10);
    helper.clickOnElement(CyclesPageLocators.firstreview);
    Screenshot.takeScreenshot("FirstReview");
    loggerHandler.logInfo("clicked on first option in review");
    test.info("clicked on first option in review");
    test.log(Status.PASS, "clicked on first option in review");
    }catch(Exception e){
        Reporter.addScreenshot("FirstReview", test, "clicked on firstreview failed", Base.driver);
        loggerHandler.logError("unable to click on first option in review");
        test.info("unable to click on first option in review");
        test.log(Status.FAIL, "unable to click on first option in review");
    }
}
 
  /*
     * Method Name: clickOnSize
     * Author Name: Chikka Anjani
     * Description: This method clicks on the size element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
public void clickOnSize(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.size, 10);
    helper.clickOnElement(CyclesPageLocators.size);
    Screenshot.takeScreenshot("Size");
    loggerHandler.logInfo("Clicked on Size");
    test.info("Clicked on Size");
    test.log(Status.PASS, "Clicked on Size");
    }catch(Exception e){
        Reporter.addScreenshot("Size", test, "Clicked on Size failed", Base.driver);
        loggerHandler.logError("Unable to Click on Size");
        test.info("Unable to Click on Size");
        test.log(Status.FAIL, "Unable to Click on Size");
    }
}
 
  /*
     * Method Name: clickOnFirstSize
     * Author Name: Chikka Anjani
     * Description: This method clicks on the first option in size element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
public void clickOnFirstsize(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.firstsize, 10);
    helper.clickOnElement(CyclesPageLocators.firstsize);
    Screenshot.takeScreenshot("FirstSize");
    loggerHandler.logInfo("Clicked on first option in size");
    test.info("Clicked on first option in size");
    test.log(Status.PASS, "Clicked on first option in size");
    }catch(Exception e){
        Reporter.addScreenshot("FirstSize", test, "Clicked on firstsize failed", Base.driver);
        loggerHandler.logError("Unable to click on first option in size");
        test.info("Unable to click on first option in size");
        test.log(Status.FAIL, "Unable to click on first option in size");
    }
}
 
  /*
     * Method Name: clickOnColor
     * Author Name: Chikka Anjani
     * Description: This method clicks on the color element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
public void clickOnColor(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.color, 10);
    helper.clickOnElement(CyclesPageLocators.color);
    Screenshot.takeScreenshot("Color");
    loggerHandler.logInfo("Clicked on color");
    test.info("Clicked on color");
    test.log(Status.PASS, "Clicked on color");
    }catch(Exception e){
        Reporter.addScreenshot("Color", test, "Clicked on color failed", Base.driver);
        loggerHandler.logError("Unable to click on color");
        test.info("Unable to click on color");        
        test.log(Status.FAIL, "Unable to click on color");
    }
}
 
  /*
     * Method Name: clickOnClear
     * Author Name: Chikka Anjani
     * Description: This method clicks on the clear element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
public void clickOnClear(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.clear, 10);
    helper.clickOnElement(CyclesPageLocators.clear);
    Screenshot.takeScreenshot("Clear");
    loggerHandler.logInfo("Clicked on Clear");
    test.info("Clicked on Clear");
    test.log(Status.PASS, "Clicked on Clear");
    }catch(Exception e){
        Reporter.addScreenshot("Clear", test, "clicked on clear failed", Base.driver);
        loggerHandler.logError("Unable to click on clear");
        test.info("Unable to click on clear");
        test.log(Status.FAIL, "Unable to click on clear");
    }
}
 
  /*
     * Method Name: clickOnSort
     * Author Name: Chikka Anjani
     * Description: This method clicks on the sort element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
public void clickOnSort(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.sort, 10);
    helper.clickOnElement(CyclesPageLocators.sort);
    Screenshot.takeScreenshot("Sort");
    loggerHandler.logInfo("Clicked on sort");
    test.info("Clicked on sort");
    test.log(Status.PASS, "Clicked on sort");
    }catch(Exception e){
        Reporter.addScreenshot("Sort", test, "Clicked on sort failed", Base.driver);
        loggerHandler.logError("Unable to click on sort");
        test.info("Unable to click on sort");
        test.log(Status.FAIL, "Unable to click on sort");
    }
}
 
  /*
     * Method Name: clickOnSortFirst
     * Author Name: Chikka Anjani
     * Description: This method clicks on the first option in sort element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
public void clickOnSortFirst(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.sortfirst, 10);
    helper.clickOnElement(CyclesPageLocators.sortfirst);
    Screenshot.takeScreenshot("SortFirst");
    loggerHandler.logInfo("Clicked on first option in sort");
    test.info("Clicked on first option in sort");
    test.log(Status.PASS, "Clicked on first option in sort");
    }catch(Exception e){
        Reporter.addScreenshot("SortFirst", test, "Clicked on sortfirst failed", Base.driver);
        loggerHandler.logError("Unable to click on first option in sort");
        test.info("Unable to click on first option in sort");
        test.log(Status.FAIL, "Unable to click on first option in sort");
    }
}
 
  /*
     * Method Name: clickOnFirstProd
     * Author Name: Chikka Anjani
     * Description: This method clicks on the first product
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
public void clickOnFirstProd(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.firstprod, 10);
    helper.clickOnElement(CyclesPageLocators.firstprod);
    Screenshot.takeScreenshot("FirstProd");
    loggerHandler.logInfo("Clicked on First product");
    test.info("Clicked on First product");
    test.log(Status.PASS, "Clicked on First product");
    }catch(Exception e){
        Reporter.addScreenshot("FirstProduct", test, "Clicked on firstproduct failed", Base.driver);
        loggerHandler.logError("Unable to click on First product");
        test.info("Unable to click on First product");
        test.log(Status.FAIL, "Unable to click on First product");
    }
}
 
 /*
     * Method Name: verifyAddText
     * Author Name: Chikka Anjani
     * Description: This method verifies the Add.
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
 
public void verifyAddText(ExtentTest test){
    try{
   assertion.verifyText(CyclesPageLocators.add, "ADD TO CART");
   loggerHandler.logInfo("verified add text");
   test.info("Verified add text");
   test.log(Status.PASS, "Verified add text");
   Screenshot.takeScreenshot("AddText");
   }catch(Exception e){
    Reporter.addScreenshot("AddText", test, "Verified AddText failed", Base.driver);
    loggerHandler.logError("Unable to verify add text");
    test.info("Unable to verify add text");
   test.log(Status.FAIL, "Unable to verify add text");
   }
}
 
 public void testCase9(){
    verifyCycleText(test);
    clickOnCyclux(test);
    verifyCycleUrl(test);
    clickOnAvon(test);
    verifyAvonUrl(test);
    verifyPriceText(test);
    clickOnReview(test);
    clickOnFirstReview(test);
    clickOnSize(test);
    clickOnFirstsize(test);
    clickOnColor(test);
    clickOnClear(test);
    clickOnSort(test);
    clickOnSortFirst(test);
    clickOnFirstProd(test);
    verifyAddText(test);
}
}
 
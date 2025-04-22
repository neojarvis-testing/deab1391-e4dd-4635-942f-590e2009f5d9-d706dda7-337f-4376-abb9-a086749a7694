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
   
    public CyclesPageActions(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
 
     /*
     * Method Name: verifyCycleText
     * Author Name: Chikka Anjani
     * Description: This method verifies the "Cycle" label
     * Return Type: NA
     * Parameter List:NA
     */
 
 
 
public void verifyCycleText(ExtentTest test){
    try{
        Assertion.verifyText(CyclesPageLocators.cycles, "MTB Cycles (Single Speed)");
        LoggerHandler.logInfo("verified Cycle text");
        test.info("Verified cycle text");
        test.log(Status.PASS, "Verified cycle text");
    }catch(Exception e){
        LoggerHandler.logError("unable to verify cycle text");
        test.log(Status.FAIL, "unable to verify cycle text");
    }
}
 
  /*
     * Method Name: clickOnCyclux
     * Author Name: Chikka Anjani
     * Description: This method clicks on the cyclux element
     * Return Type: NA
     * Parameter List:NA
     */
 
public void clickOnCyclux(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.cyclux, 10);
    helper.clickOnElement(CyclesPageLocators.cyclux);
    Screenshot.takeScreenshot("Cyclux");
    LoggerHandler.logInfo("clicked on cyclux");
    test.info("clicked on cyclux");
    test.log(Status.PASS, "clicked on cyclux");
    }catch(Exception e){
        Reporter.addScreenshot("Cyclux", test, "clicked on cyclux failed", Base.driver);
        LoggerHandler.logError("unable to click on cyclux");
        test.log(Status.FAIL, "unable to click on cyclux");
    }
}
 
 /*
     * Method Name: verifyCycleUrl
     * Author Name: Chikka Anjani
     * Description: This method verifies the "Cycle url" label
     * Return Type: NA
     * Parameter List:NA
     */
 
public void verifyCycleUrl(ExtentTest test){
    try{
    Assertion.verifyUrl("https://avoncycles.com/brand/cyclux.html");
    helper.navigateBack();
    LoggerHandler.logInfo("URL Verified");
    test.info("Verified URL");
    test.log(Status.PASS,"Verified URL");
    }catch(Exception e){
        LoggerHandler.logError("Not verified url");
        test.log(Status.FAIL, "Not verified url");
    }
}
 
  /*
     * Method Name: clickOnAvon
     * Author Name: Chikka Anjani
     * Description: This method clicks on the avon element
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void clickOnAvon(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.avon, 10);
    helper.clickOnElement(CyclesPageLocators.avon);
    Screenshot.takeScreenshot("Avon");
    LoggerHandler.logInfo("clicked on Avon");
    test.info("clicked on Avon");
    test.log(Status.PASS, "clicked on Avon");
    }catch(Exception e){
        Reporter.addScreenshot("Avon", test, "clicked on avon failed", Base.driver);
        LoggerHandler.logError("unable to click on avon");
        test.log(Status.FAIL, "unable to click on avon");
    }
}
 
 /*
     * Method Name: verifyAvonUrl
     * Author Name: Chikka Anjani
     * Description: This method verifies the "AvonUrl" label
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void verifyAvonUrl(ExtentTest test){
    try{
    Assertion.verifyUrl("https://avoncycles.com/brand/avon.html");
    LoggerHandler.logInfo("URL Verified");
    test.info("Verified URL");
    test.log(Status.PASS,"Verified URL");
    }catch(Exception e){
        LoggerHandler.logError("Not verified url");
        test.log(Status.FAIL, "Not verified url");  
    }
}
 /*
     * Method Name: verifyPriceText
     * Author Name: Chikka Anjani
     * Description: This method verifies the "price" label
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void verifyPriceText(ExtentTest test){
    try{
   Assertion.verifyText(CyclesPageLocators.price, "PRICE");
   LoggerHandler.logInfo("verified price text");
   test.info("Verified price text");
   test.log(Status.PASS, "Verified price text");
    }catch(Exception e){
    LoggerHandler.logError("unable to verify price text");
    test.log(Status.FAIL, "unable to verify price text");
    }
}
 
  /*
     * Method Name: clickOnReview
     * Author Name: Chikka Anjani
     * Description: This method clicks on the review element
     * Return Type: NA
     * Parameter List:NA
     */
 
public void clickOnReview(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.review, 10);
    helper.clickOnElement(CyclesPageLocators.review);
    Screenshot.takeScreenshot("Review");
    LoggerHandler.logInfo("clicked on Review");
    test.info("clicked on Review");
    test.log(Status.PASS, "clicked on Review");
    }catch(Exception e){
        Reporter.addScreenshot("Review", test, "clicked on review failed", Base.driver);
        LoggerHandler.logError("unable to click on review");
        test.log(Status.FAIL, "unable to click on review");
    }
}
 
  /*
     * Method Name: clickOnFirstReview
     * Author Name: Chikka Anjani
     * Description: This method clicks on the first option in review element
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void clickOnFirstReview(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.firstreview, 10);
    helper.clickOnElement(CyclesPageLocators.firstreview);
    Screenshot.takeScreenshot("FirstReview");
    LoggerHandler.logInfo("clicked on first option in review");
    test.info("clicked on first option in review");
    test.log(Status.PASS, "clicked on first option in review");
    }catch(Exception e){
        Reporter.addScreenshot("FirstReview", test, "clicked on firstreview failed", Base.driver);
        LoggerHandler.logError("unable to click on first option in review");
        test.log(Status.FAIL, "unable to click on first option in review");
    }
}
 
  /*
     * Method Name: clickOnSize
     * Author Name: Chikka Anjani
     * Description: This method clicks on the size element
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void clickOnSize(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.size, 10);
    helper.clickOnElement(CyclesPageLocators.size);
    Screenshot.takeScreenshot("Size");
    LoggerHandler.logInfo("clicked on Size");
    test.info("clicked on Size");
    test.log(Status.PASS, "clicked on Size");
    }catch(Exception e){
        Reporter.addScreenshot("Size", test, "clicked on size failed", Base.driver);
        LoggerHandler.logError("unable to click on Size");
        test.log(Status.FAIL, "unable to click on Size");
    }
}
 
  /*
     * Method Name: clickOnFirstSize
     * Author Name: Chikka Anjani
     * Description: This method clicks on the first option in size element
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void clickOnFirstsize(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.firstsize, 10);
    helper.clickOnElement(CyclesPageLocators.firstsize);
    Screenshot.takeScreenshot("FirstSize");
    LoggerHandler.logInfo("clicked on first option in size");
    test.info("clicked on first option in size");
    test.log(Status.PASS, "clicked on first option in size");
    }catch(Exception e){
        Reporter.addScreenshot("FirstSize", test, "clicked on firstsize failed", Base.driver);
        LoggerHandler.logError("unable to click on first option in size");
        test.log(Status.FAIL, "unable to click on first option in size");
    }
}
 
  /*
     * Method Name: clickOnColor
     * Author Name: Chikka Anjani
     * Description: This method clicks on the color element
     * Return Type: NA
     * Parameter List:NA
     */
 
public void clickOnColor(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.color, 10);
    helper.clickOnElement(CyclesPageLocators.color);
    Screenshot.takeScreenshot("Color");
    LoggerHandler.logInfo("clicked on color");
    test.info("clicked on color");
    test.log(Status.PASS, "clicked on color");
    }catch(Exception e){
        Reporter.addScreenshot("Color", test, "clicked on color failed", Base.driver);
        LoggerHandler.logError("unable to click on color");
        test.log(Status.FAIL, "unable to click on color");
    }
}
 
  /*
     * Method Name: clickOnClear
     * Author Name: Chikka Anjani
     * Description: This method clicks on the clear element
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void clickOnClear(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.clear, 10);
    helper.clickOnElement(CyclesPageLocators.clear);
    Screenshot.takeScreenshot("Clear");
    LoggerHandler.logInfo("clicked on Clear");
    test.info("clicked on Clear");
    test.log(Status.PASS, "clicked on Clear");
    }catch(Exception e){
        Reporter.addScreenshot("Clear", test, "clicked on clear failed", Base.driver);
        LoggerHandler.logError("unable to click on clear");
        test.log(Status.FAIL, "unable to click on clear");
    }
}
 
  /*
     * Method Name: clickOnSort
     * Author Name: Chikka Anjani
     * Description: This method clicks on the sort element
     * Return Type: NA
     * Parameter List:NA
     */
 
public void clickOnSort(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.sort, 10);
    helper.clickOnElement(CyclesPageLocators.sort);
    Screenshot.takeScreenshot("Sort");
    LoggerHandler.logInfo("clicked on sort");
    test.info("clicked on sort");
    test.log(Status.PASS, "clicked on sort");
    }catch(Exception e){
        Reporter.addScreenshot("Sort", test, "clicked on sort failed", Base.driver);
        LoggerHandler.logError("unable to click on sort");
        test.log(Status.FAIL, "unable to click on sort");
    }
}
 
  /*
     * Method Name: clickOnSortFirst
     * Author Name: Chikka Anjani
     * Description: This method clicks on the first option in sort element
     * Return Type: NA
     * Parameter List:NA
     */
 
public void clickOnSortFirst(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.sortfirst, 10);
    helper.clickOnElement(CyclesPageLocators.sortfirst);
    Screenshot.takeScreenshot("SortFirst");
    LoggerHandler.logInfo("clicked on first option in sort");
    test.info("clicked on first option in sort");
    test.log(Status.PASS, "clicked on first option in sort");
    }catch(Exception e){
        Reporter.addScreenshot("SortFirst", test, "clicked on sortfirst failed", Base.driver);
        LoggerHandler.logError("unable to click on first option in sort");
        test.log(Status.FAIL, "unable to click on first option in sort");
    }
}
 
  /*
     * Method Name: clickOnFirstProd
     * Author Name: Chikka Anjani
     * Description: This method clicks on the first product
     * Return Type: NA
     * Parameter List:NA
     */
 
public void clickOnFirstProd(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(CyclesPageLocators.firstprod, 10);
    helper.clickOnElement(CyclesPageLocators.firstprod);
    Screenshot.takeScreenshot("FirstProd");
    LoggerHandler.logInfo("clicked on First product");
    test.info("clicked on First product");
    test.log(Status.PASS, "clicked on First product");
    }catch(Exception e){
        Reporter.addScreenshot("FirstProduct", test, "clicked on firstproduct failed", Base.driver);
 
        LoggerHandler.logError("unable to click on First product");
        test.log(Status.FAIL, "unable to click on First product");
    }
}
 
 /*
     * Method Name: verifyAddText
     * Author Name: Chikka Anjani
     * Description: This method verifies the "Add" label
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void verifyAddText(ExtentTest test){
    try{
   Assertion.verifyText(CyclesPageLocators.add, "ADD TO CART");
   LoggerHandler.logInfo("verified add text");
   test.info("Verified add text");
   test.log(Status.PASS, "Verified add text");
   }catch(Exception e){
    LoggerHandler.logError("unable to verify add text");
   test.log(Status.FAIL, "unable to verify add text");
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
 
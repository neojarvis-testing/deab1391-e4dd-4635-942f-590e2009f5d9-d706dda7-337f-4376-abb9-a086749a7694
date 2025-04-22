package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.FitnessMachinesLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class FitnessMachineActions {
public ExtentTest test;
public WebDriverHelper helper;
public FitnessMachineActions(){
    helper=new WebDriverHelper(Base.driver);
}
public void clickOnAvonFitnessMachines(ExtentTest test){
     try{
    helper.waitForElementToBeVisible(FitnessMachinesLocators.avonfitness, 5);
    helper.clickOnElement(FitnessMachinesLocators.avonfitness);
    helper.switchWindow();
    Screenshot.takeScreenshot("Avon Fitness Machines");
    LoggerHandler.logInfo("Clicked on Avon Fitness Machines");
    test.log(Status.PASS,"Clicked on Avon Fitness Machines");
    }
    catch (Exception e) {
        Reporter.addScreenshot("Avon Fitness Machines", test, "click on Avon Fitness Machines failed", Base.driver);
        LoggerHandler.logError("Unable to click on Avon Fitness Machines");
        test.log(Status.FAIL,"Unable to click on Avon Fitness Machines");
      }
}
public void clickOnPopUp(ExtentTest test){
    try{
   helper.waitForElementToBeVisible(FitnessMachinesLocators.popUp, 5);
   helper.clickOnElement(FitnessMachinesLocators.popUp);
   Screenshot.takeScreenshot("Handling Enquiry from popup button");
   LoggerHandler.logInfo("Clicked on popup button");
   test.log(Status.PASS,"Clicked on popup button");
   }
   catch (Exception e) {
    Reporter.addScreenshot("Handling popup ", test, "click on popup failed", Base.driver);
    LoggerHandler.logError("Unable to click on popup button");
    test.log(Status.FAIL,"Unable to click on popup button");
     }
}
public void verifyAvonUrl(ExtentTest test){
    try{
   Assertion.verifyUrl("https://avonfitnessmachines.com/");
   LoggerHandler.logInfo("Verified Avon fitness machines url");
   test.log(Status.PASS,"Verified Avon fitness machines url");
   }
   catch (Exception e) {
    LoggerHandler.logError("Unable to verify Avon fitness machines url");
    test.log(Status.FAIL,"Unable to verify Avon fitness machines url ");
    }
}
public void hoverOnDomesticGym(ExtentTest test){
    try{
        helper.waitForElementToBeVisible(FitnessMachinesLocators.domesticGym, 5);
        helper.hoverOverElement(FitnessMachinesLocators.domesticGym);
        Screenshot.takeScreenshot("Domestic Gym");
        LoggerHandler.logInfo("Hovered on Domestic Gym");
        test.log(Status.PASS,"Hovered on Domestic Gym");
    }
    catch (Exception e) {
    Reporter.addScreenshot("Domestic Gym", test, "Hover on Domestic Gym failed", Base.driver);
    LoggerHandler.logError("Unable to hover on Domestic Gym");
    test.log(Status.FAIL,"Unable to hover on Domestic Gym");
          }
}
public void hoverOnCardioLine(ExtentTest test){
    try{
        helper.waitForElementToBeVisible(FitnessMachinesLocators.cardioLine, 5);
        helper.hoverOverElement(FitnessMachinesLocators.cardioLine);
        Screenshot.takeScreenshot("Cardioline");
   LoggerHandler.logInfo("Hovered on Cardioline");
   test.log(Status.PASS,"Hovered on Cardioline");
    }
        catch (Exception e) {
            Reporter.addScreenshot("Cardioline", test, "Hover on Cardioline failed", Base.driver);
            LoggerHandler.logError("Unable to hover on Cardioline ");
            test.log(Status.FAIL,"Unable to hover on Cardioline");
          }
}
public void clickOnTreadmills(ExtentTest test){
    try{
        helper.waitForElementToBeVisible(FitnessMachinesLocators.treadmills, 5);
        helper.clickOnElement(FitnessMachinesLocators.treadmills);
        Screenshot.takeScreenshot("Treadmills");
   LoggerHandler.logInfo("Clicked on Treadmills");
   test.log(Status.PASS,"Clicked on Treadmills");
    }
        catch (Exception e) {
            Reporter.addScreenshot("Treadmills", test, "Click on Treadmills failed", Base.driver);
            LoggerHandler.logError("Unable to click on Treadmills");
            test.log(Status.FAIL,"Unable to click on Treadmills");
          }
}
public void verifyDomesticUrl(ExtentTest test){
    try{
        Assertion.verifyUrl("https://avonfitnessmachines.com/domestic-treadmills");
        LoggerHandler.logInfo("Verified domestic treadmills url");
   test.log(Status.PASS,"Verified domestic treadmills url");
    }
    catch (Exception e) {
        LoggerHandler.logError("Unable to verify domestic treadmills url");
        test.log(Status.FAIL," Unable to verify domestic treadmills url");
      }
}
public void clickOnFirstProduct(ExtentTest test){
    try{
        helper.waitForElementToBeVisible(FitnessMachinesLocators.firstProduct, 5);
        // helper.scrollBy();
        helper.clickOnElement(FitnessMachinesLocators.firstProduct);
        Screenshot.takeScreenshot("FirstProduct");
   LoggerHandler.logInfo("Clicked on FirstProduct");
   test.log(Status.PASS,"Clicked on FirstProduct");
    }
        catch (Exception e) {
            Reporter.addScreenshot("FirstProduct", test, "Click on FirstProduct failed", Base.driver);
            LoggerHandler.logError("Unable to click on FirstProduct");
            test.log(Status.FAIL,"Unable to click on FirstProduct");
          }
}
public void verifySpecificationText(ExtentTest test){
    try{
    Assertion.verifyText(FitnessMachinesLocators.specifications,"Specifications");
    LoggerHandler.logInfo("verified text specifications");
   test.log(Status.PASS,"verified text specifications");
    }
    catch (Exception e) {
        LoggerHandler.logError("Unable to verify text specifications");
        test.log(Status.FAIL," Unable to verify text specifications");
      }
}
public void clickOnEnquireNow(ExtentTest test){
    try{
        helper.waitForElementToBeVisible(FitnessMachinesLocators.enquireNow, 5);
        helper.clickOnElement(FitnessMachinesLocators.enquireNow);
        Screenshot.takeScreenshot("EnquiryNow");
   LoggerHandler.logInfo("Clicked on EnquiryNow button");
   test.log(Status.PASS,"Clicked on EnquiryNow button");
    }
        catch (Exception e) {
            Reporter.addScreenshot("EnquiryNow", test, "Click on EnquiryNow button failed", Base.driver);
            LoggerHandler.logError("Unable to click on EnquiryNow button");
            test.log(Status.FAIL,"Unable to click on EnquiryNow button");
          }
}
public void verifyProductName(ExtentTest test){
    try{
        Assertion.verifyText(FitnessMachinesLocators.productName, "TM-104");
        LoggerHandler.logInfo("verified productname");
   test.log(Status.PASS,"verified productname");
    }
    catch (Exception e) {
        LoggerHandler.logError("Unable to verify productname");
        test.log(Status.FAIL,"Unable to verify productname");
      }
}
public void verifyProductModel(ExtentTest test){
    try{
        Assertion.verifyText(FitnessMachinesLocators.productModel, "TM-104");
        LoggerHandler.logInfo("verified productmodel");
   test.log(Status.PASS,"verified productmodel");
    }
    catch (Exception e) {
        LoggerHandler.logError("Unable to verify productmodel");
        test.log(Status.FAIL,"Unable to verify productmodel");
      }
}
public void inputName(ExtentTest test){
    try {
    helper.typeInElement(FitnessMachinesLocators.name,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 5, 1));
    LoggerHandler.logInfo("Entered name in input field");
    test.log(Status.PASS,"Entered name in input field");
} catch (Exception e) {
    Reporter.addScreenshot("Name", test, "Failed to input name", Base.driver);
    LoggerHandler.logError("Failed to input name in name field");
    test.log(Status.FAIL,"Failed to input name in name field");
}
}
public void inputEmail(ExtentTest test){
    try {
    helper.typeInElement(FitnessMachinesLocators.email,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 6, 0));
    LoggerHandler.logInfo("Entered email in input field");
    test.log(Status.PASS,"Entered email in input field");
 
} catch (Exception e) {
    Reporter.addScreenshot("Email", test, "Failed to input Email", Base.driver);
    LoggerHandler.logError("Failed to input Email");
    test.log(Status.FAIL,"Failed to input Email");
}
}
public void inputPhone(ExtentTest test){
    try {
    helper.typeInElement(FitnessMachinesLocators.phoneNumber,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 6, 1));
    LoggerHandler.logInfo("Entered phone number in input field");
    test.log(Status.PASS,"Entered phone number in input field");
} catch (Exception e) {
    Reporter.addScreenshot("Phone number", test, "Failed to input phone number", Base.driver);
    LoggerHandler.logError("Failed to input phone number");
    test.log(Status.FAIL,"Failed to input phone number");
}
}
public void inputCity(ExtentTest test){
    try {
    helper.typeInElement(FitnessMachinesLocators.city,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 7, 0));
    LoggerHandler.logInfo("Entered city in input field");
    test.log(Status.PASS,"Entered city in input field");
} catch (Exception e) {
    Reporter.addScreenshot("City", test, "Failed to input city", Base.driver);
    LoggerHandler.logError("Failed to input city");
    test.log(Status.FAIL,"Failed to input city");
}
}
public void clickOnSubmit(ExtentTest test){
    try{
        helper.waitForElementToBeVisible(FitnessMachinesLocators.submit, 5);
        helper.clickOnElement(FitnessMachinesLocators.submit);
        Screenshot.takeScreenshot("Submit");
        LoggerHandler.logInfo("Clicked on Submit button");
        test.log(Status.PASS,"Clicked on Submit button");
       
    }
        catch (Exception e) {
            Reporter.addScreenshot("Submit", test, "Click on Submit button failed", Base.driver);
            LoggerHandler.logError("Unable to click on Submit button");
            test.log(Status.FAIL,"Unable to click on Submit button");
          }
}
public void captureScreenshot(ExtentTest test){
    Screenshot.takeScreenshot("Avon Fitness Enquiry form");
    Reporter.addScreenshot("Avon Fitness Enquiry form", test,"captured screenshot successfully", Base.driver);
}
public void testFitnessMachines(ExtentTest test){
    clickOnAvonFitnessMachines(test);
    verifyAvonUrl(test);
    clickOnPopUp(test);
    hoverOnDomesticGym(test);
    hoverOnCardioLine(test);
    clickOnTreadmills(test);
    // verifyDomesticUrl();
    clickOnFirstProduct(test);
    //verifySpecificationText();
    clickOnEnquireNow(test);
    //verifyProductName();
    //verifyProductModel();
    inputName(test);
    inputEmail(test);
    inputPhone(test);
    inputCity(test);
    clickOnSubmit(test);
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    captureScreenshot(test);
}
}

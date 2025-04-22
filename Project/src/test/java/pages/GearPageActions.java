package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.GearPageLocators;
import utils.WebDriverHelper;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
 
public class GearPageActions {
public ExtentTest test;
public WebDriverHelper helper;
public GearPageActions(){
    helper=new WebDriverHelper(Base.driver);
}
public void clickOnAccept(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(GearPageLocators.accept, 5);
    helper.clickOnElement(GearPageLocators.accept);
     Screenshot.takeScreenshot("Accept button");
   LoggerHandler.logInfo("Clicked on Accept button");
   test.log(Status.PASS,"Clicked on Accept button");
    }
    catch (Exception e) {
        Reporter.addScreenshot("Accept", test, "Click on Accept button failed", Base.driver);
            LoggerHandler.logError("Unable to click on Accept button");
            test.log(Status.FAIL,"Unable to click on Accept button");
      }
}
public void clickOnSearchIcon(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(GearPageLocators.searchIcon, 5);
    helper.clickOnElement(GearPageLocators.searchIcon);
    Screenshot.takeScreenshot("SearchIcon");
    LoggerHandler.logInfo("SearchIcon");
    test.log(Status.PASS,"Clicked on SearchIcon");
    }
    catch (Exception e) {
        Reporter.addScreenshot("SearchIcon", test, "Click on SearchIcon failed", Base.driver);
        LoggerHandler.logError("Unable to click on SearchIcon");
        test.log(Status.FAIL,"Unable to click on SearchIcon");
      }
}
public void clickOnSearchBar(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(GearPageLocators.searchBar, 5);
    helper.clickOnElement(GearPageLocators.searchBar);
    Screenshot.takeScreenshot("SearchBar");
    LoggerHandler.logInfo("Clicked on SearchBar");
    test.log(Status.PASS,"Clicked on SearchBar");
    }
    catch (Exception e) {
        Reporter.addScreenshot("SearchBar", test, "Click on SearchBar failed", Base.driver);
        LoggerHandler.logError("Unable to click on SearchBar");
        test.log(Status.FAIL,"Unable to click on SearchBar");
      }
 
}
public void sendData(ExtentTest test){
   
try {
    helper.typeInElement(GearPageLocators.searchBar,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 0, 0));
    helper.enter(GearPageLocators.searchBar);
    LoggerHandler.logInfo("Entered data in SearchBar");
    test.log(Status.PASS,"Entered data in SearchBar");
} catch (Exception e) {
    Reporter.addScreenshot("SearchBar", test, "Failed to enter data", Base.driver);
    LoggerHandler.logError("Unable to enter data in SearchBar");
    test.log(Status.FAIL,"Unable to enter data in SearchBar");
}
}
public void clickOnFirstProduct(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(GearPageLocators.firstProduct, 5);
    helper.clickOnElement(GearPageLocators.firstProduct);
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
public void clickOnBuyNow(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(GearPageLocators.buyNow, 5);
    helper.clickOnElement(GearPageLocators.buyNow);
    Screenshot.takeScreenshot("BuyNow");
    LoggerHandler.logInfo("Clicked on BuyNow");
    test.log(Status.PASS,"Clicked on BuyNow");
    }
    catch (Exception e) {
        Reporter.addScreenshot("BuyNow", test, "Click on BuyNow failed", Base.driver);
        LoggerHandler.logError("Unable to click on BuyNow");
        test.log(Status.FAIL,"Unable to click on BuyNow");
      }
}
public void enterFirstName(ExtentTest test){
    try {
        helper.typeInElement(GearPageLocators.firstName,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 1, 0));
        helper.enter(GearPageLocators.firstName);
        LoggerHandler.logInfo("Entered FirstName");
    test.log(Status.PASS,"Entered FirstName");
    } catch (Exception e) {
        LoggerHandler.logError("Unable to enter FirstName");
        test.log(Status.FAIL,"Unable to enter FirstName");
    }
}
public void enterLastName(ExtentTest test){
    try {
        helper.typeInElement(GearPageLocators.lastName,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 1, 1));
        helper.enter(GearPageLocators.lastName);
        LoggerHandler.logInfo("Entered LastName");
        test.log(Status.PASS,"Entered LastName");
    } catch (Exception e) {
        LoggerHandler.logError("Unable to enter LastName");
        test.log(Status.FAIL,"Unable to enter LastName");
    }
}
public void enterEmail(ExtentTest test){
    try {
        helper.typeInElement(GearPageLocators.email,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 2, 0));
        helper.enter(GearPageLocators.email);
    } catch (Exception e) {
        e.getMessage();
      }
}
public void enterPhoneNumber(ExtentTest test){
    try {
        helper.typeInElement(GearPageLocators.phoneNumber,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 2, 1));
        helper.enter(GearPageLocators.phoneNumber);
    } catch (Exception e) {
        e.getMessage();
      }  
}
public void enterPostCode(ExtentTest test){
    try {
        helper.typeInElement(GearPageLocators.postcode,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 3, 0));
        helper.enter(GearPageLocators.postcode);
    } catch (Exception e) {
        e.getMessage();
      }
}
public void enterState(ExtentTest test){
    try {
        helper.typeInElement(GearPageLocators.state,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 3, 1));
        helper.enter(GearPageLocators.state);
    } catch (Exception e) {
        e.getMessage();
      }
}
public void enterCity(ExtentTest test){
    try {
        helper.typeInElement(GearPageLocators.city,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 4, 0));
        helper.enter(GearPageLocators.city);
    } catch (Exception e) {
        e.getMessage();
      }
}
public void enterAddress(ExtentTest test){
    try {
        helper.typeInElement(GearPageLocators.address,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 4, 1));
        helper.enter(GearPageLocators.address);
    } catch (Exception e) {
        e.getMessage();
      }
}
public void enterCouponCode(ExtentTest test){
    try {
        helper.typeInElement(GearPageLocators.coupon,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 5, 0));
        helper.enter(GearPageLocators.coupon);
    }catch (Exception e) {
        e.getMessage();
      }
}
public void clickOnApply(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(GearPageLocators.apply, 5);
    helper.clickOnElement(GearPageLocators.apply);
    }
    catch (Exception e) {
        e.getMessage();
      }
}
public void clickOnRazorPay(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(GearPageLocators.razorPay, 5);
    helper.clickOnElement(GearPageLocators.razorPay);
    }
    catch (Exception e) {
        e.getMessage();
      }
}
public void clickOnConfirmCheckOut(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(GearPageLocators.confirmCheckout, 5);
    helper.clickOnElement(GearPageLocators.confirmCheckout);
    }
    catch (Exception e) {
        e.getMessage();
      }
}
public void clickOnProceedToPayment(ExtentTest test){
    try{
    helper.waitForElementToBeVisible(GearPageLocators.proceedToPayment, 5);
    helper.clickOnElement(GearPageLocators.proceedToPayment);
    }
    catch (Exception e) {
        e.getMessage();
      }
}
public void testGear(ExtentTest test){
    clickOnAccept(test);
    clickOnSearchIcon(test);
    clickOnSearchBar(test);
    sendData(test);
    clickOnFirstProduct(test);
    clickOnBuyNow(test);
    enterFirstName(test);
    enterLastName(test);
    enterEmail(test);
    enterPhoneNumber(test);
    enterPostCode(test);
    enterState(test);
    enterCity(test);
    enterAddress(test);
    enterCouponCode(test);
    clickOnApply(test);
    clickOnRazorPay(test);
    clickOnConfirmCheckOut(test);
    clickOnProceedToPayment(test);
}
}
 

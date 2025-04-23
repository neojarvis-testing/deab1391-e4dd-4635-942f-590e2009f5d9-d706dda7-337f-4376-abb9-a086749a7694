package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.HomePageLocatorsVenkat;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class HomePageActionsVenkat {
    WebDriverHelper helper;
    ExtentTest test;
    LoggerHandler loggerHandler;
    Assertion assertion;
 
    /*
     * Constructor Name: HomePageActionsVenkat
     * Author Name: Venkatanarayana
     * Description: This constructor initializes the ExtentTest instance and WebDriverHelper.
     * Parameter List: ExtentTest test - The ExtentTest instance for reporting.
     */
    public HomePageActionsVenkat(ExtentTest test){
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();
    }
 
    /*
     * Method Name: hoverOnCycleByBrand
     * Author Name: Venkatanarayana
     * Description: This method hovers over "Cycle By Brand".
     * Return Type: void
     * Parameter List: NA
     */
    public void hoverOnCycleByBrand(){
        try {
            helper.hoverOverElement(HomePageLocatorsVenkat.cycleByBrand);
            Screenshot.takeScreenshot("CycleByBrand");
            loggerHandler.logInfo("Hovered on cycleByBrand");
            test.info("Hovered on cycleBrand");
            test.log(Status.PASS, "Hovered on cycleByBrand");
        } catch (Exception e) {
            Reporter.addScreenshot("CycleByBrand", test, "CycleByBrand button hover Failed", Base.driver);
            loggerHandler.logError("Hover on cycleBrand failed");
            test.log(Status.FAIL, "Hover on cycleBrand failed");
        }
    }
 
    /*
     * Method Name: clickOnAvon
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Avon" element.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnAvon(){
        try {
            helper.clickOnElement(HomePageLocatorsVenkat.avon);
            Screenshot.takeScreenshot("Avon");
            loggerHandler.logInfo("Clicked on Avon");
            test.info("Clicked on Avon");
            test.log(Status.PASS, "Clicked on Avon");
        } catch (Exception e) {
            Reporter.addScreenshot("Avon", test, "Avon click Failed", Base.driver);
            loggerHandler.logError("Click on Avon failed");
            test.log(Status.FAIL, "Click on Avon failed");
        }
    }
 
    /*
     * Method Name: verifyAvon
     * Author Name: Venkatanarayana
     * Description: This method verifies the text "Avon".
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyAvon(){
        try {
            assertion.verifyText(HomePageLocatorsVenkat.avonVerify, "Avon");
            Screenshot.takeScreenshot("Verified the Avon text");
            loggerHandler.logInfo("Verified text Avon");
            test.info("Verified text Avon");
            test.log(Status.PASS, "Verified text Avon");
        } catch (Exception e) {
            Reporter.addScreenshot("Avon", test, "Avon click Failed", Base.driver);
            loggerHandler.logError("Verifying text Avon failed");
            test.log(Status.FAIL, "Verifying text Avon failed");
        }
    }
 
    /*
     * Method Name: clickOnSort
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Sort" element.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnSort(){
        try {
            helper.clickOnElement(HomePageLocatorsVenkat.sort);
            Screenshot.takeScreenshot("Sort");
            loggerHandler.logInfo("Clicked on Sort");
            test.info("Clicked on Sort");
            test.log(Status.PASS, "Clicked on Sort");
        } catch (Exception e) {
            Reporter.addScreenshot("Sort", test, "Sort click Failed", Base.driver);
            loggerHandler.logError("Click on Sort failed");
            test.log(Status.FAIL, "Click on Sort failed");
        }
    }
 
    /*
     * Method Name: clickonPriceAscending
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Price Ascending" element.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickonPriceAscending(){
        try {
            helper.clickOnElement(HomePageLocatorsVenkat.priceAscending);
            Screenshot.takeScreenshot("Price Ascending");
            loggerHandler.logInfo("Clicked on Price Ascending");
            test.info("Clicked on Price Ascending");
            test.log(Status.PASS, "Clicked on Price Ascending");
        } catch (Exception e) {
            Reporter.addScreenshot("Price Ascending", test, "Price Ascending click Failed", Base.driver);
            loggerHandler.logError("Click on Price Ascending failed");
            test.log(Status.FAIL, "Click on Price Ascending failed");
        }
    }
 
    /*
     * Method Name: clickOnCompare
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Compare" button.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnCompare(){
        try {
            helper.clickOnElement(HomePageLocatorsVenkat.compare);
            Screenshot.takeScreenshot("Compare");
            loggerHandler.logInfo("Clicked on Compare button");
            test.info("Clicked on Compare button");
            test.log(Status.PASS, "Clicked on Compare button");
        } catch (Exception e) {
            Reporter.addScreenshot("Compare", test, "Compare click Failed", Base.driver);
            loggerHandler.logError("Click on Compare failed");
            test.log(Status.FAIL, "Click on Compare failed");
        }
    }
 
    /*
     * Method Name: clickOnCart
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Cart" button.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnCart(){
        try {
            helper.clickOnElement(HomePageLocatorsVenkat.cart);
            Screenshot.takeScreenshot("Cart");
            loggerHandler.logInfo("Clicked on Cart button");
            test.info("Clicked on Cart button");
            test.log(Status.PASS, "Clicked on Cart button");
        } catch (Exception e) {
            Reporter.addScreenshot("Cart", test, "Cart button click Failed", Base.driver);
            loggerHandler.logError("Click on Cart button failed");
            test.log(Status.FAIL, "Click on Cart button failed");
        }
    }
 
    /*
     * Method Name: clickOnPlus
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Plus" button.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnPlus(){
        try {
            helper.clickOnElement(HomePageLocatorsVenkat.plus);
            Screenshot.takeScreenshot("Plus");
            loggerHandler.logInfo("Clicked on Plus");
            test.info("Clicked on Plus");
            test.log(Status.PASS, "Clicked on Plus");
        } catch (Exception e) {
            Reporter.addScreenshot("Plus", test, "Plus click Failed", Base.driver);
            loggerHandler.logError("Click on Plus failed");
            test.log(Status.FAIL, "Click on Plus failed");
        }
    }
 
    /*
     * Method Name: clickOnDelete
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Delete" button.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnDelete(){
        try {
            helper.clickOnElement(HomePageLocatorsVenkat.delete);
            Screenshot.takeScreenshot("Delete button");
            loggerHandler.logInfo("Clicked on delete button");
            test.info("Clicked on delete button");
            test.log(Status.PASS, "Clicked on delete button");
        } catch (Exception e) {
            Reporter.addScreenshot("Delete", test, "Delete button click Failed", Base.driver);
            loggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "Click on delete failed");
        }
    }
 
    /*
     * Method Name: dismissAlert
     * Author Name: Venkatanarayana
     * Description: This method dismisses an alert.
     * Return Type: void
     * Parameter List: NA
     */
    public void dismissAlert(){
        try {
            helper.alertDismiss();
            loggerHandler.logInfo("Dismissed alert");
            test.info("Dismissed alert");
            test.log(Status.PASS, "Dismissed alert");
        } catch (Exception e) {
            loggerHandler.logError(e.getMessage());
            test.log(Status.FAIL, "Alert dismissal failed");
        }
    }
 
    /*
     * Method Name: clickonCheckout
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Checkout" button.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickonCheckout(){
        try {
            helper.clickOnElement(HomePageLocatorsVenkat.checkout);
            Screenshot.takeScreenshot("Checkout button");
            loggerHandler.logInfo("Clicked on checkout button");
            test.info("Clicked on checkout button");
            test.log(Status.PASS, "Clicked on checkout button");
        } catch (Exception e) {
            Reporter.addScreenshot("Checkout", test, "Checkout button click Failed", Base.driver);
            loggerHandler.logError("Click on checkout failed");
            test.log(Status.FAIL, "Click on checkout failed");
        }
    }
        /*
     * Method Name: verifyUrl
     * Author Name: Venkatanarayana
     * Description: This method verifies the current URL.
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyUrl(){
        try {
            assertion.verifyUrl("https://avoncycles.com/checkout.html");
            Screenshot.takeScreenshot("Checkout page loaded");
            loggerHandler.logInfo("Verified URL");
            test.info("Verified URL");
            test.log(Status.PASS, "Verified URL");
        } catch (Exception e) {
            Reporter.addScreenshot("Checkout page", test, "Checkout Page Failed to load", Base.driver);
            loggerHandler.logError("Not verified URL");
            test.log(Status.FAIL, "Not verified URL");
        }
    }
 
    /*
     * Method Name: verifySelectAddress
     * Author Name: Venkatanarayana
     * Description: This method verifies the text "Select Address".
     * Return Type: void
     * Parameter List: NA
     */
    public void verifySelectAddress(){
        try {
            assertion.verifyText(HomePageLocatorsVenkat.selectAddress, "Select Address");
            Screenshot.takeScreenshot("Select Address");
            loggerHandler.logInfo("Verified select Address");
            test.info("Verified select Address");
            test.log(Status.PASS, "Verified select Address");
        } catch (Exception e) {
            Reporter.addScreenshot("Unable to verify select Address", test, "Unable to verify select Address", Base.driver);
            loggerHandler.logError("Unable to verify select Address");
            test.log(Status.FAIL, "Unable to verify select Address");
        }
    }
 
    /*
     * Method Name: verifyPriceDetail
     * Author Name: Venkatanarayana
     * Description: This method verifies the text "Price Details".
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyPriceDetail(){
        try {
            assertion.verifyText(HomePageLocatorsVenkat.priceDetail, "Price Details");
            Screenshot.takeScreenshot("Price Details");
            loggerHandler.logInfo("Verified Price Details");
            test.info("Verified Price Details");
            test.log(Status.PASS, "Verified Price Details");
        } catch (Exception e) {
            Reporter.addScreenshot("Unable to verify Price Detail", test, "Unable to verify select Address", Base.driver);
            loggerHandler.logError("Unable to verify Price Detail");
            test.log(Status.FAIL, "Unable to verify Price Detail");
        }
    }
 
    /*
     * Method Name: verifySelectPaymentMethod
     * Author Name: Venkatanarayana
     * Description: This method verifies the text "Select Payment Method".
     * Return Type: void
     * Parameter List: NA
     */
    public void verifySelectPaymentMethod(){
        try {
            assertion.verifyText(HomePageLocatorsVenkat.selectPaymentMethod, "Select Payment Method");
            Screenshot.takeScreenshot("Select Payment Method");
            loggerHandler.logInfo("Verified Select Payment Method");
            test.info("Verified Select Payment Method");
            test.log(Status.PASS, "Verified Select Payment Method");
        } catch (Exception e) {
            Reporter.addScreenshot("Unable to select Payment Method", test, "Unable to verify select Payment Method", Base.driver);
            loggerHandler.logError("Unable to verify select Payment Method");
            test.log(Status.FAIL, "Unable to verify select Payment Method");
        }
    }
 
    /*
     * Method Name: verifyBackToCart
     * Author Name: Venkatanarayana
     * Description: This method verifies the text "BACK TO CART".
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyBackToCart(){
        try {
            assertion.verifyText(HomePageLocatorsVenkat.backToCart, "BACK TO CART");
            Screenshot.takeScreenshot("BACK TO CART");
            loggerHandler.logInfo("Verified Back to Cart");
            test.info("Verified Back to Cart");
            test.log(Status.PASS, "Verified Back to Cart");
           
        } catch (Exception e) {
            Reporter.addScreenshot("Unable to verify Back to Cart", test, "Unable to verify Back to Cart", Base.driver);
            loggerHandler.logError("Unable to verify Back to Cart");
            test.log(Status.FAIL, "Unable to verify Back to Cart");
        }
    }
 
    /*
     * Method Name: testAll
     * Author Name: Venkatanarayana
     * Description: This method executes all the test steps sequentially.
     * Return Type: void
     * Parameter List: NA
     */
    public void testAll(){
        hoverOnCycleByBrand();
        clickOnAvon();
        verifyAvon();
        clickOnSort();
        clickonPriceAscending();
        clickOnCompare();
        clickOnCart();
        clickOnPlus();
        clickonCheckout();
        verifyUrl();
        verifySelectAddress();
        verifyPriceDetail();
        verifySelectPaymentMethod();
        verifyBackToCart();
        Screenshot.takeScreenshot("testcase3");
    }
}
 
 
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
    public HomePageActionsVenkat(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    public void hoverOnCycleByBrand(){
        try{
        helper.hoverOverElement(HomePageLocatorsVenkat.CycleByBrand);
        Screenshot.takeScreenshot("CycleByBrand");
        LoggerHandler.logInfo("Hovered on cycleByBrand");
        test.info("Hovered on cycleBrand");
        test.log(Status.PASS,"Hovered on cycleByBrand");  
        }
        catch(Exception e){
            Reporter.addScreenshot("CycleByBrand", test, "CycleByBrand button hover Failed",Base.driver);
            LoggerHandler.logError("Hover on cycleBrand failed");
            test.log(Status.FAIL,"Hover on cycleBrand failed");
        }
    }
    public void clickOnAvon(){
        try{
        helper.clickOnElement(HomePageLocatorsVenkat.Avon);
        Screenshot.takeScreenshot("Avon");
        LoggerHandler.logInfo("clicked on Avon");
        test.info("clicked on avon");
        test.log(Status.PASS,"clicked on Avon");
        }
        catch(Exception e){
            Reporter.addScreenshot("Avon", test, "Avon click Failed",Base.driver);
            LoggerHandler.logError("click on Avon failed");
            test.log(Status.FAIL,"click on Avon failed");
        }
    }
 
    public void verifyAvon(){
        try{
        Assertion.verifyText(HomePageLocatorsVenkat.Avonverify, "Avon");
        LoggerHandler.logInfo("Verified text Avon");
        test.info("Verified test Avon");
        test.log(Status.PASS,"Verified text Avon");
        }
 
    catch(Exception e){
        LoggerHandler.logError("verifying text Avon failed");
        test.log(Status.FAIL,"verifying text Avon failed");
    }
    }
 
    public void clickOnSort(){
        try{
        helper.clickOnElement(HomePageLocatorsVenkat.Sort);
        Screenshot.takeScreenshot("sort");
        LoggerHandler.logInfo("clicked on Sort");
        test.info("clicked on sort");
        test.log(Status.PASS,"clicked on Sort");
        }
 
        catch(Exception e){
            Reporter.addScreenshot("Sort", test, "sort click Failed",Base.driver);
            LoggerHandler.logError("click on sort failed");
            test.log(Status.FAIL,"click on sort failed");
        }
    }
 
    public void clickonPriceAscending(){
        try{
        helper.clickOnElement(HomePageLocatorsVenkat.PriceAscending);
        Screenshot.takeScreenshot("Price Ascending");
        LoggerHandler.logInfo("clicked on Price Ascending");
        test.info("clicked on Price Ascending");
        test.log(Status.PASS,"clicked on Price Ascending");
    }
        catch(Exception e){
            Reporter.addScreenshot("Price Ascending", test, " Price Ascending click Failed",Base.driver);
            LoggerHandler.logError("click on Price Ascending failed");
            test.log(Status.FAIL,"click on Price Ascending failed");
        }
    }
 
    public void clickOnCompare(){
        try{
        helper.clickOnElement(HomePageLocatorsVenkat.Compare);
        Screenshot.takeScreenshot("Compare");
        LoggerHandler.logInfo("clicked on Compare button");
        test.info("click on Compare button");
        test.log(Status.PASS,"clicked on Compare button");
    }
    catch(Exception e){
        Reporter.addScreenshot("Compare", test, " Compare click Failed",Base.driver);
            LoggerHandler.logError("click on Compare failed");
            test.log(Status.FAIL,"click on Compare failed");
    }
    }
 
    public void clickOnCart(){
        try{
        helper.clickOnElement(HomePageLocatorsVenkat.Cart);
        Screenshot.takeScreenshot("Cart");
        LoggerHandler.logInfo("clicked on Cart button");
        test.info("click on Cart button");
        test.log(Status.PASS,"clicked on Cart button");
    }
    catch(Exception e){
        Reporter.addScreenshot("Cart", test, "Cart button click Failed",Base.driver);
        LoggerHandler.logError("click on Cart button failed");
        test.log(Status.FAIL,"click on Cart button failed");
    }
    }
 
    public void clickOnPlus(){
        try{
        helper.clickOnElement(HomePageLocatorsVenkat.Plus);
        Screenshot.takeScreenshot("Plus");
        LoggerHandler.logInfo("clicked on Plus");
        test.info("clicked on Plus");
        test.log(Status.PASS,"clicked on Plus");
    }
    catch(Exception e){
        Reporter.addScreenshot("Plus", test, " Plus click Failed",Base.driver);
        LoggerHandler.logError("click on Plus failed");
        test.log(Status.FAIL,"click on Plus failed");
    }
    }
 
    public void clickOnDelete(){
        try{
            helper.clickOnElement(HomePageLocatorsVenkat.Delete);
            Screenshot.takeScreenshot("Delete button");
            LoggerHandler.logInfo("clicked on delete button");
            test.info("clicked on delete button");
            test.log(Status.PASS,"clicked on delete button");
    }
    catch(Exception e){
        Reporter.addScreenshot("Plus", test, " Double button click Failed",Base.driver);
        LoggerHandler.logError("click on delete failed");
        test.log(Status.FAIL,"click on delete failed");
    }
    }
 
    public void dismissAlert(){
        try{
                helper.alertDismiss();
                LoggerHandler.logInfo("dismissed alert");
                test.info("clicked on dismissed alert");
                test.log(Status.PASS,"dismissed alert");
    }
    catch(Exception e){
            LoggerHandler.logInfo("alert failed");
            test.log(Status.FAIL,"alert failed");
        
    }
    }
 
    public void clickonCheckout(){
        try{
        helper.clickOnElement(HomePageLocatorsVenkat.Checkout);
        Screenshot.takeScreenshot("Checkout button");
        LoggerHandler.logInfo("clicked on checkout button");
        test.info("clicked on checkout button");
        test.log(Status.PASS,"clicked on checkout button");
    }
    catch(Exception e){
        Reporter.addScreenshot("Checkout", test, " Checkout button click Failed",Base.driver);
        LoggerHandler.logError("click on checkout failed");
        test.log(Status.FAIL,"click on checkout failed");
    }
    }
 
    public void verifyUrl(){
        try{
        Assertion.verifyUrl("https://avoncycles.com/checkout.html");
        LoggerHandler.logInfo("Verified url");
        test.info("Verified url");
        test.log(Status.PASS,"Verified url");
    }
    catch(Exception e){
        LoggerHandler.logError("Not verified url");
        test.log(Status.FAIL, "Not verified url");
    }
    }
    public void verifySelectAddress(){
        try{
        Assertion.verifyText(HomePageLocatorsVenkat.SelectAddress, "Select Address");
        LoggerHandler.logInfo("Verified url");
        test.info("Verified url");
        test.log(Status.PASS,"Verified url");
    }
    catch(Exception e){
        LoggerHandler.logError("unable to verify selectAddress");
        test.log(Status.FAIL, "unab;e to verify selectAddress");
    }
    }
 
    public void verifyPriceDetail(){
        try{
        Assertion.verifyText(HomePageLocatorsVenkat.PriceDetail, "Price Details");
    }
        catch(Exception e){
           
        }
    }
 
    public void verifySelectPaymentMethod(){
        try{
        Assertion.verifyText(HomePageLocatorsVenkat.SelectPaymentMethod, "Select Payment Method");
    }
        catch(Exception e){
            
        }
    }
 
        public void verifyBackToCart(){
            try{
            Assertion.verifyText(HomePageLocatorsVenkat.BackToCart, "BACK TO CART");
        }
            catch(Exception e){
                
            }
        }
 
    public void testAll(){
        hoverOnCycleByBrand();
        clickOnAvon();
        verifyAvon();
        clickOnSort();
        clickonPriceAscending();
        clickOnCompare();
        clickOnCart();
        clickOnPlus();
        clickOnDelete();
        dismissAlert();
        clickonCheckout();
        verifyUrl();
        verifySelectAddress();
        verifyPriceDetail();
        verifySelectPaymentMethod();
        verifyBackToCart();
        Screenshot.takeScreenshot("testcase3");
        Reporter.addScreenshot("testcase3", test, null, Base.driver);
    }
 
}

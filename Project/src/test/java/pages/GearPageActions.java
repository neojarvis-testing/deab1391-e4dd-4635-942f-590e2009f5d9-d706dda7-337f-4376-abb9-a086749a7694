package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.GearPageLocators;
import utils.WebDriverHelper;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
 
public class GearPageActions {
    public ExtentTest test;
    public WebDriverHelper helper;
    LoggerHandler loggerHandler;
    Assertion assertion;
 
    public GearPageActions() {
        helper = new WebDriverHelper(Base.driver);
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();
    }
 
    /*
     * Method Name: clickOnAccept
     * Author Name: Jindam Pragna
     * Description: This method clicks on accept button
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void clickOnAccept(ExtentTest test)
    {
        try
        {
            helper.waitForElementToBeVisible(GearPageLocators.accept, 5);
            helper.clickOnElement(GearPageLocators.accept);
            Screenshot.takeScreenshot("Accept button");
            loggerHandler.logInfo("Clicked on Accept button");
            test.info("Clicked on Accept button");
            test.log(Status.PASS, "Clicked on Accept button");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to click on Accept button");
            test.info("Unable to click on Accept button");
            test.log(Status.FAIL, "Unable to click on Accept button");
            Reporter.addScreenshot("Accept", test, "Click on Accept button failed", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnSearchIcon
     * Author Name: Jindam Pragna
     * Description: This method clicks on the searchicon
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void clickOnSearchIcon(ExtentTest test)
     {
        try
        {
            helper.waitForElementToBeVisible(GearPageLocators.searchIcon, 5);
            helper.clickOnElement(GearPageLocators.searchIcon);
            Screenshot.takeScreenshot("SearchIcon");
            loggerHandler.logInfo("Clicked on SearchIcon");
            test.info("Clicked on SearchIcon");
            test.log(Status.PASS, "Clicked on SearchIcon");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to click on SearchIcon");
            test.info("Unable to click on SearchIcon");
            test.log(Status.FAIL, "Unable to click on SearchIcon");
            Reporter.addScreenshot("SearchIcon", test, "Failed to click on searchicon", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnSearchBar
     * Author Name: Jindam Pragna
     * Description: This method clicks on the searchbar
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void clickOnSearchBar(ExtentTest test)
    {
        try {
            helper.waitForElementToBeVisible(GearPageLocators.searchBar, 5);
            helper.clickOnElement(GearPageLocators.searchBar);
            Screenshot.takeScreenshot("SearchBar");
            loggerHandler.logInfo("Clicked on SearchBar");
            test.info("Clicked on SearchBar");
            test.log(Status.PASS, "Clicked on SearchBar");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to click on SearchBar");
            test.info("Unable to click on SearchBar");
            test.log(Status.FAIL, "Unable to click on SearchBar");
            Reporter.addScreenshot("SearchBar", test, "Failed to click on searchbar", Base.driver);
        }
 
    }
 
    /*
     * Method Name: sendData
     * Author Name: Jindam Pragna
     * Description: This method enters the data in searchbar
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void sendData(ExtentTest test)
    {
        try
        {
            helper.typeInElement(GearPageLocators.searchBar,ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 0, 0));
            helper.enter(GearPageLocators.searchBar);
            Screenshot.takeScreenshot("Send data in SearchBar");
            loggerHandler.logInfo("Entered data in SearchBar");
            test.info("Entered data in SearchBar");
            test.log(Status.PASS, "Entered data in SearchBar");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Failed to enter data in SearchBar");
            test.info("Failed to enter data in SearchBar");
            test.log(Status.FAIL, "Failed to enter data in SearchBar");
            Reporter.addScreenshot("SearchBar", test, "Failed to enter data", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnFirstProduct
     * Author Name: Jindam Pragna
     * Description: This method clicks on the first product
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void clickOnFirstProduct(ExtentTest test)
    {
        try
        {
            helper.waitForElementToBeVisible(GearPageLocators.firstProduct, 5);
            helper.clickOnElement(GearPageLocators.firstProduct);
            Screenshot.takeScreenshot("FirstProduct");
            loggerHandler.logInfo("Clicked on FirstProduct");
            test.info("Clicked on FirstProduct");
            test.log(Status.PASS, "Clicked on FirstProduct");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Failed to click on FirstProduct");
            test.info("Failed to click on FirstProduct");
            test.log(Status.FAIL, "Failed to click on FirstProduct");
            Reporter.addScreenshot("FirstProduct", test, "Click on FirstProduct failed", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnBuyNow
     * Author Name: Jindam Pragna
     * Description: This method clicks on the buy now button
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void clickOnBuyNow(ExtentTest test)
    {
        try
        {
            helper.waitForElementToBeVisible(GearPageLocators.buyNow, 5);
            helper.clickOnElement(GearPageLocators.buyNow);
            Screenshot.takeScreenshot("BuyNow");
            loggerHandler.logInfo("Clicked on BuyNow");
            test.info("Clicked on BuyNow");
            test.log(Status.PASS, "Clicked on BuyNow");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Failed to click on BuyNow");
            test.info("Failed to click on BuyNow");
            test.log(Status.FAIL, "Failed to click on BuyNow");
            Reporter.addScreenshot("BuyNow", test, "Failed to click on Buynow", Base.driver);
        }
    }
    /*
     * Method Name: enterFirstName
     * Author Name: Jindam Pragna
     * Description: This method retrieves the first name from an Excel sheet and inputs it into the required field
     * Return Type: void
     * Parameter List: ExtentTest test
     */
 
    public void enterFirstName(ExtentTest test)
    {
        try
        {
            helper.typeInElement(GearPageLocators.firstName,
            ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 1, 0));
            helper.enter(GearPageLocators.firstName);
            Screenshot.takeScreenshot("Firstname");
            loggerHandler.logInfo("Entered FirstName");
            test.info("Entered FirstName");
            test.log(Status.PASS, "Entered FirstName");
           
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to enter FirstName");
            test.info("Unable to enter FirstName");
            test.log(Status.FAIL, "Unable to enter FirstName");
            Reporter.addScreenshot("Firstname", test, "Failed to enter Firstname", Base.driver);
        }
    }
    /*
     * Method Name: enterLastName
     * Author Name: Jindam Pragna
     * Description: This method retrieves the Last name from an Excel sheet and inputs it into the required field
     * Return Type: void
     * Parameter List: ExtentTest test
     */
 
    public void enterLastName(ExtentTest test)
    {
        try
         {
            helper.typeInElement(GearPageLocators.lastName,
            ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 1, 1));
            helper.enter(GearPageLocators.lastName);
            Screenshot.takeScreenshot("Lastname");
            loggerHandler.logInfo("Entered LastName");
            test.info("Entered LastName");
            test.log(Status.PASS, "Entered LastName");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to enter LastName");
            test.info("Unable to enter LastName");
            test.log(Status.FAIL, "Unable to enter LastName");
            Reporter.addScreenshot("LastName", test, "Failed to enter Lastname", Base.driver);
        }
    }
 
    /*
     * Method Name: enterEmail
     * Author Name: Jindam Pragna
     * Description: This method extracts the Email from an Excel sheet and enters it into the required field
     * Return Type: void
     * Parameter List: ExtentTest test
     */
    public void enterEmail(ExtentTest test)
    {
        try {
            helper.typeInElement(GearPageLocators.email,
            ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 2, 0));
            helper.enter(GearPageLocators.email);
            Screenshot.takeScreenshot("Email");
            loggerHandler.logInfo("Entered Email");
            test.info("Entered Email");
            test.log(Status.PASS, "Entered Email");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to enter Email");
            test.info("Unable to enter Email");
            test.log(Status.FAIL, "Unable to enter Email");
            Reporter.addScreenshot("Email", test, "Failed to enter Email", Base.driver);
        }
    }
 
    /*
     * Method Name: enterPhoneNumber
     * Author Name: Jindam Pragna
     * Description: This method extracts the phonenumber from an Excel sheet and enters it into the required field.
     * Return Type: void
     * Parameter List: ExtentTest test
     */
    public void enterPhoneNumber(ExtentTest test)
     {
        try
        {
            helper.typeInElement(GearPageLocators.phoneNumber,ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 2, 1));
            helper.enter(GearPageLocators.phoneNumber);
            Screenshot.takeScreenshot("phoneNumber");
            loggerHandler.logInfo("Entered phoneNumber");
            test.info("Entered phoneNumber");
            test.log(Status.PASS, "Entered phoneNumber");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to enter phoneNumber");
            test.info("Unable to enter phoneNumber");
            test.log(Status.FAIL, "Unable to enter phoneNumber");
            Reporter.addScreenshot("phoneNumber", test, "Failed to enter phoneNumber", Base.driver);
        }
    }
 
    /*
     * Method Name: enterPostCode
     * Author Name: Jindam Pragna
     * Description: This method retrieves the postcode from an Excel sheet and enters it into the required field.
     * Return Type: void
     * Parameter List: ExtentTest test
     */
    public void enterPostCode(ExtentTest test)
    {
        try
        {
            helper.typeInElement(GearPageLocators.postcode,ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 3, 0));
            helper.enter(GearPageLocators.postcode);
            Screenshot.takeScreenshot("postcode");
            loggerHandler.logInfo("Entered postcode");
            test.info("Entered postcode");
            test.log(Status.PASS, "Entered postcode");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Failed to enter postcode");
            test.info("Failed to enter postcode");
            test.log(Status.FAIL, "Failed to enter postcode");
            Reporter.addScreenshot("postcode", test, "Failed to enter postcode", Base.driver);
        }
    }
    /*
     * Method Name: enterState
     * Author Name: Jindam Pragna
     * Description: This method extracts the State from an Excel sheet and enters it into the required field.
     * Return Type: void
     * Parameter List: ExtentTest test
     */
 
    public void enterState(ExtentTest test)
     {
        try
        {
            helper.typeInElement(GearPageLocators.state,ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 3, 1));
            helper.enter(GearPageLocators.state);
            Screenshot.takeScreenshot("state");
            loggerHandler.logInfo("Entered statename");
            test.info("Entered statename");
            test.log(Status.PASS, "Entered statename");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to enter state name");
            test.info("Unable to enter state name");
            test.log(Status.FAIL, "Unable to enter state name");
            Reporter.addScreenshot("city", test, "Failed to enter city", Base.driver);
        }
    }
 
    /*
     * Method Name: enterCity
     * Author Name: Jindam Pragna
     * Description: This method retrieves the city name from an Excel sheet and enters it into the required field.
     * Return Type: void
     * Parameter List: ExtentTest test
     */
    public void enterCity(ExtentTest test)
    {
        try {
            helper.typeInElement(GearPageLocators.city,ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 4, 0));
            helper.enter(GearPageLocators.city);
            Screenshot.takeScreenshot("city");
            loggerHandler.logInfo("Entered city");
            test.info("Entered city");
            test.log(Status.PASS, "Entered city");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to enter city");
            test.info("Unable to enter city");
            test.log(Status.FAIL, "Unable to enter city");
            Reporter.addScreenshot("city", test, "Failed to enter city", Base.driver);
        }
    }
    /*
     * Method Name: enterAddress
     * Author Name: Jindam Pragna
     * Description: This method extracts the address from an Excel sheet and enters it into the required field.
     * Return Type: void
     * Parameter List: ExtentTest test
     */
 
    public void enterAddress(ExtentTest test)
    {
        try
        {
            helper.typeInElement(GearPageLocators.address,
            ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 4, 1));
            helper.enter(GearPageLocators.address);
            Screenshot.takeScreenshot("address");
            loggerHandler.logInfo("Entered address");
            test.info("Entered address");
            test.log(Status.PASS, "Entered address");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to enter address");
            test.info("Unable to enter address");
            test.log(Status.FAIL, "Unable to enter address");
            Reporter.addScreenshot("address", test, "Failed to enter address", Base.driver);
        }
    }
    /*
     * Method Name: enterCouponCode
     * Author Name: Jindam Pragna
     * Description: This method extracts the coupon code from an Excel sheet and enters it into the required field.
     * Return Type: void
     * Parameter List: ExtentTest test
     */
 
    public void enterCouponCode(ExtentTest test)
    {
        try
        {
            helper.typeInElement(GearPageLocators.coupon,
            ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 5, 0));
            helper.enter(GearPageLocators.coupon);
            Screenshot.takeScreenshot("Coupon");
            loggerHandler.logInfo("Entered coupon code");
            test.info("Entered coupon code");
            test.log(Status.PASS, "Entered coupon code");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to enter coupon code");
            test.info("Unable to enter coupon code");
            test.log(Status.FAIL, "Unable to enter coupon code");
            Reporter.addScreenshot("Coupon", test, "Failed to enter coupon code", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnApply
     * Author Name: Jindam Pragna
     * Description: This method clicks on the apply button
     * Return Type: void
     * Parameter List: ExtentTest test
     */
    public void clickOnApply(ExtentTest test)
    {
        try {
            helper.waitForElementToBeVisible(GearPageLocators.apply, 5);
            helper.clickOnElement(GearPageLocators.apply);
            Screenshot.takeScreenshot("apply");
            loggerHandler.logInfo("Clicked on apply button");
            test.info("Clicked on apply button");
            test.log(Status.PASS, "Clicked on apply button");
        }
        catch (Exception e)
         {
            loggerHandler.logError("Unable to click on apply");
            test.info("Unable to click on apply");
            test.log(Status.FAIL, "Unable to click on apply");
            Reporter.addScreenshot("apply button", test, "Failed to click on apply", Base.driver);
        }
    }
    /*
     * Method Name: clickOnRazorPay
     * Author Name: Jindam Pragna
     * Description: This method clicks on the RazorPay button
     * Return Type: void
     * Parameter List: ExtentTest test
     */
    public void clickOnRazorPay(ExtentTest test)
    {
        try
        {
            helper.waitForElementToBeVisible(GearPageLocators.razorPay, 5);
            helper.clickOnElement(GearPageLocators.razorPay);
            Screenshot.takeScreenshot("RazorPay");
            loggerHandler.logInfo("Clicked on RazorPay");
            test.info("Clicked on RazorPay");
            test.log(Status.PASS, "Clicked on RazorPay");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to click on RazorPay");
            test.info("Unable to click on RazorPay");
            test.log(Status.FAIL, "Unable to click on RazorPay");
            Reporter.addScreenshot("RazorPay button", test, "Failed to click on RazorPay", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnConfirmCheckOut
     * Author Name: Jindam Pragna
     * Description: This method clicks on the 'Confirm Checkout' button
     * Return Type: void
     * Parameter List: ExtentTest test
     */
    public void clickOnConfirmCheckOut(ExtentTest test)
    {
        try {
            helper.waitForElementToBeVisible(GearPageLocators.confirmCheckout, 5);
            helper.clickOnElement(GearPageLocators.confirmCheckout);
            Screenshot.takeScreenshot("ConfirmCheckOut");
            loggerHandler.logInfo("Clicked on ConfirmCheckOut");
            test.info("Clicked on ConfirmCheckOut");
            test.log(Status.PASS, "Clicked on ConfirmCheckOut");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to click on ConfirmCheckOut");
            test.info("Unable to click on ConfirmCheckOut");
            test.log(Status.FAIL, "Unable to click on ConfirmCheckOut");
            Reporter.addScreenshot("ConfirmCheckOut button", test, "Failed to click on ConfirmCheckOut", Base.driver);
        }
    }
 
    /*
     * Method Name: testGear
     * Author Name: Jindam Pragna
     * Description: This method executes the entire gear workflow
     * Return Type: void
     * Parameter List: ExtentTest test
     */
    public void testGear(ExtentTest test)
     {
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
    }
}
 
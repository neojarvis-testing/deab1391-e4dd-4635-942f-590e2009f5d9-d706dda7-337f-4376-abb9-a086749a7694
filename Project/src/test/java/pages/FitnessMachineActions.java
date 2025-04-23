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
    LoggerHandler loggerHandler;
    Assertion assertion;
 
    public FitnessMachineActions() {
        helper = new WebDriverHelper(Base.driver);
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();

    }
 
    /*
     * Method Name: clickOnAvonFitnessMachines
     * Author Name: Jindam Pragna
     * Description: This method clicks on the AvonFitnessMachines element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void clickOnAvonFitnessMachines(ExtentTest test)
    {
        try {
            helper.waitForElementToBeVisible(FitnessMachinesLocators.avonfitness, 5);
            helper.clickOnElement(FitnessMachinesLocators.avonfitness);
            helper.switchWindow();
            Screenshot.takeScreenshot("Avon Fitness Machines");
            loggerHandler.logInfo("Clicked on Avon Fitness Machines");
            test.info("Clicked on Avon Fitness Machines");
            test.log(Status.PASS, "Clicked on Avon Fitness Machines");
        } catch (Exception e) {
           
            loggerHandler.logError("Unable to click on Avon Fitness Machines");
            test.info("Unable to click on Avon Fitness Machines");
            test.log(Status.FAIL, "Unable to click on Avon Fitness Machines");
            Reporter.addScreenshot("Avon Fitness Machines", test, "Click on Avon Fitness Machines failed", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnPopUp
     * Author Name: Jindam Pragna
     * Description: This method clicks on the popup displayed
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void clickOnPopUp(ExtentTest test)
    {
        try
        {
            helper.waitForElementToBeVisible(FitnessMachinesLocators.popUp, 5);
            helper.clickOnElement(FitnessMachinesLocators.popUp);
            Screenshot.takeScreenshot("Handling Enquiry from popup button");
            loggerHandler.logInfo("Clicked on popup button");
            test.info("Clicked on popup button");
            test.log(Status.PASS, "Clicked on popup button");
        }
        catch (Exception e) {
            loggerHandler.logError("Unable to click on popup button");
            test.info("Unable to click on popup button");
            test.log(Status.FAIL, "Unable to click on popup button");
            Reporter.addScreenshot("Handling popup ", test, "Click on popup failed", Base.driver);
        }
    }
 
    /*
     * Method Name: verifyAvonUrl
     * Author Name: Jindam Pragna
     * Description: This method verifies the url of Avonpage
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void verifyAvonUrl(ExtentTest test)
    {
        try
        {
            assertion.verifyUrl("https://avonfitnessmachines.com/");
            Screenshot.takeScreenshot("Verification of url");
            loggerHandler.logInfo("Verified Avon fitness machines url");
            test.info("Verified Avon fitness machines url");
            test.log(Status.PASS, "Verified Avon fitness machines url");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to verify Avon fitness machines url");
            test.info("Unable to verify Avon fitness machines url");
            test.log(Status.FAIL, "Unable to verify Avon fitness machines url ");
            Reporter.addScreenshot("Url verification", test, "Url verification failed", Base.driver);
        }
    }
 
    /*
     * Method Name: hoverOnDomesticGym
     * Author Name: Jindam Pragna
     * Description: This method performs the hover action on Domestic Gym element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void hoverOnDomesticGym(ExtentTest test)
    {
        try
        {
            helper.waitForElementToBeVisible(FitnessMachinesLocators.domesticGym, 5);
            helper.hoverOverElement(FitnessMachinesLocators.domesticGym);
            Screenshot.takeScreenshot("Domestic Gym");
            loggerHandler.logInfo("Hovered on Domestic Gym");
            test.info("Hovered on Domestic Gym");
            test.log(Status.PASS, "Hovered on Domestic Gym");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to hover on Domestic Gym");
            test.info("Unable to hover on Domestic Gym");
            test.log(Status.FAIL, "Unable to hover on Domestic Gym");
            Reporter.addScreenshot("Domestic Gym", test, "Hover on Domestic Gym failed", Base.driver);
        }
    }
 
    /*
     * Method Name: hoverOnCardioLine
     * Author Name: Jindam Pragna
     * Description: This method performs the hover action on Cardioline element
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void hoverOnCardioLine(ExtentTest test)
    {
        try
        {
            helper.waitForElementToBeVisible(FitnessMachinesLocators.cardioLine, 5);
            helper.hoverOverElement(FitnessMachinesLocators.cardioLine);
            Screenshot.takeScreenshot("Cardioline");
            loggerHandler.logInfo("Hovered on Cardioline");
            test.info("Hovered on Cardioline");
            test.log(Status.PASS, "Hovered on Cardioline");
        }
         catch (Exception e) {
            loggerHandler.logError("Unable to hover on Cardioline ");
            test.info("Unable to hover on Cardioline ");
            test.log(Status.FAIL, "Unable to hover on Cardioline");
            Reporter.addScreenshot("Cardioline", test, "Hover on Cardioline failed", Base.driver);
        }
    }
 
   
    /*
     * Method Name: clickOnTreadmills
     * Author Name: Jindam Pragna
     * Description: This method clicks on the Treadmills element.
     * Return Type: void
     * Parameter List: ExtentTest test
     */
 
    public void clickOnTreadmills(ExtentTest test)
    {
        try
         {
            helper.waitForElementToBeVisible(FitnessMachinesLocators.treadmills, 5);
            helper.clickOnElement(FitnessMachinesLocators.treadmills);
            Screenshot.takeScreenshot("Treadmills");
            loggerHandler.logInfo("Clicked on Treadmills");
            test.info("Clicked on Treadmills");
            test.log(Status.PASS, "Clicked on Treadmills");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to click on Treadmills");
            test.info("Unable to click on Treadmills");
            test.log(Status.FAIL, "Unable to click on Treadmills");
            Reporter.addScreenshot("Treadmills", test, "Click on Treadmills failed", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnFirstProduct
     * Author Name: Jindam Pragna
     * Description: This method clicks on the first product in the list
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void clickOnFirstProduct(ExtentTest test)
     {
        try
        {
            helper.waitForElementToBeVisible(FitnessMachinesLocators.firstProduct, 5);
            // helper.scrollBy();
            helper.clickOnElement(FitnessMachinesLocators.firstProduct);
            Screenshot.takeScreenshot("FirstProduct");
            loggerHandler.logInfo("Clicked on FirstProduct");
            test.info("Clicked on FirstProduct");
            test.log(Status.PASS, "Clicked on FirstProduct");
        }
        catch (Exception e) {
            loggerHandler.logError("Unable to click on FirstProduct");
            test.info("Unable to click on FirstProduct");
            test.log(Status.FAIL, "Unable to click on FirstProduct");
            Reporter.addScreenshot("FirstProduct", test, "Click on FirstProduct failed", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnEnquireNow
     * Author Name: Jindam Pragna
     * Description: This method clicks on EnquireNow button
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void clickOnEnquireNow(ExtentTest test)
    {
        try
        {
            helper.waitForElementToBeVisible(FitnessMachinesLocators.enquireNow, 5);
            helper.clickOnElement(FitnessMachinesLocators.enquireNow);
            Screenshot.takeScreenshot("EnquiryNow");
            loggerHandler.logInfo("Clicked on EnquiryNow button");
            test.info("Clicked on EnquiryNow button");
            test.log(Status.PASS, "Clicked on EnquiryNow button");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to click on EnquiryNow button");
            test.info("Unable to click on EnquiryNow button");
            test.log(Status.FAIL, "Unable to click on EnquiryNow button");
            Reporter.addScreenshot("EnquiryNow", test, "Click on EnquiryNow button failed", Base.driver);
        }
    }
 
    /*
     * Method Name: inputName
     * Author Name: Jindam Pragna
     * Description: This method inputs name in the required field
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void inputName(ExtentTest test)
    {
        try
        {
            helper.typeInElement(FitnessMachinesLocators.name,
            ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 5, 1));
            Screenshot.takeScreenshot("Inputname");
            loggerHandler.logInfo("Entered name in input field");
            test.info("Entered name in input field");
            test.log(Status.PASS, "Entered name in input field");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Failed to input name in the required field");
            test.info("Failed to input name in the required field");
            test.log(Status.FAIL, "Failed to input name in the required field");
            Reporter.addScreenshot("Name", test, "Failed to input name", Base.driver);
        }
    }
 
    /*
     * Method Name: inputEmail
     * Author Name: Jindam Pragna
     * Description: This method inputs Email in the required field
     * Return Type: void
     * Parameter List:ExtentTest test
     */
 
    public void inputEmail(ExtentTest test)
     {
        try
         {
            helper.typeInElement(FitnessMachinesLocators.email,
            ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 6, 0));
            Screenshot.takeScreenshot("Email");
            loggerHandler.logInfo("Entered email in input field");
            test.info("Entered email in input field");
            test.log(Status.PASS, "Entered email in input field");
 
        }
        catch (Exception e)
        {
            loggerHandler.logError("Failed to input Email in required field");
            test.info("Failed to input Email in required field");
            test.log(Status.FAIL, "Failed to input Email in required field");
            Reporter.addScreenshot("Email", test, "Failed to input Email", Base.driver);
        }
    }
 
    /*
     * Method Name: inputPhone
     * Author Name: Jindam Pragna
     * Description: This method inputs phonenumber in the required field
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void inputPhone(ExtentTest test)
    {
        try
        {
            helper.typeInElement(FitnessMachinesLocators.phoneNumber,
            ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 6, 1));
            Screenshot.takeScreenshot("Phonenumber");
            loggerHandler.logInfo("Entered phone number in input field");
            test.info("Entered phoneNumber in input field");
            test.log(Status.PASS, "Entered phone number in input field");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Failed to input phone number");
            test.info("Failed to input phone number");
            test.log(Status.FAIL, "Failed to input phone number");
            Reporter.addScreenshot("Phone number", test, "Failed to input phone number", Base.driver);
        }
    }
 
    /*
     * Method Name: inputCity
     * Author Name: Jindam Pragna
     * Description: This method inputs city in the required field
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void inputCity(ExtentTest test)
    {
        try
        {
            helper.typeInElement(FitnessMachinesLocators.city,
            ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx/", "Sheet1", 7, 0));
            Screenshot.takeScreenshot("City");
            loggerHandler.logInfo("Entered city in input field");
            test.info("Entered city in input field");
            test.log(Status.PASS, "Entered city in input field");
        }
        catch (Exception e)
        {
            loggerHandler.logError("Failed to input city");
            test.info("Failed to input city");
            test.log(Status.FAIL, "Failed to input city");
            Reporter.addScreenshot("City", test, "Failed to input city", Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnSubmit
     * Author Name: Jindam Pragna
     * Description: This method clicks on submit button
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void clickOnSubmit(ExtentTest test)
    {
        try {
            helper.waitForElementToBeVisible(FitnessMachinesLocators.submit, 5);
            helper.clickOnElement(FitnessMachinesLocators.submit);
            Screenshot.takeScreenshot("Submit");
            loggerHandler.logInfo("Clicked on Submit button");
            test.info("Clicked on Submit button");
            test.log(Status.PASS, "Clicked on Submit button");
 
        }
        catch (Exception e)
        {
            loggerHandler.logError("Unable to click on Submit button");
            test.info("Unable to click on Submit button");
            test.log(Status.FAIL, "Unable to click on Submit button");
            Reporter.addScreenshot("Submit", test, "Failed to click on submit button", Base.driver);
        }
    }
 
    /*
     * Method Name: captureScreenshot
     * Author Name: Jindam Pragna
     * Description: This method clicks captures screenshot
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void captureScreenshot(ExtentTest test)
     {
        Screenshot.takeScreenshot("Avon Fitness Enquiry form");
        Reporter.addScreenshot("Avon Fitness Enquiry form", test, "captured screenshot successfully", Base.driver);
    }
 
    /*
     * Method Name: testFitnessMachines
     * Author Name: Jindam Pragna
     * Description: Executes the total workflow of fitness machines
     * Return Type: void
     * Parameter List:ExtentTest test
     */
    public void testFitnessMachines(ExtentTest test)
    {
        clickOnAvonFitnessMachines(test);
        verifyAvonUrl(test);
        clickOnPopUp(test);
        hoverOnDomesticGym(test);
        hoverOnCardioLine(test);
        clickOnTreadmills(test);
        clickOnFirstProduct(test);
        clickOnEnquireNow(test);
        inputName(test);
        inputEmail(test);
        inputPhone(test);
        inputCity(test);
        clickOnSubmit(test);
        captureScreenshot(test);
    }
}
 
 
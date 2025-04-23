package pages;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.AboutUsLocatorsVenkat;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class AboutusActionsVenkat {
    WebDriverHelper helper;
    WebDriver driver;
    ExtentTest test;
    LoggerHandler loggerHandler;
    Assertion assertion;
 
    /*
     * Constructor Name: AboutusActionsVenkat
     * Author Name: Venkatanarayana
     * Description: This constructor initializes the ExtentTest instance and WebDriverHelper.
     * Parameter List: ExtentTest test - The ExtentTest instance for reporting.
     */
    public AboutusActionsVenkat(ExtentTest test){
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();
    }
 
    /*
     * Method Name: clickOnAcceptCookies
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Accept Cookies" button.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnAcceptCookies(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.cookies);
            loggerHandler.logInfo("Clicked on accept cookies");
            test.info("Clicked on accept cookies");
            test.log(Status.PASS, "Clicked on accept cookies");
            Screenshot.takeScreenshot("AcceptCookies");
        } catch (Exception e) {
            Reporter.addScreenshot("click on accept cookies", test, "click on accept cookies", driver);
            loggerHandler.logError("Click on accept cookies failed");
            test.log(Status.FAIL, "Click on accept cookies failed");
        }
    }
 
    /*
     * Method Name: clickOnAboutUs
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "About Us" link.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnAboutUs(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.aboutUs);
            loggerHandler.logInfo("Clicked on about us");
            test.info("Clicked on about us");
            test.log(Status.PASS, "Clicked on about us");
            Screenshot.takeScreenshot("AboutUs");
        } catch (Exception e) {
            Reporter.addScreenshot("click on About us in the footer section", test, "click on About us in the footer section", driver);
            loggerHandler.logError("Click on About us in the footer section failed");
            test.log(Status.FAIL, "Click on About us in the footer section failed");
        }
    }
 
    /*
     * Method Name: clickOnReadMore
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Read More" link and navigates back to the home page.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnReadMore(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.readmore);
            helper.navigateBack();
            loggerHandler.logInfo("Navigated to home page");
            test.info("Navigated to home page");
            test.log(Status.PASS, "Navigated to home page");
            Screenshot.takeScreenshot("ReadMore");
        } catch (Exception e) {
            Reporter.addScreenshot("click on Readmore in the about us", test, "click on Readmore in the about us", driver);
            loggerHandler.logError("Click on Readmore in the about us failed");
            test.log(Status.FAIL, "Click on Readmore in the about us failed");
        }
    }
 
    /*
     * Method Name: clickOnProduction
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Production" link, verifies the text, and navigates back to the home page.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnProduction(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.production);
            assertion.verifyText(AboutUsLocatorsVenkat.productionTitle, "Production");
            helper.navigateBack();
            loggerHandler.logInfo("Navigated to home page");
            test.info("Navigated to home page");
            test.log(Status.PASS, "Navigated to home page");
            Screenshot.takeScreenshot("Production");
        } catch (Exception e) {
            Reporter.addScreenshot("click on production in the footer", test, "click on production in the about us", driver);
            loggerHandler.logError("Click on production in the about us failed");
            test.log(Status.FAIL, "Click on production in the about us failed");
        }
    }
 
    /*
     * Method Name: clickOnCarrer
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Career" link.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnCarrer(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.carrer);
            loggerHandler.logInfo("Clicked on career");
            test.info("Clicked on career");
            test.log(Status.PASS, "Clicked on career");
            Screenshot.takeScreenshot("Carrer");
        } catch (Exception e) {
            Reporter.addScreenshot("click on career in the footer", test, "New Launch click Failed", driver);
            loggerHandler.logError("Click on career failed");
            test.log(Status.FAIL, "Click on career failed");
        }
    }
 
    /*
     * Method Name: clickOnApplyNow
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Apply Now" button, verifies the text, and navigates back to the home page.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnApplyNow(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.applyNow);
            assertion.verifyText(AboutUsLocatorsVenkat.uploadForm, "Upload Your Job Profile");
            helper.clickOnElement(AboutUsLocatorsVenkat.close);
            helper.navigateBack();
            loggerHandler.logInfo("Clicked on apply now");
            test.info("Clicked on apply now");
            test.log(Status.PASS, "Clicked on apply now");
            Screenshot.takeScreenshot("Apply now");
        } catch (Exception e) {
            Reporter.addScreenshot("Apply now", test, "Apply now click Failed", driver);
            loggerHandler.logError("Click on apply now failed");
            test.log(Status.FAIL, "Click on apply now failed");
        }
    }
 
    /*
     * Method Name: clickonLifeAtAvon
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Life At Avon" link, verifies the text, and navigates back to the home page.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickonLifeAtAvon(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.lifeAtAvon);
            assertion.verifyText(AboutUsLocatorsVenkat.verifyLifeatAvon, "Life At AVON");
            loggerHandler.logInfo("Clicked on Life At Avon");
            helper.navigateBack();
            loggerHandler.logInfo("navigate to home page");
            test.info("Clicked on Life At Avon");
            test.log(Status.PASS, "Clicked on Life At Avon");
            Screenshot.takeScreenshot("LifeAtAvon");
        } catch (Exception e) {
            Reporter.addScreenshot("LifeAtAvon", test, "LifeAtAvon click Failed", driver);
            loggerHandler.logError("Click on Life At Avon failed");
            test.log(Status.FAIL, "Click on Life At Avon failed");
        }
    }
 
    /*
     * Method Name: clickonCorporate
     * Author Name: Venkatanarayana
     * Description: This method clicks on the "Corporate" link, then on "Annual Reports", and switches the window.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickonCorporate(){
        try {
            helper.clickOnElement(AboutUsLocatorsVenkat.corporate);
            helper.clickOnElement(AboutUsLocatorsVenkat.annualReports);
            loggerHandler.logInfo("Clicked on Corporate");
            helper.switchWindow();
            loggerHandler.logInfo("switch to new tab");
            test.info("Clicked on corporate");
            test.log(Status.PASS, "Clicked on corporate");
            Screenshot.takeScreenshot("Corporate");
        } catch (Exception e) {
            Reporter.addScreenshot("Corporate", test, "Corporate click Failed", driver);
            loggerHandler.logError("Click on Corporate failed");
            test.log(Status.FAIL, "Click on Corporate failed");
        }
    }
 
    /*
     * Method Name: verifyUrlofAnnualReports
     * Author Name: Venkatanarayana
     * Description: This method verifies the URL of the Annual Reports page.
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyUrlofAnnualReports(){
        try {
            assertion.verifyUrl("https://avoncycles.com/corporate/annual-reports");
            loggerHandler.logInfo("Verified URL of Annual Reports");
            test.info("Verified URL of Annual Reports");
            test.log(Status.PASS, "Verified URL of Annual Reports");
            Screenshot.takeScreenshot("Verified URL of Annual Reports");
        } catch (Exception e) {
            Reporter.addScreenshot("Verified URL of Annual Reports failed", test, "Verified URL of Annual Reports failed", driver);
            loggerHandler.logError("Verified URL of Annual Reports failed");
            test.log(Status.FAIL, "Verified URL of Annual Reports failed");
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
        clickOnAcceptCookies();
        clickOnAboutUs();
        clickOnReadMore();
        clickOnProduction();
        clickOnCarrer();
        clickOnApplyNow();
        clickonLifeAtAvon();
        clickonCorporate();
        verifyUrlofAnnualReports();
        Reporter.addScreenshot("annual_reports", test,"annual", Base.driver);
    }
}
 
 
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
    public AboutusActionsVenkat(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
 
    public void clickOnAcceptCookies(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.cookies);
            LoggerHandler.logInfo("clicked on acceptcookies");
            test.info("clicked on acceptcookies");
            test.log(Status.PASS, "clicked on acceptcookies");
            Screenshot.takeScreenshot("AcceptCookies");
        }
        catch(Exception e){
             Reporter.addScreenshot("click on accept cookies", test, "click on accept cookies",driver);
            LoggerHandler.logError("click on accept cookies failed");
            test.log(Status.FAIL,"click on accept cookies failed");
        }
    }
 
    public void clickOnAboutUs(){
        try{
           
            helper.clickOnElement(AboutUsLocatorsVenkat.aboutUs);
            LoggerHandler.logInfo("clicked on aboutus");
            test.info("clicked on aboutus");
            test.log(Status.PASS, "clicked on aboutus");
            Screenshot.takeScreenshot("AboutUs");
             }
        catch(Exception e){
             Reporter.addScreenshot("click on About us in the footer section", test, "click on About us in the footer section",driver);
            LoggerHandler.logError("click on About us in the footer section failed");
            test.log(Status.FAIL,"click on About us in the footer section failed");
        }
    }
    public void clickOnReadMore(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.readmore);
            helper.navigateBack();
            LoggerHandler.logInfo("navigate to home page");
            test.info("navigate to home page");
            test.log(Status.PASS,"navigate to home page");
            Screenshot.takeScreenshot("ReadMore");

             }
        catch(Exception e){
             Reporter.addScreenshot("click on Readmore in the about us", test, "click on Readmore in the about us",driver);
            LoggerHandler.logError("click on Readmore in the about us failed");
            test.log(Status.FAIL,"click on Readmore in the about us failed");
        }
    }
    public void clickOnProduction(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.production);
            Assertion.verifyText(AboutUsLocatorsVenkat.productionTitle, "Production");
            helper.navigateBack();
            LoggerHandler.logInfo("navigate to home page");
            test.info("navigate to home page");
            test.log(Status.PASS,"navigate to home page");
            Screenshot.takeScreenshot("Production");

             }
        catch(Exception e){
             Reporter.addScreenshot("click on production in the footer", test, "click on production in the about us",driver);
            LoggerHandler.logError("click on production in the about us failed");
            test.log(Status.FAIL,"click on production in the about us failed");
        }
    }
 
    public void clickOnCarrer(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.carrer);
            LoggerHandler.logInfo("click on carrer");
            test.info("click on carrer");
            test.log(Status.PASS,"click on carrer");
            Screenshot.takeScreenshot("Carrer");

             }
        catch(Exception e){
             Reporter.addScreenshot("click on carrer in the footer", test, "New Launch click Failed",driver);
            LoggerHandler.logError("Click on carrer failed");
            test.log(Status.FAIL,"Click on career failed");
        }
    }
 
    public void clickOnApplyNow(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.applyNow);
            Assertion.verifyText(AboutUsLocatorsVenkat.uploadForm, "Upload Your Job Profile");
            helper.clickOnElement(AboutUsLocatorsVenkat.close);
            helper.navigateBack();
            LoggerHandler.logInfo("click on applynow");
            test.info("click on applynow");
            test.log(Status.PASS,"click on applynow");
            Screenshot.takeScreenshot("Apply now");
             }
        catch(Exception e){
             Reporter.addScreenshot("Applynow", test, "applynow click Failed",driver);
            LoggerHandler.logError("Click on applynow failed");
            test.log(Status.FAIL,"Click on applynow failed");
        }
    }
 
    public void clickonLifeAtAvon(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.lifeAtAvon);
            Assertion.verifyText(AboutUsLocatorsVenkat.verifyLifeatAvon, "Life At AVON");
            helper.navigateBack();
            LoggerHandler.logInfo("click on LifeAtAvon");
            test.info("click on lifeAtAvon");
            test.log(Status.PASS,"click on LifeAtAvon");
            Screenshot.takeScreenshot("LifeAtAvon");
             }
        catch(Exception e){
             Reporter.addScreenshot("LifeAtAvon", test, "LifeAtAvon click Failed",driver);
            LoggerHandler.logError("Click on LifeAtAvon failed");
            test.log(Status.FAIL,"Click on LifeAtAvon failed");
        }
    }
 
    public void clickonCorporate(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.corporate);
            helper.clickOnElement(AboutUsLocatorsVenkat.annualReports);
            helper.switchWindow();
            LoggerHandler.logInfo("click on Corporate");
            test.info("click on corporate");
            test.log(Status.PASS,"click on corporate");
            Screenshot.takeScreenshot("Corporate");
             }
        catch(Exception e){
             Reporter.addScreenshot("Corporate", test, "corporate click Failed",driver);
            LoggerHandler.logError("Click on Corporate failed");
            test.log(Status.FAIL,"Click on Corporate failed");
        }
    }
 
    public void verifyUrlofAnnualReports(){
        try{
        Assertion.verifyUrl("https://avoncycles.com/corporate/annual-reports");
        LoggerHandler.logInfo("Verified url of AnnualReports");
        test.info("Verified url of AnnualReports");
        test.log(Status.PASS,"Verified url of AnnualReports");
        }
        catch(Exception e){
            LoggerHandler.logError("verified url failed");
            test.log(Status.FAIL,"verified url failed");
        }
    }
 
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
    }
}

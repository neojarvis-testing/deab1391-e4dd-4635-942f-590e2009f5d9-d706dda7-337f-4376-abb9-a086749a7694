package pages;
 
import com.aventstack.extentreports.ExtentTest;
 
import uistore.AboutUsLocatorsVenkat;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;
 
public class AboutusActionsVenkat {
     WebDriverHelper helper;
    ExtentTest test;
    public AboutusActionsVenkat(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
 
    public void clickOnAcceptCookies(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.cookies);
        }
        catch(Exception e){
            e.getMessage();
        }
    }
 
    public void clickOnAboutUs(){
        try{
           
            helper.clickOnElement(AboutUsLocatorsVenkat.aboutUs);
             }
        catch(Exception e){
            e.getMessage();
        }
    }
    public void clickOnReadmore(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.readmore);
            helper.navigateBack();
            LoggerHandler.logInfo("navigate to home page");
            test.pass("navigate to home page");
             }
        catch(Exception e){
            e.getMessage();
        }
    }
    public void clickOnProduction(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.production);
            Assertion.verifyText(AboutUsLocatorsVenkat.productionTitle, "Production");
            helper.navigateBack();
            LoggerHandler.logInfo("navigate to home page");
            test.pass("navigate to home page");
             }
        catch(Exception e){
            e.getMessage();
        }
    }
 
    public void clickOnCarrer(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.carrer);
             }
        catch(Exception e){
            e.getMessage();
        }
    }
 
    public void clickOnApplyNow(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.applyNow);
            Assertion.verifyText(AboutUsLocatorsVenkat.uploadForm, "Upload Your Job Profile");
            helper.clickOnElement(AboutUsLocatorsVenkat.close);
            helper.navigateBack();
            LoggerHandler.logInfo("navigate to home page");
            test.pass("navigate to home page");
             }
        catch(Exception e){
            e.getMessage();
        }
    }
 
    public void clickonLifeAtAvon(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.lifeAtAvon);
            Assertion.verifyText(AboutUsLocatorsVenkat.verifyLifeatAvon, "Life At AVON");
            helper.navigateBack();
            LoggerHandler.logInfo("navigate to home page");
            test.pass("navigate to home page");
             }
        catch(Exception e){
            e.getMessage();
        }
    }
 
    public void clickonCorporate(){
        try{
            helper.clickOnElement(AboutUsLocatorsVenkat.corporate);
            helper.clickOnElement(AboutUsLocatorsVenkat.annualReports);
            helper.switchWindow();
            LoggerHandler.logInfo("switch to new tab");
            test.pass("switch to new tab");
             }
        catch(Exception e){
            e.getMessage();
        }
    }
 
    public void verifyUrlofAnnualReports(){
        try{
        Assertion.verifyUrl("https://avoncycles.com/corporate/annual-reports");
        Reporter.addScreenshot("annual_reports", test, null, Base.driver);
        }
        catch(Exception e){
            e.getMessage();
        }
    }
 
    public void testAll(){
        clickOnAcceptCookies();
        clickOnAboutUs();
        clickOnReadmore();
        clickOnProduction();
        clickOnCarrer();
        clickOnApplyNow();
        clickonLifeAtAvon();
        clickonCorporate();
        verifyUrlofAnnualReports();
    }
}

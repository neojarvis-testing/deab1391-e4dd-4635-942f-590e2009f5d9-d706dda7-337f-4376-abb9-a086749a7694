package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AccolodesLocatorsRam;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class AccolodesActionsRam {  
    WebDriverHelper helper;
    WebDriver driver; 
    ExtentTest test;

    public AccolodesActionsRam(){
        helper = new WebDriverHelper(Base.driver);
    } 

    public void clickAccolodes(ExtentTest test){ 
        try {    
        helper.scroll(AccolodesLocatorsRam.accolode);
        LoggerHandler.logInfo("Scroll to Accolodes");
        test.info("Scroll to Accolodes");
        test.log(Status.PASS, "Click on Accolodes");
        helper.clickOnElement(AccolodesLocatorsRam.accolode);
        LoggerHandler.logInfo("Click on Accolodes");
        test.info("Click on Accolodes");
        test.log(Status.PASS, "Click on Accolodes");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("Click on Accolodes");
            test.log(Status.FAIL, "Click on Accolodes");
            Reporter.addScreenshot("Accolodes", test, "Accolodes", driver);
        }
        
    } 

    public void verify1(ExtentTest test){ 
        try {
            Assertion.verifyUrl("https://avoncycles.com/awards/");
        helper.clickOnElement(AccolodesLocatorsRam.logo);
        //driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }  

    public void clickBlogs(ExtentTest test){ 
        try {
            helper.scroll(AccolodesLocatorsRam.blog);
        helper.clickOnElement(AccolodesLocatorsRam.blog);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 

    public void verify2(ExtentTest test){ 
        try {
            Assertion.verifyUrl("https://avoncycles.com/blog/");
        helper.clickOnElement(AccolodesLocatorsRam.logo);
        // driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 

    public void clickWarrant(ExtentTest test){
        try {
            helper.scroll(AccolodesLocatorsRam.warranty);
        helper.clickOnElement(AccolodesLocatorsRam.warranty);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }  

    public void verify3(ExtentTest test){ 
        try {
            Assertion.verifyUrl("https://avoncycles.com/warranty-policy/");
        helper.clickOnElement(AccolodesLocatorsRam.logo);
        // driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 

    public void clickTerms(ExtentTest test){ 
        try {
            helper.scroll(AccolodesLocatorsRam.terms);
        helper.clickOnElement(AccolodesLocatorsRam.terms);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 

    public void verify4(ExtentTest test) { 
        try {
            Assertion.verifyUrl("https://avoncycles.com/termcondition/");
            helper.clickOnElement(AccolodesLocatorsRam.logo);
            // driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    } 

    public void clickDealer(ExtentTest test){ 
        try {
            helper.clickOnElement(AccolodesLocatorsRam.dealer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 

    public void verify5(ExtentTest test){ 
        try {
            Assertion.verifyUrl("https://avoncycles.com/storelocater");
        Assertion.verifyText(AccolodesLocatorsRam.dealLocator,"Dealer Locator");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 

    public void dropState(ExtentTest test){ 
        try {
            helper.dropdown(AccolodesLocatorsRam.state, "Assam");
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }  

    public void dropCity(ExtentTest test){ 
        try {
            helper.dropdown(AccolodesLocatorsRam.city, "Barpeta Road");
        Reporter.addScreenshot("City", test, "city screenshot", driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }  

    public void test2(ExtentTest test){ 
        try {
        clickAccolodes(test);
        verify1(test);
        clickBlogs(test);
        verify2(test);
        clickWarrant(test);
        verify3(test);
        clickTerms(test);
        verify4(test);
        clickDealer(test);
        verify5(test);
        dropState(test);
        dropCity(test); 
    } catch (Exception e) {
        e.printStackTrace();
    }
    }



}

package pages;

 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.BusinessPageLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class BusinessPageActions {
    public WebDriverHelper helper;
    public ExtentTest test;
   
    public BusinessPageActions(ExtentTest test){
       
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
 
    /*
     * Method Name: clickOnBusiness
     * Author Name: Chikka Anjani
     * Description: This method clicks on the business element
     * Return Type: NA
     * Parameter List:NA
     */
 
    public void clickOnBusiness(ExtentTest test){
        try{
        helper.waitForElementToBeVisible(BusinessPageLocators.business, 10);
        helper.clickOnElement(BusinessPageLocators.business);
        LoggerHandler.logInfo("clicked on business");
        test.info("clicked on business");
        test.log(Status.PASS, "clicked on business");
        Screenshot.takeScreenshot("Business");
        }catch(Exception e){
            Reporter.addScreenshot("Business", test, "clicked on business failed", Base.driver);
            LoggerHandler.logError("unable to click on business");
            test.log(Status.FAIL, "unable to click on business");
        }
    }
 
     /*
     * Method Name: verifyPageUrl
     * Author Name: Chikka Anjani
     * Description: This method verifies the "PageUrl" label
     * Return Type: NA
     * Parameter List:NA
     */
 
    public void verifyPageUrl(ExtentTest test){
        try{
        Assertion.verifyUrl("https://avoncycles.com/international-business");
        LoggerHandler.logInfo("URL Verified");
        test.info("Verified URL");
        test.log(Status.PASS,"Verified URL");
        }catch(Exception e){
            LoggerHandler.logError("Not verified url");
            test.log(Status.FAIL, "Not verified url");
           
        }
    }
 
    /*
     * Method Name: verifyPageText
     * Author Name: Chikka Anjani
     * Description: This method verifies the "PageText" label
     * Return Type: NA
     * Parameter List:NA
     */
 
    public void verifyPageText(ExtentTest test){
        try{
        Assertion.verifyText(BusinessPageLocators.certifications, "Certifications");
        LoggerHandler.logInfo("verified Page text");
        test.info("Verify page text");
        test.log(Status.PASS, "Verify page text");
    }catch(Exception e){
        LoggerHandler.logError("unable to verify page text");
        test.log(Status.FAIL, "unable to verify page text");
    }
}
 
 /*
     * Method Name: sendemail
     * Author Name: Chikka Anjani
     * Description: This method reads data from excel
     * Return Type: NA
     * Parameter List:NA
     */
 
   public void sendEmail(ExtentTest test){
try {
    helper.typeInElement(BusinessPageLocators.email,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 0, 3));
    LoggerHandler.logInfo("Entered email");
    test.info("Entered email");
    test.log(Status.PASS, "Entered email");
    Screenshot.takeScreenshot("Email");
  }catch (Exception e) {
    Reporter.addScreenshot("Email", test, "clicked on email failed", Base.driver);
    LoggerHandler.logError("unable to verify email");
    test.log(Status.FAIL, "unable to verify email");
   }
}
 
 /*
     * Method Name: verifyEmail
     * Author Name: Chikka Anjani
     * Description: This method verifies the "Email" label
     * Return Type: NA
     * Parameter List:NA
     */
public void verifyEmail(ExtentTest test){
    try{
    Assertion.verifyText(BusinessPageLocators.emaillabel, "Email ID (required)");
    LoggerHandler.logInfo("Email verified");
    test.info("Email verified");
    test.log(Status.PASS, "Email verified");
   }catch(Exception e){
    LoggerHandler.logError("unable to verify email");
    test.log(Status.FAIL, "unable to verify email");
   }
}
 
            /*
     * Method Name: verifyPhone
     * Author Name: Chikka Anjani
     * Description: This method verifies the "Phone" label
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void verifyPhone(ExtentTest test){
    try{
    Assertion.verifyText(BusinessPageLocators.phonelabel, "Ph. No (required)");
    LoggerHandler.logInfo("verified phone number");
    test.info("verified phone number");
    test.log(Status.PASS, "verified phone number");
    }catch(Exception e){
        LoggerHandler.logError("unable to verify phone number");
        test.log(Status.FAIL, "unable to verify phone number");
    }
 
}
 
/*
     * Method Name: sendPhone
     * Author Name: Chikka Anjani
     * Description:  This method reads data from excel
     * Return Type: NA
     * Parameter List:NA
     */
 
 
public void sendPhone(ExtentTest test){
    try {
        helper.typeInElement(BusinessPageLocators.phone,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 1, 3));
        LoggerHandler.logInfo("entered phone number");
        test.info("entered phone number");
        test.log(Status.PASS, "entered phone number");
        Screenshot.takeScreenshot("Phone");
    } catch (Exception e) {
        Reporter.addScreenshot("Phone", test, "clicked on phone failed", Base.driver);
        LoggerHandler.logError("entered invalid phone number");
       test.log(Status.FAIL,"entered invalid phone number");
    }
}
 
/*
     * Method Name: verifyCountry
     * Author Name: Chikka Anjani
     * Description: This method verifies the "country" label
     * Return Type: NA
     * Parameter List:NA
     */
 
    public void verifyCountry(ExtentTest test){
        try{
        Assertion.verifyText(BusinessPageLocators.countrylabel, "Country");
        LoggerHandler.logInfo("verified country");
        test.info("verified country");
        test.log(Status.PASS, "verified country");
    }catch(Exception e){
        LoggerHandler.logError("unable to verify country");
        test.log(Status.FAIL, "unable to verify country");
    }
}
 
/*
     * Method Name: sendCountry
     * Author Name: Chikka Anjani
     * Description:  This method reads data from excel
     * Return Type: NA
     * Parameter List:NA
     */
 
 
    public void sendCountry(ExtentTest test){
        try {
            helper.typeInElement(BusinessPageLocators.country,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 2, 3));
            LoggerHandler.logInfo("entered country");
            test.info("entered country");
            test.log(Status.PASS, "entered country");
            Screenshot.takeScreenshot("Country");
        } catch (Exception e) {
            Reporter.addScreenshot("Country", test, "clicked on country failed", Base.driver);
            LoggerHandler.logError("unable to enter country");
            test.log(Status.FAIL, "unable to enter country");
        }
    }
 
    /*
     * Method Name: verifyCompany
     * Author Name: Chikka Anjani
     * Description: This method verifies the "company" label
     * Return Type: NA
     * Parameter List:NA
     */
 
    public void verifyCompany(ExtentTest test){
        try{
            Assertion.verifyText(BusinessPageLocators.companylabel, "Company Name");
            LoggerHandler.logInfo("verified company");
            test.info("verified company");
            test.log(Status.PASS, "verified company");
        }catch(Exception e){
            LoggerHandler.logError("unable to verify company");
            test.log(Status.FAIL, "unable to verify company");
 
        }
    }
 
    /*
     * Method Name: sendCompany
     * Author Name: Chikka Anjani
     * Description:  This method reads data from excel
     * Return Type: NA
     * Parameter List:NA
     */
 
 
    public void sendCompany(ExtentTest test){
        try {
            helper.typeInElement(BusinessPageLocators.company,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 3, 3));
            LoggerHandler.logInfo("entered company");
            test.info("entered company");
            test.log(Status.PASS, "entered company");
            Screenshot.takeScreenshot("Company");
            } catch (Exception e) {
             Reporter.addScreenshot("Company", test, "clicked on company failed", Base.driver);
            LoggerHandler.logError("unable to enter company");
               test.log(Status.FAIL, "unable to enter company");
            }
        }
 
        /*
     * Method Name: verifyAddress
     * Author Name: Chikka Anjani
     * Description: This method verifies the "address" label
     * Return Type: NA
     * Parameter List:NA
     */
 
     public void verifyAddress(ExtentTest test){
        try{
            Assertion.verifyText(BusinessPageLocators.addresslabel, "Address");
            LoggerHandler.logInfo("verified address");
            test.info("verified address");
            test.log(Status.PASS, "verified address");
        }catch(Exception e){
            LoggerHandler.logError("unable to verify address");
            test.log(Status.FAIL, "unable to verify address");
        }
    }
 
    /*
     * Method Name: sendAddress
     * Author Name: Chikka Anjani
     * Description:  This method reads data from excel
     * Return Type: NA
     * Parameter List:NA
     */
 
 
    public void sendAddress(ExtentTest test){
        try {
                helper.typeInElement(BusinessPageLocators.address,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 4, 3));
                LoggerHandler.logInfo("entered address");
                test.info("entered address");
                test.log(Status.PASS, "entered address");
                Screenshot.takeScreenshot("Address");
            } catch (Exception e) {
                Reporter.addScreenshot("Address", test, "clicked on address failed", Base.driver);
                LoggerHandler.logError("unable to enter address");
            test.log(Status.FAIL, "unable to enter address");
            }
        }
 
        /*
     * Method Name: verifySubject
     * Author Name: Chikka Anjani
     * Description: This method verifies the "subject" label
     * Return Type: NA
     * Parameter List:NA
     */
 
    public void verifySubject(ExtentTest test){
        try{
            Assertion.verifyText(BusinessPageLocators.subjectlabel, "Subject");
            LoggerHandler.logInfo("verified subject");
            test.info("verified subject");
            test.log(Status.PASS, "verified subject");
        }catch(Exception e){
            LoggerHandler.logError("unable to verify subject");
            test.log(Status.FAIL, "unable to verify subject");
        }
    }
 
    /*
     * Method Name: sendSubject
     * Author Name: Chikka Anjani
     * Description:  This method reads data from excel
     * Return Type: NA
     * Parameter List:NA
     */
 
 
    public void sendSubject(ExtentTest test){
        try {
                helper.typeInElement(BusinessPageLocators.subject,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 5, 3));
                LoggerHandler.logInfo("entered subject");
                test.info("entered subject");
                test.log(Status.PASS, "entered subject");
                Screenshot.takeScreenshot("Subject");
            } catch (Exception e) {
                Reporter.addScreenshot("Subject", test, "clicked on subject failed", Base.driver);
                LoggerHandler.logError("unable to enter subject");
            test.log(Status.FAIL, "unable to enter subject");
            }
        }
 
        /*
     * Method Name: sendMessage
     * Author Name: Chikka Anjani
     * Description:  This method reads data from excel
     * Return Type: NA
     * Parameter List:NA
     */
 
 
    public void sendMessage(ExtentTest test){
        try {
                helper.typeInElement(BusinessPageLocators.message,ExcelReader.readData(System.getProperty("user.dir")+"/testdata/data.xlsx/","Sheet1", 6, 3));
                LoggerHandler.logInfo("entered message");
                test.info("entered message");
                test.log(Status.PASS, "entered message");
                Screenshot.takeScreenshot("Message");
            } catch (Exception e) {
                Reporter.addScreenshot("Message", test, "clicked on message failed", Base.driver);
                LoggerHandler.logError("unable to enter message");
            test.log(Status.FAIL, "unable to enter message");
            }
        }
 
        /*
     * Method Name: clickOnSend
     * Author Name: Chikka Anjani
     * Description: This method clicks on the send element
     * Return Type: NA
     * Parameter List:NA
     */
 
 
    public void clickOnSend(ExtentTest test){
        try{
            helper.clickOnElement(BusinessPageLocators.send);
            Screenshot.takeScreenshot("sent");
            LoggerHandler.logInfo("clicked on send");
            test.info("clicked on send");
                test.log(Status.PASS, "clicked on send");
                Screenshot.takeScreenshot("Send");
            }catch(Exception e){
                Reporter.addScreenshot("Send", test, "clicked on send failed", Base.driver);
                LoggerHandler.logError("unable to click on send");
            test.log(Status.FAIL, "unable to click on send");
            }
        }
 
        public void testCase4(){
            clickOnBusiness(test);
            verifyPageUrl(test);
            verifyPageText(test);
            sendEmail(test);
            verifyEmail(test);
            verifyPhone(test);
            sendPhone(test);
            verifyCountry(test);
            sendCountry(test);
            verifyCompany(test);
            sendCompany(test);
            verifyAddress(test);
            sendAddress(test);
            verifySubject(test);
            sendSubject(test);
            sendMessage(test);
           
        }
    }
         
 

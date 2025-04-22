package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.NewLaunchLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class NewLaunchActions {
    WebDriver driver;
    WebDriverHelper helper;
    ExtentTest test;
   
    public NewLaunchActions()
    {
        helper = new WebDriverHelper(Base.driver);
    }
   
    public void clickOnNewLaunches(ExtentTest test)
    {
        try
        {
            helper.hoverOverElement(NewLaunchLocators.newLaunch);
            helper.clickOnElement(NewLaunchLocators.newLaunch);
            Screenshot.takeScreenshot("New Launch");
            LoggerHandler.logInfo("New Launch clicked");
            test.info("New Launch clicked");
            test.log(Status.PASS,"New Launch clicked");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("New Launch", test, "New Launch click Failed",driver);
            LoggerHandler.logError("Click on New Launch failed");
            test.log(Status.FAIL,"Click on New Launch failed");
        }
    }
 
    public void verifyNewLaunch(ExtentTest test)
    {
        try
        {
            Assertion.verifyUrl("https://avoncycles.com/category/new-launches.html");
            LoggerHandler.logInfo("New Launch url verified");
            test.info("New Launch url verified");
            test.log(Status.PASS,"New Launch url verified");
        }
        catch(Exception e)
        {
            LoggerHandler.logError("New Launch url failed");
            test.log(Status.FAIL,"New Launch url failed");
        }
    }
   
    public void clickOnWishlist(ExtentTest test)
    {
        try
        {
            helper.hoverOverElement(NewLaunchLocators.heartIcon);
            helper.clickOnElement(NewLaunchLocators.heartIcon);
            Screenshot.takeScreenshot("WishList");
            LoggerHandler.logInfo("WishList Icon clicked");
            test.info("WishList Icon clicked");
            test.log(Status.PASS,"WishList Icon clicked");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Wishlist", test, "Wishlist click Failed",driver);
            LoggerHandler.logError("Click on wishlist failed");
            test.log(Status.FAIL,"Click on wishlist failed");
        }
    }
 
    public void switchLogin(ExtentTest test)
    {
        try {
            helper.switchWindow();
            LoggerHandler.logInfo("Window switched");
            test.info("Window switched");
            test.log(Status.PASS,"Window switched");
        } catch (Exception e) {
            LoggerHandler.logError("Window swictch failed");
            test.log(Status.FAIL,"Window switch failed");
        }
    }
 
    public void verifyLoginUrl(ExtentTest test)
    {
        try
        {
            Assertion.verifyUrl("https://avoncycles.com/customer/login.html");
            LoggerHandler.logInfo("Login url verified");
            test.info("Login url verified");
            test.log(Status.PASS,"Login url verified");
        }
        catch(Exception e)
        {
            LoggerHandler.logError("Login url failed");
            test.log(Status.FAIL,"Login url failed");
        }
    }
 
    public void verifyLoginTitle(ExtentTest test)
    {
        try
        {
            Assertion.verifyText(NewLaunchLocators.loginTitle, "Login Account");
            LoggerHandler.logInfo("Login Title verified");
            test.info("Login Title verified");
            test.log(Status.PASS,"Login Title verified");
        }
        catch(Exception e)
        {
            LoggerHandler.logError("Login Title failed");
            test.log(Status.FAIL,"Login Title failed");
        }
    }
 
    public void enterLoginEmail(ExtentTest test)
    {
        try
        {
            helper.clickOnElement(NewLaunchLocators.email);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 0, 2);
            helper.typeInElement(NewLaunchLocators.email, value);
            Screenshot.takeScreenshot("Entered Email value");
            LoggerHandler.logInfo("Entered Email value");
            test.info("Entered Email value");
            test.log(Status.PASS,"Entered Email value");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Email", test, "Email input Failed",driver);
            LoggerHandler.logError("Email input failed");
            test.log(Status.FAIL,"Email input failed");
        }
       
    }
 
    public void enterLoginPassword(ExtentTest test)
    {
        try
        {
            helper.clickOnElement(NewLaunchLocators.password);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 1, 2);
            helper.typeInElement(NewLaunchLocators.password, value);
            Screenshot.takeScreenshot("Entered password value");
            LoggerHandler.logInfo("Entered password value");
            test.info("Entered password value");
            test.log(Status.PASS,"Entered password value");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Password", test, "Password input Failed",driver);
            LoggerHandler.logError("Password input failed");
            test.log(Status.FAIL,"Password input failed");
        }  
    }
 
    public void clickOnLogin(ExtentTest test)
    {
        try
        {
            helper.hoverOverElement(NewLaunchLocators.login);
            helper.clickOnElement(NewLaunchLocators.login);
            Screenshot.takeScreenshot("Login");
            LoggerHandler.logInfo("Login button clicked");
            test.info("Login button clicked");
            test.log(Status.PASS,"Login button clicked");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Login", test, "Login button click Failed",driver);
            LoggerHandler.logError("Click on Login failed");
            test.log(Status.FAIL,"Click on Login failed");
        }
    }
 
    public void verifyLoginError(ExtentTest test)
    {
        try
        {
            Assertion.verifyText(NewLaunchLocators.errorMsg, "These credentials do not match our records.");
            LoggerHandler.logInfo("Login error verified");
            test.info("Login error verified");
            test.log(Status.PASS,"Login error verified");
        }
        catch(Exception e)
        {
            LoggerHandler.logError("Login error failed");
            test.log(Status.FAIL,"Login error failed");
        }
    }
 
    public void clickOnCreateAccount(ExtentTest test)
    {
        try
        {
            helper.hoverOverElement(NewLaunchLocators.createAccount);
            helper.clickOnElement(NewLaunchLocators.createAccount);
            Screenshot.takeScreenshot("Create Account");
            LoggerHandler.logInfo("Create Account link clicked");
            test.info("Create Account link clicked");
            test.log(Status.PASS,"Create Account link clicked");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Create Account", test, "Create Account click Failed",driver);
            LoggerHandler.logError("Create Account link click failed");
            test.log(Status.FAIL,"Create Account link click failed");
        }
    }
 
    public void verifyRegisterUrl(ExtentTest test)
    {
        try
        {
            Assertion.verifyUrl("https://avoncycles.com/customer/register.html");
            LoggerHandler.logInfo("Register url verified");
            test.info("Register url verified");
            test.log(Status.PASS,"Register url verified");
        }
        catch(Exception e)
        {
            LoggerHandler.logError("Register url failed");
            test.log(Status.FAIL,"Register url failed");
        }
    }
 
    public void enterFirstName(ExtentTest test)
    {
        try
        {
            helper.clickOnElement(NewLaunchLocators.firstName);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 2, 2);
            helper.typeInElement(NewLaunchLocators.firstName, value);
            Screenshot.takeScreenshot("First name");
            LoggerHandler.logInfo("Entered First Name value");
            test.info("Entered First Name value");
            test.log(Status.PASS,"Entered First Name value");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("First Name", test, "First name input Failed",driver);
            LoggerHandler.logError("First Name input failed");
            test.log(Status.FAIL,"First Name input failed");
        }  
    }
 
    public void enterLastName(ExtentTest test)
    {
        try
        {
            helper.clickOnElement(NewLaunchLocators.lastName);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 3, 2);
            helper.typeInElement(NewLaunchLocators.lastName, value);
            Screenshot.takeScreenshot("Last name");
            LoggerHandler.logInfo("Entered Last Name value");
            test.info("Entered Last Name value");
            test.log(Status.PASS,"Entered Last Name value");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Last Name", test, "Last name input Failed",driver);
            LoggerHandler.logError("Last Name input failed");
            test.log(Status.FAIL,"Last Name input failed");
        }
       
    }
 
    public void enterRegisterEmail(ExtentTest test)
    {
        try
        {
            helper.clickOnElement(NewLaunchLocators.registerEmail);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 4, 2);
            helper.typeInElement(NewLaunchLocators.registerEmail, value);
            Screenshot.takeScreenshot("Email");
            LoggerHandler.logInfo("Entered Email value");
            test.info("Entered Email Value");
            test.log(Status.PASS,"Entered Email value");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Email", test, "Email input Failed",driver);
            LoggerHandler.logError("Email input failed");
            test.log(Status.FAIL,"Email input failed");
        }
       
    }
 
    public void enterPhone(ExtentTest test)
    {
        try
        {
            helper.clickOnElement(NewLaunchLocators.phone);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 5, 2);
            helper.typeInElement(NewLaunchLocators.phone, value);
            Screenshot.takeScreenshot("Phone");
            LoggerHandler.logInfo("Entered Phone value");
            test.info("Entered Phone value");
            test.log(Status.PASS,"Entered Phone value");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Phone", test, "Phone input Failed",driver);
            LoggerHandler.logError("Phone input failed");
            test.log(Status.FAIL,"Phone input failed");
        }
       
    }
 
    public void enterRegisterPassword(ExtentTest test)
    {
        try
        {
            helper.clickOnElement(NewLaunchLocators.registerPassword);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 6, 2);
            helper.typeInElement(NewLaunchLocators.registerPassword, value);
            Screenshot.takeScreenshot("Password");
            LoggerHandler.logInfo("Entered password value");
            test.info("Entered password value");
            test.log(Status.PASS,"Entered password value");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Password", test, "Password input Failed",driver);
            LoggerHandler.logError("Password input failed");
            test.log(Status.FAIL,"Password input failed");
        }
       
    }
 
    public void clickSignup(ExtentTest test)
    {
        try
        {
            helper.hoverOverElement(NewLaunchLocators.signUp);
            helper.clickOnElement(NewLaunchLocators.signUp);
            Reporter.addScreenshot("Sign up", test, "Sign Up button click",driver);
            Screenshot.takeScreenshot("Sign Up");
            LoggerHandler.logInfo("Sign Up button clicked");
            test.info("Sign Up button clicked");
            test.log(Status.PASS,"Sign Up button clicked");
        }
        catch(Exception e)
        {
            Reporter.addScreenshot("Sign up", test, "Sign Up button click Failed",driver);
            LoggerHandler.logError("Click on Sign up failed");
            test.log(Status.FAIL,"Click on Sign up failed");
        }
    }
 
    public void testCase5(ExtentTest test)
    {
        clickOnNewLaunches(test);
        verifyNewLaunch(test);
        clickOnWishlist(test);
        switchLogin(test);
        verifyLoginUrl(test);
        verifyLoginTitle(test);
        enterLoginEmail(test);
        enterLoginPassword(test);
        clickOnLogin(test);
        verifyLoginError(test);
        clickOnCreateAccount(test);
        verifyRegisterUrl(test);
        enterFirstName(test);
        enterLastName(test);
        enterRegisterEmail(test);
        enterPhone(test);
        enterRegisterPassword(test);
        clickSignup(test);
    }
   
}
 

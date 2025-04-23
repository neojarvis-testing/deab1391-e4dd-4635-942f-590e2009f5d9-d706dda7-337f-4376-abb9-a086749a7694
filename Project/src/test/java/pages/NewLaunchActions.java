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
    LoggerHandler loggerHandler;
    Assertion assertion;

    public NewLaunchActions() {
        helper = new WebDriverHelper(Base.driver);
        loggerHandler = new LoggerHandler();
        assertion = new Assertion();
    }

    /*
     * Method Name: clickOnNewLaunches
     * Author Name: Sharmila Abdul
     * Description: Clicks on the "New Launches" section and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOnNewLaunches(ExtentTest test) {
        try {
            helper.hoverOverElement(NewLaunchLocators.newLaunch);
            helper.clickOnElement(NewLaunchLocators.newLaunch);
            Screenshot.takeScreenshot("New Launch");
            loggerHandler.logInfo("New Launch clicked");
            test.info("New Launch clicked");
            test.log(Status.PASS, "New Launch clicked");
        } catch (Exception e) {
            Reporter.addScreenshot("New Launch", test, "New Launch click Failed", driver);
            loggerHandler.logError("Click on New Launch failed");
            test.info("Click on New Launch failed");
            test.log(Status.FAIL, "Click on New Launch failed");
        }
    }

    /*
     * Method Name: verifyNewLaunch
     * Author Name: Sharmila Abdul
     * Description: Verifies the URL of the "New Launches" page.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyNewLaunch(ExtentTest test) {
        try {
            assertion.verifyUrl("https://avoncycles.com/category/new-launches.html");
            Screenshot.takeScreenshot("New Launch url");
            loggerHandler.logInfo("New Launch url verified");
            test.info("New Launch url verified");
            test.log(Status.PASS, "New Launch url verified");
        } catch (Exception e) {
            Reporter.addScreenshot("New Launch url", test, "New Launch url verification Failed", driver);
            loggerHandler.logError("New Launch url failed");
            test.info("New Launch url failed");
            test.log(Status.FAIL, "New Launch url failed");
        }
    }

    /*
     * Method Name: clickOnWishlist
     * Author Name: Sharmila Abdul
     * Description: Clicks on the wishlist icon and takes a screenshot.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOnWishlist(ExtentTest test) {
        try {
            helper.hoverOverElement(NewLaunchLocators.heartIcon);
            helper.clickOnElement(NewLaunchLocators.heartIcon);
            Screenshot.takeScreenshot("WishList");
            loggerHandler.logInfo("WishList Icon clicked");
            test.info("WishList Icon clicked");
            test.log(Status.PASS, "WishList Icon clicked");
        } catch (Exception e) {
            Reporter.addScreenshot("Wishlist", test, "Wishlist click Failed", driver);
            loggerHandler.logError("Click on wishlist failed");
            test.info("Click on wihslist failed");
            test.log(Status.FAIL, "Click on wishlist failed");
        }
    }

    /*
     * Method Name: switchLogin
     * Author Name: Sharmila Abdul
     * Description: Switches to the login window.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void switchLogin(ExtentTest test) {
        try {
            helper.switchWindow();
            Screenshot.takeScreenshot("Window switch");
            loggerHandler.logInfo("Window switched");
            test.info("Window switched");
            test.log(Status.PASS, "Window switched");
        } catch (Exception e) {
            Reporter.addScreenshot("Window switch", test, "Window switch", driver);
            loggerHandler.logError("Window swictch failed");
            test.info("Window switch failed");
            test.log(Status.FAIL, "Window switch failed");
        }
    }

    /*
     * Method Name: verifyLoginUrl
     * Author Name: Sharmila Abdul
     * Description: Verifies the URL of the login page.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyLoginUrl(ExtentTest test) {
        try {
            assertion.verifyUrl("https://avoncycles.com/customer/login.html");
            Screenshot.takeScreenshot("Login url");
            loggerHandler.logInfo("Login url verified");
            test.info("Login url verified");
            test.log(Status.PASS, "Login url verified");
        } catch (Exception e) {
            Reporter.addScreenshot("Login url", test, "Login url Failed", driver);
            loggerHandler.logError("Login url failed");
            test.info("Login url failed");
            test.log(Status.FAIL, "Login url failed");
        }
    }

    /*
     * Method Name: verifyLoginTitle
     * Author Name: Sharmila Abdul
     * Description: Verifies the title of the login page.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyLoginTitle(ExtentTest test) {
        try {
            assertion.verifyText(NewLaunchLocators.loginTitle, "Login Account");
            Screenshot.takeScreenshot("Login Title");
            loggerHandler.logInfo("Login Title verified");
            test.info("Login Title verified");
            test.log(Status.PASS, "Login Title verified");
        } catch (Exception e) {
            Reporter.addScreenshot("Login Title", test, "Login Title Failed", driver);
            loggerHandler.logError("Login Title failed");
            test.info("Login Title failed");
            test.log(Status.FAIL, "Login Title failed");
        }
    }

    /*
     * Method Name: enterLoginEmail
     * Author Name: Sharmila Abdul
     * Description: Enters the email address for login.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void enterLoginEmail(ExtentTest test) {
        try {
            helper.clickOnElement(NewLaunchLocators.email);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 0, 2);
            helper.typeInElement(NewLaunchLocators.email, value);
            Screenshot.takeScreenshot("Entered Email value");
            loggerHandler.logInfo("Entered Email value");
            test.info("Entered Email value");
            test.log(Status.PASS, "Entered Email value");
        } catch (Exception e) {
            Reporter.addScreenshot("Email", test, "Email input Failed", driver);
            loggerHandler.logError("Email input failed");
            test.info("Email input failed");
            test.log(Status.FAIL, "Email input failed");
        }

    }

    /*
     * Method Name: enterLoginPassword
     * Author Name: Sharmila Abdul
     * Description: Enters the password for login.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void enterLoginPassword(ExtentTest test) {
        try {
            helper.clickOnElement(NewLaunchLocators.password);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 1, 2);
            helper.typeInElement(NewLaunchLocators.password, value);
            Screenshot.takeScreenshot("Entered password value");
            loggerHandler.logInfo("Entered password value");
            test.info("Entered password value");
            test.log(Status.PASS, "Entered password value");
        } catch (Exception e) {
            Reporter.addScreenshot("Password", test, "Password input Failed", driver);
            loggerHandler.logError("Password input failed");
            test.info("Password input failed");
            test.log(Status.FAIL, "Password input failed");
        }
    }

    /*
     * Method Name: clickOnLogin
     * Author Name: Sharmila Abdul
     * Description: Clicks the login button.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOnLogin(ExtentTest test) {
        try {
            helper.hoverOverElement(NewLaunchLocators.login);
            helper.clickOnElement(NewLaunchLocators.login);
            Screenshot.takeScreenshot("Login");
            loggerHandler.logInfo("Login button clicked");
            test.info("Login button clicked");
            test.log(Status.PASS, "Login button clicked");
        } catch (Exception e) {
            Reporter.addScreenshot("Login", test, "Login button click Failed", driver);
            loggerHandler.logError("Click on Login failed");
            test.info("Click on Login failed");
            test.log(Status.FAIL, "Click on Login failed");
        }
    }

    /*
     * Method Name: verifyLoginError
     * Author Name: Sharmila Abdul
     * Description: Verifies the login error message.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyLoginError(ExtentTest test) {
        try {
            assertion.verifyText(NewLaunchLocators.errorMsg, "These credentials do not match our records.");
            Screenshot.takeScreenshot("Verify Login");
            loggerHandler.logInfo("Login error verified");
            test.info("Login error verified");
            test.log(Status.PASS, "Login error verified");
        } catch (Exception e) {
            Reporter.addScreenshot("Login verify", test, "Login verify Failed", driver);
            loggerHandler.logError("Login verify failed");
            test.info("Login verify failed");
            test.log(Status.FAIL, "Login verify failed");
        }
    }

    /*
     * Method Name: clickOnCreateAccount
     * Author Name: Sharmila Abdul
     * Description: Clicks on the "Create Account" link.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickOnCreateAccount(ExtentTest test) {
        try {
            helper.hoverOverElement(NewLaunchLocators.createAccount);
            helper.clickOnElement(NewLaunchLocators.createAccount);
            Screenshot.takeScreenshot("Create Account");
            loggerHandler.logInfo("Create Account link clicked");
            test.info("Create Account link clicked");
            test.log(Status.PASS, "Create Account link clicked");
        } catch (Exception e) {
            Reporter.addScreenshot("Create Account", test, "Create Account click Failed", driver);
            loggerHandler.logError("Create Account link click failed");
            test.info("Create Account link click failed");
            test.log(Status.FAIL, "Create Account link click failed");
        }
    }

    /*
     * Method Name: verifyRegisterUrl
     * Author Name: Sharmila Abdul
     * Description: Verifies the URL of the registration page.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void verifyRegisterUrl(ExtentTest test) {
        try {
            assertion.verifyUrl("https://avoncycles.com/customer/register.html");
            Screenshot.takeScreenshot("Register url");
            loggerHandler.logInfo("Register url verified");
            test.info("Register url verified");
            test.log(Status.PASS, "Register url verified");
        } catch (Exception e) {
            Reporter.addScreenshot("Register URL", test,"Register url Failed", driver);
            loggerHandler.logError("Register url failed");
            test.info("Register url failed");
            test.log(Status.FAIL, "Register url failed");
        }
    }

    /*
     * Method Name: enterFirstName
     * Author Name: Sharmila Abdul
     * Description: Enters the first name for registration.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void enterFirstName(ExtentTest test) {
        try {
            helper.clickOnElement(NewLaunchLocators.firstName);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 2, 2);
            helper.typeInElement(NewLaunchLocators.firstName, value);
            Screenshot.takeScreenshot("First name");
            loggerHandler.logInfo("Entered First Name value");
            test.info("Entered First Name value");
            test.log(Status.PASS, "Entered First Name value");
        } catch (Exception e) {
            Reporter.addScreenshot("First Name", test, "First name input Failed", driver);
            loggerHandler.logError("First Name input failed");
            test.info("First Name input failed");
            test.log(Status.FAIL, "First Name input failed");
        }
    }

    /*
     * Method Name: enterLastName
     * Author Name: Sharmila Abdul
     * Description: Enters the last name for registration.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void enterLastName(ExtentTest test) {
        try {
            helper.clickOnElement(NewLaunchLocators.lastName);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 3, 2);
            helper.typeInElement(NewLaunchLocators.lastName, value);
            Screenshot.takeScreenshot("Last name");
            loggerHandler.logInfo("Entered Last Name value");
            test.info("Entered Last Name value");
            test.log(Status.PASS, "Entered Last Name value");
        } catch (Exception e) {
            Reporter.addScreenshot("Last Name", test, "Last name input Failed", driver);
            loggerHandler.logError("Last Name input failed");
            test.info("Last name input failed");
            test.log(Status.FAIL, "Last Name input failed");
        }

    }

    /*
     * Method Name: enterRegisterEmail
     * Author Name: Sharmila Abdul
     * Description: Enters the email address for registration.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void enterRegisterEmail(ExtentTest test) {
        try {
            helper.clickOnElement(NewLaunchLocators.registerEmail);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 4, 2);
            helper.typeInElement(NewLaunchLocators.registerEmail, value);
            Screenshot.takeScreenshot("Email");
            loggerHandler.logInfo("Entered Email value");
            test.info("Entered Email Value");
            test.log(Status.PASS, "Entered Email value");
        } catch (Exception e) {
            Reporter.addScreenshot("Email", test, "Email input Failed", driver);
            loggerHandler.logError("Email input failed");
            test.info("Email input failed");
            test.log(Status.FAIL, "Email input failed");
        }

    }

    /*
     * Method Name: enterPhone
     * Author Name: Sharmila Abdul
     * Description: Enters the phone number for registration.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void enterPhone(ExtentTest test) {
        try {
            helper.clickOnElement(NewLaunchLocators.phone);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 5, 2);
            helper.typeInElement(NewLaunchLocators.phone, value);
            Screenshot.takeScreenshot("Phone");
            loggerHandler.logInfo("Entered Phone value");
            test.info("Entered Phone value");
            test.log(Status.PASS, "Entered Phone value");
        } catch (Exception e) {
            Reporter.addScreenshot("Phone", test, "Phone input Failed", driver);
            loggerHandler.logError("Phone input failed");
            test.info("Phone input failed");
            test.log(Status.FAIL, "Phone input failed");
        }

    }

    /*
     * Method Name: enterRegisterPassword
     * Author Name: Sharmila Abdul
     * Description: Enters the password for registration.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void enterRegisterPassword(ExtentTest test) {
        try {
            helper.clickOnElement(NewLaunchLocators.registerPassword);
            String value = ExcelReader.readData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 6, 2);
            helper.typeInElement(NewLaunchLocators.registerPassword, value);
            Screenshot.takeScreenshot("Password");
            loggerHandler.logInfo("Entered password value");
            test.info("Entered password value");
            test.log(Status.PASS, "Entered password value");
        } catch (Exception e) {
            Reporter.addScreenshot("Password", test, "Password input Failed", driver);
            loggerHandler.logError("Password input failed");
            test.info("Password input failed");
            test.log(Status.FAIL, "Password input failed");
        }

    }

    /*
     * Method Name: clickSignup
     * Author Name: Sharmila Abdul
     * Description: Clicks the sign-up button.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void clickSignup(ExtentTest test) {
        try {
            helper.hoverOverElement(NewLaunchLocators.signUp);
            helper.clickOnElement(NewLaunchLocators.signUp);
            Reporter.addScreenshot("Sign up", test, "Sign Up button click", driver);
            Screenshot.takeScreenshot("Sign Up");
            loggerHandler.logInfo("Sign Up button clicked");
            test.info("Sign Up button clicked");
            test.log(Status.PASS, "Sign Up button clicked");
        } catch (Exception e) {
            Reporter.addScreenshot("Sign up", test, "Sign Up button click Failed", driver);
            loggerHandler.logError("Click on Sign up failed");
            test.info("Click on Sign up failed");
            test.log(Status.FAIL, "Click on Sign up failed");
        }
    }

    /*
     * Method Name: testCase5
     * Author Name: Sharmila Abdul
     * Description: Executes the complete test case for new launches, login, and
     * registration.
     * Return type: void
     * Param List: ExtentTest test - The ExtentTest instance for logging.
     */
    public void testCase5(ExtentTest test) {
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

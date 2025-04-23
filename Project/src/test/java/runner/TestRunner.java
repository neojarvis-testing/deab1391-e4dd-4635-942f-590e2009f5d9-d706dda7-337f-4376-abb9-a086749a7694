package runner;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.AboutusActionsVenkat;
import pages.AccolodesActionsRam;
import pages.BusinessPageActions;
import pages.CambioActions;
import pages.CyclesPageActions;
import pages.FitnessMachineActions;
import pages.GearPageActions;
import pages.HomePageActionsRam;
import pages.HomePageActionsVenkat;
import pages.NewLaunchActions;
import utils.Base;
import utils.MailUtility;
import utils.Reporter;

public class TestRunner extends Base {
    ExtentReports report;
    ExtentTest test;
    HomePageActionsVenkat ha;
    AboutusActionsVenkat va;
    BusinessPageActions businesspageactions;
    CyclesPageActions cyclespageactions;

    @BeforeClass
    public void reports() {
        report = Reporter.createReport("Avon Cycles Report");
    }

    @BeforeMethod
    public void launch() throws MalformedURLException {
        openBrowser();
    }

    
/*
 * Method Name: testCase1
 * Author Name: Pragna
 * Description: Tests the Gear Search functionality.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

    @Test
    public void testCase1(){
        test = report.createTest("TC01_Gear Search functionality");
        GearPageActions ga = new GearPageActions();
        ga.testGear(test);
    }

    
/*
 * Method Name: testCase2
 * Author Name: Ramavathar
 * Description: Tests the Electric Bikes functionality.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

    @Test
    public void testCase2() {
        test = report.createTest("TC02_Electric Bikes");
        HomePageActionsRam hpa = new HomePageActionsRam();
        hpa.test1(test);

    }

    
/*
 * Method Name: testcase3
 * Author Name: Venkat
 * Description: Tests the Cycles by Brand functionality.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

    @Test
    public void testcase3() {
        test = report.createTest("TC03_Cycles by Brand");
        ha = new HomePageActionsVenkat(test);
        ha.testAll();
    }

    
/*
 * Method Name: testcase4
 * Author Name: Anjani
 * Description: Tests the International Business.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

 @Test
    public void testcase4() {
        test = report.createTest("TC04_International Business");
        businesspageactions = new BusinessPageActions(test);
        businesspageactions.testCase4();
    }

    
/*
 * Method Name: testCase5
 * Author Name: Sharmila Abdul
 * Description: Tests the User registration & Login functionality.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

    @Test
    public void testCase5() {
        test = report.createTest("TC05_User registration & Login");
        NewLaunchActions newlaunch = new NewLaunchActions();
        newlaunch.testCase5(test);
    }
    
    
/*
 * Method Name: testCase6
 * Author Name: Pragna
 * Description: Tests the Fitness Machines functionality.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

    @Test
    public void testCase6(){
        test = report.createTest("TC06_Fitness Machines");
        FitnessMachineActions ga = new FitnessMachineActions();
        ga.testFitnessMachines(test);

    }
    
    
/*
 * Method Name: testCase7
 * Author Name: Ramavathar
 * Description: Tests the Blogs and Awards functionality.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

    @Test
    public void testCase7() {
        test = report.createTest("TC07_Blogs and Awards");
        AccolodesActionsRam aar = new AccolodesActionsRam();
        aar.test2(test);
    }

    
/*
 * Method Name: testcase8
 * Author Name: Venkat
 * Description: Tests the About Avon functionality.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

 @Test
    public void testcase8() {
        test = report.createTest("TC08_About Avon");
        va = new AboutusActionsVenkat(test);
        va.testAll();

    }


    
/*
 * Method Name: testcase9
 * Author Name: Anjani
 * Description: Tests the Filtered Search functionality.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

    @Test
    public void testcase9() {
        test = report.createTest("TC09_Filtered Search");
        cyclespageactions = new CyclesPageActions(test);
        cyclespageactions.testCase9();
    }

    
/*
 * Method Name: testCase10
 * Author Name: Sharmila Abdul
 * Description: Tests the Cambio Bikes functionality.
 * Return type: void
 * Param List: ExtentTest test - The ExtentTest instance for logging.
 */

    @Test
    public void testCase10() {
        test = report.createTest("TC10_Cambio Bikes");
        CambioActions cambio = new CambioActions();
        cambio.testCase10(test);
    }

    @AfterMethod
    public void tear() {
        driver.quit();
    }

    @AfterClass
    public void saveReports() {
        report.flush();
        String reportPath = System.getProperty("user.dir") + "/reports/Avon Cycles Report_" + new SimpleDateFormat("2025.04.23.13.51.36").format(new Date())+ ".html";
		MailUtility.sendEmail("tulasiramk66.tr@gmail.com","Report","Report Test",reportPath);
    }

}

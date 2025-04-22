 package runner;
 
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
    public void launch() {
        openBrowser();
    }
 
    @Test
    public void testCase2() {
        test = report.createTest("Test Case 02");
        HomePageActionsRam hpa = new HomePageActionsRam();
        hpa.test1(test);
 
    }
 
    @Test
    public void testCase7() {
        test = report.createTest("Test Case 07");
        AccolodesActionsRam aar = new AccolodesActionsRam();
        aar.test2(test);
    }
 
    @Test
    public void testcase3() {
        test = report.createTest("testcase3");
        ha = new HomePageActionsVenkat(test);
        ha.testAll();
    }
 
    @Test
    public void testcase4() {
        test = report.createTest("testcase8");
        va = new AboutusActionsVenkat(test);
        va.testAll();
 
    }
 
    @Test
    public void test10() {
        test = report.createTest("Cambio Bikes");
        CambioActions cambio = new CambioActions();
        cambio.testCase10(test);
    }
 
    @Test
    public void test5() {
        test = report.createTest("User registration & Login");
        NewLaunchActions newlaunch = new NewLaunchActions();
        newlaunch.testCase5(test);
    }
 
    @Test
    public void testCase1(){
        test = report.createTest("testcase1");
        GearPageActions ga = new GearPageActions();
        ga.testGear(test);
    }
 
    @Test
    public void testCase6(){
        test = report.createTest("testcase6");
        FitnessMachineActions ga = new FitnessMachineActions();
        ga.testFitnessMachines(test);
 
    }
 
    @Test
    public void testcase8() {
        test = report.createTest("Test Case 4");
        businesspageactions = new BusinessPageActions(test);
        businesspageactions.testCase4();
    }
 
    @Test
    public void testcase9() {
        test = report.createTest("Test Case 9");
        cyclespageactions = new CyclesPageActions(test);
        cyclespageactions.testCase9();
    }
 
    @AfterMethod
    public void tear() {
        driver.quit();
    }
 
    @AfterClass
    public void saveReports() {
        report.flush();
    }
 
}
 
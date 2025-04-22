package runner;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.FitnessMachineActions;
import pages.GearPageActions;
import utils.Base;
import utils.Reporter;


public class TestRunner extends Base { 
    ExtentReports report;
    ExtentTest test;

    @BeforeMethod 
    public void launch(){
        openBrowser();
        report= Reporter.createReport("Sample report");
        // test = report.createTest("Sam");
    } 

    @Test
    public void testCase1()throws InterruptedException{ 
        test=report.createTest("testcase1");
        GearPageActions ga=new GearPageActions();
        ga.testGear(test);
    } 
    @Test
    public void testCase2()throws InterruptedException{ 
        test=report.createTest("testcase2");
        FitnessMachineActions ga=new FitnessMachineActions();        
        ga.testFitnessMachines(test);

    } 

    @AfterMethod
    public void tear(){
        report.flush();
        driver.quit();
    }

}

package runner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.AboutusActionsVenkat;
import pages.HomePageActionsVenkat;
import utils.Base;
import utils.Reporter;


public class TestRunner extends Base { 
    ExtentReports report;
    ExtentTest test;
    HomePageActionsVenkat ha;
    AboutusActionsVenkat va;


    @BeforeClass
    public void generatereport(){
        report=Reporter.createReport("Team_04");
    }

    @BeforeMethod 
    public void launch(){
        openBrowser();
    } 

    @Test
    public void testcase3(){ 
        test=report.createTest("testcase3");
        ha=new HomePageActionsVenkat(test);
        ha.testAll();
    } 

    @Test
    public void testcase8(){
        test=report.createTest("testcase8");
        va=new AboutusActionsVenkat(test);
        va.testAll();

    }

    @AfterMethod
    public void tear(){
        driver.quit();
    }

    @AfterClass
    public void flush(){
        report.flush();
    }

}

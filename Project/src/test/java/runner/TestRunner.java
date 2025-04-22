package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.CambioActions;
import pages.NewLaunchActions;
import utils.Base;
import utils.Reporter;

public class TestRunner extends Base { 
    ExtentReports report;
    ExtentTest test;

    @BeforeClass
    public void reports()
    {
        report= Reporter.createReport("Avon cycles report");
    }

    @BeforeMethod 
    public void launch(){
        openBrowser();
    } 

    @Test
    public void test10()
    { 
        test = report.createTest("Cambio Bikes");
        CambioActions cambio = new CambioActions();
        cambio.testCase10(test);
    } 

    @Test
    public void test5()
    { 
        test = report.createTest("User registration & Login");
        NewLaunchActions newlaunch = new NewLaunchActions();
        newlaunch.testCase5(test);
    } 

    @AfterMethod
    public void tear()
    {
        driver.quit();
    }

    @AfterClass
    public void saveReports()
    {
        report.flush();
    }

}

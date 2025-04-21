package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.HomePageActionsVenkat;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;

public class TestRunner extends Base { 
    ExtentReports report;
    ExtentTest test;
    HomePageActionsVenkat ha;


    @BeforeClass
    public void generatereport(){
        report=Reporter.createReport("Team_04");
    }

    @BeforeMethod 
    public void launch(){
        openBrowser();
    } 

    @Test
    public void test3()throws InterruptedException{ 
        test=report.createTest("testcase3");
        ha=new HomePageActionsVenkat(test);
        ha.testAll();
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

package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;

public class TestRunner extends Base { 
    ExtentReports report;
    ExtentTest test;

    @BeforeMethod 
    public void launch(){
        openBrowser();
        report= Reporter.createReport("Sample report");
        test = report.createTest("Sam");
    } 

    @Test
    public void test1()throws InterruptedException{ 
        WebElement ele = driver.findElement(By.xpath("//a[text()='Contact']"));
        ele.click();
        Thread.sleep(5000);
        Screenshot.takeScreenshot("sample");
        LoggerHandler.logInfo("Sharmila");
        test.info("Sharmila");
        test.log(Status.PASS,"Hello");
        Reporter.addScreenshot("Sampleee", test, "S", driver);
    } 

    @AfterMethod
    public void tear(){
        report.flush();
        driver.quit();
    }

}
